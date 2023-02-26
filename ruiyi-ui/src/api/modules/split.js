import request from '@/utils/request'

// 查询电芯能源传品拆分列表
export function listSplit(query) {
  return request({
    url: '/modules/split/list',
    method: 'get',
    params: query
  })
}

// 查询电芯能源传品拆分详细
export function getSplit(cellId) {
  return request({
    url: '/modules/split/' + cellId,
    method: 'get'
  })
}

// 新增电芯能源传品拆分
export function addSplit(data) {
  return request({
    url: '/modules/split',
    method: 'post',
    data: data
  })
}

// 修改电芯能源传品拆分
export function updateSplit(data) {
  return request({
    url: '/modules/split',
    method: 'put',
    data: data
  })
}

// 删除电芯能源传品拆分
export function delSplit(cellId) {
  return request({
    url: '/modules/split/' + cellId,
    method: 'delete'
  })
}
