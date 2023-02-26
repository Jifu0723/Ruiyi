package com.ruiyi.modules.service;

import java.util.List;
import com.ruiyi.modules.domain.TbStorage;

/**
 * 产品入库单列Service接口
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
public interface ITbStorageService 
{
    /**
     * 查询产品入库单列
     * 
     * @param StorageId 产品入库单列主键
     * @return 产品入库单列
     */
    public TbStorage selectTbStorageByStorageId(Long StorageId);

    /**
     * 查询产品入库单列列表
     * 
     * @param tbStorage 产品入库单列
     * @return 产品入库单列集合
     */
    public List<TbStorage> selectTbStorageList(TbStorage tbStorage);

    /**
     * 新增产品入库单列
     * 
     * @param tbStorage 产品入库单列
     * @return 结果
     */
    public int insertTbStorage(TbStorage tbStorage);

    /**
     * 修改产品入库单列
     * 
     * @param tbStorage 产品入库单列
     * @return 结果
     */
    public int updateTbStorage(TbStorage tbStorage);

    /**
     * 批量删除产品入库单列
     * 
     * @param StorageIds 需要删除的产品入库单列主键集合
     * @return 结果
     */
    public int deleteTbStorageByStorageIds(Long[] StorageIds);

    /**
     * 删除产品入库单列信息
     * 
     * @param StorageId 产品入库单列主键
     * @return 结果
     */
    public int deleteTbStorageByStorageId(Long StorageId);
}
