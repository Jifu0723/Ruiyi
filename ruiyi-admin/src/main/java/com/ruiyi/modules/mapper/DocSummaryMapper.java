package com.ruiyi.modules.mapper;

import java.util.List;
import com.ruiyi.modules.domain.DocSummary;

/**
 * 完工产品成本汇总Mapper接口
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
public interface DocSummaryMapper 
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
     * 新增完工产品成本列表
     *
     * @param docSummaryList 完工产品成本列表
     * @return 结果
     */
    public int insertDocSummarys(List<DocSummary> docSummaryList);

    /**
     * 修改完工产品成本汇总
     * 
     * @param docSummary 完工产品成本汇总
     * @return 结果
     */
    public int updateDocSummary(DocSummary docSummary);

    /**
     * 删除完工产品成本汇总
     * 
     * @param summaryId 完工产品成本汇总主键
     * @return 结果
     */
    public int deleteDocSummaryBySummaryId(Long summaryId);

    /**
     * 批量删除完工产品成本汇总
     * 
     * @param summaryIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDocSummaryBySummaryIds(Long[] summaryIds);
}
