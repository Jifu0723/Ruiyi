import request from '@/utils/request'

// 查询完工产品成本汇总列表
export function listSummary(query) {
  return request({
    url: '/modules/summary/list',
    method: 'get',
    params: query
  })
}

// 查询完工产品成本汇总详细
export function getSummary(summaryId) {
  return request({
    url: '/modules/summary/' + summaryId,
    method: 'get'
  })
}

// 新增完工产品成本汇总
export function addSummary(data) {
  return request({
    url: '/modules/summary',
    method: 'post',
    data: data
  })
}

// 修改完工产品成本汇总
export function updateSummary(data) {
  return request({
    url: '/modules/summary',
    method: 'put',
    data: data
  })
}

// 删除完工产品成本汇总
export function delSummary(summaryId) {
  return request({
    url: '/modules/summary/' + summaryId,
    method: 'delete'
  })
}
