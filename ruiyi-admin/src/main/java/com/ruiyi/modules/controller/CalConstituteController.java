package com.ruiyi.modules.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruiyi.modules.domain.CalConstitute;
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
import com.ruiyi.modules.service.ICalConstituteService;
import com.ruiyi.common.utils.poi.ExcelUtil;
import com.ruiyi.common.core.page.TableDataInfo;

/**
 * 计算后的电芯/锂带/盖组Controller
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/modules/constitute")
public class CalConstituteController extends BaseController
{
    @Autowired
    private ICalConstituteService calConstituteService;

    /**
     * 查询计算后的电芯/锂带/盖组列表
     */
    @PreAuthorize("@ss.hasPermi('modules:constitute:list')")
    @GetMapping("/list")
    public TableDataInfo list(CalConstitute calConstitute)
    {
        startPage();
        List<CalConstitute> list = calConstituteService.selectCalConstituteList(calConstitute);
        return getDataTable(list);
    }

    /**
     * 导出计算后的电芯/锂带/盖组列表
     */
    @PreAuthorize("@ss.hasPermi('modules:constitute:export')")
    @Log(title = "计算后的电芯/锂带/盖组", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CalConstitute calConstitute)
    {
        List<CalConstitute> list = calConstituteService.selectCalConstituteList(calConstitute);
        ExcelUtil<CalConstitute> util = new ExcelUtil<CalConstitute>(CalConstitute.class);
        util.exportExcel(response, list, "计算后的电芯.锂带.盖组数据");
    }

    /**
     * 获取计算后的电芯/锂带/盖组详细信息
     */
    @PreAuthorize("@ss.hasPermi('modules:constitute:query')")
    @GetMapping(value = "/{constituteId}")
    public AjaxResult getInfo(@PathVariable("constituteId") Long constituteId)
    {
        return AjaxResult.success(calConstituteService.selectCalConstituteByConstituteId(constituteId));
    }

    /**
     * 新增计算后的电芯/锂带/盖组
     */
    @PreAuthorize("@ss.hasPermi('modules:constitute:add')")
    @Log(title = "计算后的电芯/锂带/盖组", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CalConstitute calConstitute)
    {
        return toAjax(calConstituteService.insertCalConstitute(calConstitute));
    }

    /**
     * 修改计算后的电芯/锂带/盖组
     */
    @PreAuthorize("@ss.hasPermi('modules:constitute:edit')")
    @Log(title = "计算后的电芯/锂带/盖组", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CalConstitute calConstitute)
    {
        return toAjax(calConstituteService.updateCalConstitute(calConstitute));
    }

    /**
     * 删除计算后的电芯/锂带/盖组
     */
    @PreAuthorize("@ss.hasPermi('modules:constitute:remove')")
    @Log(title = "计算后的电芯/锂带/盖组", businessType = BusinessType.DELETE)
	@DeleteMapping("/{constituteIds}")
    public AjaxResult remove(@PathVariable Long[] constituteIds)
    {
        return toAjax(calConstituteService.deleteCalConstituteByConstituteIds(constituteIds));
    }
}
