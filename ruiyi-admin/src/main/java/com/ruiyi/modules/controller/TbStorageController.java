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
import com.ruiyi.modules.domain.TbStorage;
import com.ruiyi.modules.service.ITbStorageService;
import com.ruiyi.common.utils.poi.ExcelUtil;
import com.ruiyi.common.core.page.TableDataInfo;

/**
 * 产品入库单列Controller
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/modules/storage")
public class TbStorageController extends BaseController
{
    @Autowired
    private ITbStorageService tbStorageService;

    /**
     * 查询产品入库单列列表
     */
    @PreAuthorize("@ss.hasPermi('modules:storage:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbStorage tbStorage)
    {
        startPage();
        List<TbStorage> list = tbStorageService.selectTbStorageList(tbStorage);
        return getDataTable(list);
    }

    /**
     * 导出产品入库单列列表
     */
    @PreAuthorize("@ss.hasPermi('modules:storage:export')")
    @Log(title = "产品入库单列", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbStorage tbStorage)
    {
        List<TbStorage> list = tbStorageService.selectTbStorageList(tbStorage);
        ExcelUtil<TbStorage> util = new ExcelUtil<TbStorage>(TbStorage.class);
        util.exportExcel(response, list, "产品入库单列数据");
    }

    /**
     * 获取产品入库单列详细信息
     */
    @PreAuthorize("@ss.hasPermi('modules:storage:query')")
    @GetMapping(value = "/{StorageId}")
    public AjaxResult getInfo(@PathVariable("StorageId") Long StorageId)
    {
        return AjaxResult.success(tbStorageService.selectTbStorageByStorageId(StorageId));
    }

    /**
     * 新增产品入库单列
     */
    @PreAuthorize("@ss.hasPermi('modules:storage:add')")
    @Log(title = "产品入库单列", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbStorage tbStorage)
    {
        return toAjax(tbStorageService.insertTbStorage(tbStorage));
    }

    /**
     * 修改产品入库单列
     */
    @PreAuthorize("@ss.hasPermi('modules:storage:edit')")
    @Log(title = "产品入库单列", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbStorage tbStorage)
    {
        return toAjax(tbStorageService.updateTbStorage(tbStorage));
    }

    /**
     * 删除产品入库单列
     */
    @PreAuthorize("@ss.hasPermi('modules:storage:remove')")
    @Log(title = "产品入库单列", businessType = BusinessType.DELETE)
	@DeleteMapping("/{StorageIds}")
    public AjaxResult remove(@PathVariable Long[] StorageIds)
    {
        return toAjax(tbStorageService.deleteTbStorageByStorageIds(StorageIds));
    }
}
