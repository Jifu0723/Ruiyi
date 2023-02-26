import request from '@/utils/request'

// 查询产品入库单列列表
export function listStorage(query) {
  return request({
    url: '/modules/storage/list',
    method: 'get',
    params: query
  })
}

// 查询产品入库单列详细
export function getStorage(  storageId) {
  return request({
    url: '/modules/storage/' +   storageId,
    method: 'get'
  })
}

// 新增产品入库单列
export function addStorage(data) {
  return request({
    url: '/modules/storage',
    method: 'post',
    data: data
  })
}

// 修改产品入库单列
export function updateStorage(data) {
  return request({
    url: '/modules/storage',
    method: 'put',
    data: data
  })
}

// 删除产品入库单列
export function delStorage(  storageId) {
  return request({
    url: '/modules/storage/' +   storageId,
    method: 'delete'
  })
}
