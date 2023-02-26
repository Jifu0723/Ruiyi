package com.ruiyi.modules.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruiyi.modules.mapper.DocSummaryMapper;
import com.ruiyi.modules.domain.DocSummary;
import com.ruiyi.modules.service.IDocSummaryService;

/**
 * 完工产品成本汇总Service业务层处理
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
@Service
public class DocSummaryServiceImpl implements IDocSummaryService 
{
    @Autowired
    private DocSummaryMapper docSummaryMapper;

    /**
     * 查询完工产品成本汇总
     * 
     * @param summaryId 完工产品成本汇总主键
     * @return 完工产品成本汇总
     */
    @Override
    public DocSummary selectDocSummaryBySummaryId(Long summaryId)
    {
        return docSummaryMapper.selectDocSummaryBySummaryId(summaryId);
    }

    /**
     * 查询完工产品成本汇总列表
     * 
     * @param docSummary 完工产品成本汇总
     * @return 完工产品成本汇总
     */
    @Override
    public List<DocSummary> selectDocSummaryList(DocSummary docSummary)
    {
        return docSummaryMapper.selectDocSummaryList(docSummary);
    }

    /**
     * 新增完工产品成本汇总
     * 
     * @param docSummary 完工产品成本汇总
     * @return 结果
     */
    @Override
    public int insertDocSummary(DocSummary docSummary)
    {
        return docSummaryMapper.insertDocSummary(docSummary);
    }

    /**
     * 修改完工产品成本汇总
     * 
     * @param docSummary 完工产品成本汇总
     * @return 结果
     */
    @Override
    public int updateDocSummary(DocSummary docSummary)
    {
        return docSummaryMapper.updateDocSummary(docSummary);
    }

    /**
     * 批量删除完工产品成本汇总
     * 
     * @param summaryIds 需要删除的完工产品成本汇总主键
     * @return 结果
     */
    @Override
    public int deleteDocSummaryBySummaryIds(Long[] summaryIds)
    {
        return docSummaryMapper.deleteDocSummaryBySummaryIds(summaryIds);
    }

    /**
     * 删除完工产品成本汇总信息
     * 
     * @param summaryId 完工产品成本汇总主键
     * @return 结果
     */
    @Override
    public int deleteDocSummaryBySummaryId(Long summaryId)
    {
        return docSummaryMapper.deleteDocSummaryBySummaryId(summaryId);
    }
}
