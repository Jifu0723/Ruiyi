package com.ruiyi.modules.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruiyi.modules.mapper.TbStorageMapper;
import com.ruiyi.modules.domain.TbStorage;
import com.ruiyi.modules.service.ITbStorageService;

/**
 * 产品入库单列Service业务层处理
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
@Service
public class TbStorageServiceImpl implements ITbStorageService 
{
    @Autowired
    private TbStorageMapper tbStorageMapper;

    /**
     * 查询产品入库单列
     * 
     * @param StorageId 产品入库单列主键
     * @return 产品入库单列
     */
    @Override
    public TbStorage selectTbStorageByStorageId(Long StorageId)
    {
        return tbStorageMapper.selectTbStorageByStorageId(StorageId);
    }

    /**
     * 查询产品入库单列列表
     * 
     * @param tbStorage 产品入库单列
     * @return 产品入库单列
     */
    @Override
    public List<TbStorage> selectTbStorageList(TbStorage tbStorage)
    {
        return tbStorageMapper.selectTbStorageList(tbStorage);
    }

    /**
     * 新增产品入库单列
     * 
     * @param tbStorage 产品入库单列
     * @return 结果
     */
    @Override
    public int insertTbStorage(TbStorage tbStorage)
    {
        return tbStorageMapper.insertTbStorage(tbStorage);
    }

    /**
     * 修改产品入库单列
     * 
     * @param tbStorage 产品入库单列
     * @return 结果
     */
    @Override
    public int updateTbStorage(TbStorage tbStorage)
    {
        return tbStorageMapper.updateTbStorage(tbStorage);
    }

    /**
     * 批量删除产品入库单列
     * 
     * @param StorageIds 需要删除的产品入库单列主键
     * @return 结果
     */
    @Override
    public int deleteTbStorageByStorageIds(Long[] StorageIds)
    {
        return tbStorageMapper.deleteTbStorageByStorageIds(StorageIds);
    }

    /**
     * 删除产品入库单列信息
     * 
     * @param StorageId 产品入库单列主键
     * @return 结果
     */
    @Override
    public int deleteTbStorageByStorageId(Long StorageId)
    {
        return tbStorageMapper.deleteTbStorageByStorageId(StorageId);
    }
}
