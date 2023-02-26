import request from '@/utils/request'

// 查询计算后的电芯/锂带/盖组列表
export function listConstitute(query) {
  return request({
    url: '/modules/constitute/list',
    method: 'get',
    params: query
  })
}

// 查询计算后的电芯/锂带/盖组详细
export function getConstitute(constituteId) {
  return request({
    url: '/modules/constitute/' + constituteId,
    method: 'get'
  })
}

// 新增计算后的电芯/锂带/盖组
export function addConstitute(data) {
  return request({
    url: '/modules/constitute',
    method: 'post',
    data: data
  })
}

// 修改计算后的电芯/锂带/盖组
export function updateConstitute(data) {
  return request({
    url: '/modules/constitute',
    method: 'put',
    data: data
  })
}

// 删除计算后的电芯/锂带/盖组
export function delConstitute(constituteId) {
  return request({
    url: '/modules/constitute/' + constituteId,
    method: 'delete'
  })
}
