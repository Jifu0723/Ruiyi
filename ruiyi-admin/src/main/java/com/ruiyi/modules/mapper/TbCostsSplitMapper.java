package com.ruiyi.modules.mapper;

import java.util.List;
import com.ruiyi.modules.domain.TbCostsSplit;

/**
 * 电芯能源传品拆分Mapper接口
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
public interface TbCostsSplitMapper 
{
    /**
     * 查询电芯能源传品拆分
     * 
     * @param cellId 电芯能源传品拆分主键
     * @return 电芯能源传品拆分
     */
    public TbCostsSplit selectTbCostsSplitByCellId(Long cellId);

    /**
     * 查询电芯能源传品拆分列表
     * 
     * @param tbCostsSplit 电芯能源传品拆分
     * @return 电芯能源传品拆分集合
     */
    public List<TbCostsSplit> selectTbCostsSplitList(TbCostsSplit tbCostsSplit);

    /**
     * 新增电芯能源传品拆分
     * 
     * @param tbCostsSplit 电芯能源传品拆分
     * @return 结果
     */
    public int insertTbCostsSplit(TbCostsSplit tbCostsSplit);

    /**
     * 修改电芯能源传品拆分
     * 
     * @param tbCostsSplit 电芯能源传品拆分
     * @return 结果
     */
    public int updateTbCostsSplit(TbCostsSplit tbCostsSplit);

    /**
     * 删除电芯能源传品拆分
     * 
     * @param cellId 电芯能源传品拆分主键
     * @return 结果
     */
    public int deleteTbCostsSplitByCellId(Long cellId);

    /**
     * 批量删除电芯能源传品拆分
     * 
     * @param cellIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbCostsSplitByCellIds(Long[] cellIds);
}
