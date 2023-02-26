package com.ruiyi.modules.service;

import java.util.List;
import com.ruiyi.modules.domain.DocDelivery;

/**
 * 材料出库单列Service接口
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
public interface IDocDeliveryService 
{
    /**
     * 查询材料出库单列
     * 
     * @param deliveryId 材料出库单列主键
     * @return 材料出库单列
     */
    public DocDelivery selectDocDeliveryByDeliveryId(Long deliveryId);

    /**
     * 查询材料出库单列列表
     * 
     * @param docDelivery 材料出库单列
     * @return 材料出库单列集合
     */
    public List<DocDelivery> selectDocDeliveryList(DocDelivery docDelivery);

    /**
     * 新增材料出库单列
     * 
     * @param docDelivery 材料出库单列
     * @return 结果
     */
    public int insertDocDelivery(DocDelivery docDelivery);

    /**
     * 修改材料出库单列
     * 
     * @param docDelivery 材料出库单列
     * @return 结果
     */
    public int updateDocDelivery(DocDelivery docDelivery);

    /**
     * 批量删除材料出库单列
     * 
     * @param deliveryIds 需要删除的材料出库单列主键集合
     * @return 结果
     */
    public int deleteDocDeliveryByDeliveryIds(Long[] deliveryIds);

    /**
     * 删除材料出库单列信息
     * 
     * @param deliveryId 材料出库单列主键
     * @return 结果
     */
    public int deleteDocDeliveryByDeliveryId(Long deliveryId);
}
