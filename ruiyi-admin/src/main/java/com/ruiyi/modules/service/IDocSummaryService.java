package com.ruiyi.modules.service;

import java.util.List;
import com.ruiyi.modules.domain.DocSummary;

/**
 * 完工产品成本汇总Service接口
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
public interface IDocSummaryService 
{
    /**
     * 查询完工产品成本汇总
     * 
     * @param summaryId 完工产品成本汇总主键
     * @return 完工产品成本汇总
     */
    public DocSummary selectDocSummaryBySummaryId(Long summaryId);

    /**
     * 查询完工产品成本汇总列表
     * 
     * @param docSummary 完工产品成本汇总
     * @return 完工产品成本汇总集合
     */
    public List<DocSummary> selectDocSummaryList(DocSummary docSummary);

    /**
     * 新增完工产品成本汇总
     * 
     * @param docSummary 完工产品成本汇总
     * @return 结果
     */
    public int insertDocSummary(DocSummary docSummary);

    /**
     * 修改完工产品成本汇总
     * 
     * @param docSummary 完工产品成本汇总
     * @return 结果
     */
    public int updateDocSummary(DocSummary docSummary);

    /**
     * 批量删除完工产品成本汇总
     * 
     * @param summaryIds 需要删除的完工产品成本汇总主键集合
     * @return 结果
     */
    public int deleteDocSummaryBySummaryIds(Long[] summaryIds);

    /**
     * 删除完工产品成本汇总信息
     * 
     * @param summaryId 完工产品成本汇总主键
     * @return 结果
     */
    public int deleteDocSummaryBySummaryId(Long summaryId);
}
