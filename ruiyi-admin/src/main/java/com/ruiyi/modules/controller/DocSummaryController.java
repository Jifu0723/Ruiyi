package com.ruiyi.modules.controller;

import java.io.IOException;
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
import com.ruiyi.modules.domain.DocSummary;
import com.ruiyi.modules.service.IDocSummaryService;
import com.ruiyi.common.utils.poi.ExcelUtil;
import com.ruiyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 完工产品成本汇总Controller
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/modules/summary")
public class DocSummaryController extends BaseController
{
    @Autowired
    private IDocSummaryService docSummaryService;

    /**
     * 查询完工产品成本汇总列表
     */
    @PreAuthorize("@ss.hasPermi('modules:summary:list')")
    @GetMapping("/list")
    public TableDataInfo list(DocSummary docSummary)
    {
        startPage();
        List<DocSummary> list = docSummaryService.selectDocSummaryList(docSummary);
        return getDataTable(list);
    }

    /**
     * 导出完工产品成本汇总列表
     */
    @PreAuthorize("@ss.hasPermi('modules:summary:export')")
    @Log(title = "完工产品成本汇总", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DocSummary docSummary)
    {
        List<DocSummary> list = docSummaryService.selectDocSummaryList(docSummary);
        ExcelUtil<DocSummary> util = new ExcelUtil<DocSummary>(DocSummary.class);
        util.exportExcel(response, list, "完工产品成本汇总数据");
    }

    /**
     * 导入完工产品成本汇总列表
     */
    @PreAuthorize("@ss.hasPermi('modules:summary:export')")
    @Log(title = "完工产品成本汇总", businessType = BusinessType.EXPORT)
    @PostMapping("/importData")
    public void importData(MultipartFile file, DocSummary docSummary) throws Exception {
        ExcelUtil<DocSummary> util = new ExcelUtil<DocSummary>(DocSummary.class);
        List<DocSummary> docSummaryList = util.importExcel(file.getInputStream());
        System.out.println(docSummaryList);
        System.out.println(docSummaryList.size());
    }

    /**
     * 获取完工产品成本汇总详细信息
     */
    @PreAuthorize("@ss.hasPermi('modules:summary:query')")
    @GetMapping(value = "/{summaryId}")
    public AjaxResult getInfo(@PathVariable("summaryId") Long summaryId)
    {
        return AjaxResult.success(docSummaryService.selectDocSummaryBySummaryId(summaryId));
    }

    /**
     * 新增完工产品成本汇总
     */
    @PreAuthorize("@ss.hasPermi('modules:summary:add')")
    @Log(title = "完工产品成本汇总", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DocSummary docSummary)
    {
        return toAjax(docSummaryService.insertDocSummary(docSummary));
    }

    /**
     * 修改完工产品成本汇总
     */
    @PreAuthorize("@ss.hasPermi('modules:summary:edit')")
    @Log(title = "完工产品成本汇总", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DocSummary docSummary)
    {
        return toAjax(docSummaryService.updateDocSummary(docSummary));
    }

    /**
     * 删除完工产品成本汇总
     */
    @PreAuthorize("@ss.hasPermi('modules:summary:remove')")
    @Log(title = "完工产品成本汇总", businessType = BusinessType.DELETE)
	@DeleteMapping("/{summaryIds}")
    public AjaxResult remove(@PathVariable Long[] summaryIds)
    {
        return toAjax(docSummaryService.deleteDocSummaryBySummaryIds(summaryIds));
    }

    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        ExcelUtil<DocSummary> util = new ExcelUtil<DocSummary>(DocSummary.class);
        util.importTemplateExcel(response, "完工产品成本汇总数据");
    }
}
