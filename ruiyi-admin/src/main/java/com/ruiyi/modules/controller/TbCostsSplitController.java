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
import com.ruiyi.modules.domain.TbCostsSplit;
import com.ruiyi.modules.service.ITbCostsSplitService;
import com.ruiyi.common.utils.poi.ExcelUtil;
import com.ruiyi.common.core.page.TableDataInfo;

/**
 * 电芯能源传品拆分Controller
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/modules/split")
public class TbCostsSplitController extends BaseController
{
    @Autowired
    private ITbCostsSplitService tbCostsSplitService;

    /**
     * 查询电芯能源传品拆分列表
     */
    @PreAuthorize("@ss.hasPermi('modules:split:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbCostsSplit tbCostsSplit)
    {
        startPage();
        List<TbCostsSplit> list = tbCostsSplitService.selectTbCostsSplitList(tbCostsSplit);
        return getDataTable(list);
    }

    /**
     * 导出电芯能源传品拆分列表
     */
    @PreAuthorize("@ss.hasPermi('modules:split:export')")
    @Log(title = "电芯能源传品拆分", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbCostsSplit tbCostsSplit)
    {
        List<TbCostsSplit> list = tbCostsSplitService.selectTbCostsSplitList(tbCostsSplit);
        ExcelUtil<TbCostsSplit> util = new ExcelUtil<TbCostsSplit>(TbCostsSplit.class);
        util.exportExcel(response, list, "电芯能源传品拆分数据");
    }

    /**
     * 获取电芯能源传品拆分详细信息
     */
    @PreAuthorize("@ss.hasPermi('modules:split:query')")
    @GetMapping(value = "/{cellId}")
    public AjaxResult getInfo(@PathVariable("cellId") Long cellId)
    {
        return AjaxResult.success(tbCostsSplitService.selectTbCostsSplitByCellId(cellId));
    }

    /**
     * 新增电芯能源传品拆分
     */
    @PreAuthorize("@ss.hasPermi('modules:split:add')")
    @Log(title = "电芯能源传品拆分", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbCostsSplit tbCostsSplit)
    {
        return toAjax(tbCostsSplitService.insertTbCostsSplit(tbCostsSplit));
    }

    /**
     * 修改电芯能源传品拆分
     */
    @PreAuthorize("@ss.hasPermi('modules:split:edit')")
    @Log(title = "电芯能源传品拆分", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbCostsSplit tbCostsSplit)
    {
        return toAjax(tbCostsSplitService.updateTbCostsSplit(tbCostsSplit));
    }

    /**
     * 删除电芯能源传品拆分
     */
    @PreAuthorize("@ss.hasPermi('modules:split:remove')")
    @Log(title = "电芯能源传品拆分", businessType = BusinessType.DELETE)
	@DeleteMapping("/{cellIds}")
    public AjaxResult remove(@PathVariable Long[] cellIds)
    {
        return toAjax(tbCostsSplitService.deleteTbCostsSplitByCellIds(cellIds));
    }
}
