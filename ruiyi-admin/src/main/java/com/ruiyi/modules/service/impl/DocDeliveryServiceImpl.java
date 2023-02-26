package com.ruiyi.modules.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruiyi.modules.mapper.DocDeliveryMapper;
import com.ruiyi.modules.domain.DocDelivery;
import com.ruiyi.modules.service.IDocDeliveryService;

/**
 * 材料出库单列Service业务层处理
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
@Service
public class DocDeliveryServiceImpl implements IDocDeliveryService 
{
    @Autowired
    private DocDeliveryMapper docDeliveryMapper;

    /**
     * 查询材料出库单列
     * 
     * @param deliveryId 材料出库单列主键
     * @return 材料出库单列
     */
    @Override
    public DocDelivery selectDocDeliveryByDeliveryId(Long deliveryId)
    {
        return docDeliveryMapper.selectDocDeliveryByDeliveryId(deliveryId);
    }

    /**
     * 查询材料出库单列列表
     * 
     * @param docDelivery 材料出库单列
     * @return 材料出库单列
     */
    @Override
    public List<DocDelivery> selectDocDeliveryList(DocDelivery docDelivery)
    {
        return docDeliveryMapper.selectDocDeliveryList(docDelivery);
    }

    /**
     * 新增材料出库单列
     * 
     * @param docDelivery 材料出库单列
     * @return 结果
     */
    @Override
    public int insertDocDelivery(DocDelivery docDelivery)
    {
        return docDeliveryMapper.insertDocDelivery(docDelivery);
    }

    /**
     * 修改材料出库单列
     * 
     * @param docDelivery 材料出库单列
     * @return 结果
     */
    @Override
    public int updateDocDelivery(DocDelivery docDelivery)
    {
        return docDeliveryMapper.updateDocDelivery(docDelivery);
    }

    /**
     * 批量删除材料出库单列
     * 
     * @param deliveryIds 需要删除的材料出库单列主键
     * @return 结果
     */
    @Override
    public int deleteDocDeliveryByDeliveryIds(Long[] deliveryIds)
    {
        return docDeliveryMapper.deleteDocDeliveryByDeliveryIds(deliveryIds);
    }

    /**
     * 删除材料出库单列信息
     * 
     * @param deliveryId 材料出库单列主键
     * @return 结果
     */
    @Override
    public int deleteDocDeliveryByDeliveryId(Long deliveryId)
    {
        return docDeliveryMapper.deleteDocDeliveryByDeliveryId(deliveryId);
    }
}
