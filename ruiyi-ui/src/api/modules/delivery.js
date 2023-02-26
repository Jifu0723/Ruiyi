import request from '@/utils/request'

// 查询材料出库单列列表
export function listDelivery(query) {
  return request({
    url: '/modules/delivery/list',
    method: 'get',
    params: query
  })
}

// 查询材料出库单列详细
export function getDelivery(deliveryId) {
  return request({
    url: '/modules/delivery/' + deliveryId,
    method: 'get'
  })
}

// 新增材料出库单列
export function addDelivery(data) {
  return request({
    url: '/modules/delivery',
    method: 'post',
    data: data
  })
}

// 修改材料出库单列
export function updateDelivery(data) {
  return request({
    url: '/modules/delivery',
    method: 'put',
    data: data
  })
}

// 删除材料出库单列
export function delDelivery(deliveryId) {
  return request({
    url: '/modules/delivery/' + deliveryId,
    method: 'delete'
  })
}
