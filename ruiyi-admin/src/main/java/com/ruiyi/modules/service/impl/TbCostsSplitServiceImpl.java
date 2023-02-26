package com.ruiyi.modules.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruiyi.modules.mapper.TbCostsSplitMapper;
import com.ruiyi.modules.domain.TbCostsSplit;
import com.ruiyi.modules.service.ITbCostsSplitService;

/**
 * 电芯能源传品拆分Service业务层处理
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
@Service
public class TbCostsSplitServiceImpl implements ITbCostsSplitService 
{
    @Autowired
    private TbCostsSplitMapper tbCostsSplitMapper;

    /**
     * 查询电芯能源传品拆分
     * 
     * @param cellId 电芯能源传品拆分主键
     * @return 电芯能源传品拆分
     */
    @Override
    public TbCostsSplit selectTbCostsSplitByCellId(Long cellId)
    {
        return tbCostsSplitMapper.selectTbCostsSplitByCellId(cellId);
    }

    /**
     * 查询电芯能源传品拆分列表
     * 
     * @param tbCostsSplit 电芯能源传品拆分
     * @return 电芯能源传品拆分
     */
    @Override
    public List<TbCostsSplit> selectTbCostsSplitList(TbCostsSplit tbCostsSplit)
    {
        return tbCostsSplitMapper.selectTbCostsSplitList(tbCostsSplit);
    }

    /**
     * 新增电芯能源传品拆分
     * 
     * @param tbCostsSplit 电芯能源传品拆分
     * @return 结果
     */
    @Override
    public int insertTbCostsSplit(TbCostsSplit tbCostsSplit)
    {
        return tbCostsSplitMapper.insertTbCostsSplit(tbCostsSplit);
    }

    /**
     * 修改电芯能源传品拆分
     * 
     * @param tbCostsSplit 电芯能源传品拆分
     * @return 结果
     */
    @Override
    public int updateTbCostsSplit(TbCostsSplit tbCostsSplit)
    {
        return tbCostsSplitMapper.updateTbCostsSplit(tbCostsSplit);
    }

    /**
     * 批量删除电芯能源传品拆分
     * 
     * @param cellIds 需要删除的电芯能源传品拆分主键
     * @return 结果
     */
    @Override
    public int deleteTbCostsSplitByCellIds(Long[] cellIds)
    {
        return tbCostsSplitMapper.deleteTbCostsSplitByCellIds(cellIds);
    }

    /**
     * 删除电芯能源传品拆分信息
     * 
     * @param cellId 电芯能源传品拆分主键
     * @return 结果
     */
    @Override
    public int deleteTbCostsSplitByCellId(Long cellId)
    {
        return tbCostsSplitMapper.deleteTbCostsSplitByCellId(cellId);
    }
}
