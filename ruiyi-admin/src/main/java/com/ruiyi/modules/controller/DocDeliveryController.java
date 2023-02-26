package com.ruiyi.modules.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruiyi.common.annotation.Log;
import com.ruiyi.common.core.controller.BaseController;
import com.ruiyi.common.core.domain.AjaxResult;
import com.ruiyi.common.enums.BusinessType;
import com.ruiyi.modules.domain.DocDelivery;
import com.ruiyi.modules.service.IDocDeliveryService;
import com.ruiyi.common.utils.poi.ExcelUtil;
import com.ruiyi.common.core.page.TableDataInfo;

/**
 * 材料出库单列Controller
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/modules/delivery")
public class DocDeliveryController extends BaseController
{
    @Autowired
    private IDocDeliveryService docDeliveryService;

    /**
     * 查询材料出库单列列表
     */
    @PreAuthorize("@ss.hasPermi('modules:delivery:list')")
    @GetMapping("/list")
    public TableDataInfo list(DocDelivery docDelivery)
    {
        startPage();
        List<DocDelivery> list = docDeliveryService.selectDocDeliveryList(docDelivery);
        return getDataTable(list);
    }

    /**
     * 导出材料出库单列列表
     */
    @PreAuthorize("@ss.hasPermi('modules:delivery:export')")
    @Log(title = "材料出库单列", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DocDelivery docDelivery)
    {
        List<DocDelivery> list = docDeliveryService.selectDocDeliveryList(docDelivery);
        ExcelUtil<DocDelivery> util = new ExcelUtil<DocDelivery>(DocDelivery.class);
        util.exportExcel(response, list, "材料出库单列数据");
    }

    /**
     * 获取材料出库单列详细信息
     */
    @PreAuthorize("@ss.hasPermi('modules:delivery:query')")
    @GetMapping(value = "/{deliveryId}")
    public AjaxResult getInfo(@PathVariable("deliveryId") Long deliveryId)
    {
        return AjaxResult.success(docDeliveryService.selectDocDeliveryByDeliveryId(deliveryId));
    }

    /**
     * 新增材料出库单列
     */
    @PreAuthorize("@ss.hasPermi('modules:delivery:add')")
    @Log(title = "材料出库单列", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DocDelivery docDelivery)
    {
        return toAjax(docDeliveryService.insertDocDelivery(docDelivery));
    }

    /**
     * 修改材料出库单列
     */
    @PreAuthorize("@ss.hasPermi('modules:delivery:edit')")
    @Log(title = "材料出库单列", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DocDelivery docDelivery)
    {
        return toAjax(docDeliveryService.updateDocDelivery(docDelivery));
    }

    /**
     * 删除材料出库单列
     */
    @PreAuthorize("@ss.hasPermi('modules:delivery:remove')")
    @Log(title = "材料出库单列", businessType = BusinessType.DELETE)
	@DeleteMapping("/{deliveryIds}")
    public AjaxResult remove(@PathVariable Long[] deliveryIds)
    {
        return toAjax(docDeliveryService.deleteDocDeliveryByDeliveryIds(deliveryIds));
    }
}
