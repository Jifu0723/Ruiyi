package com.ruiyi.modules.service;

import java.util.List;
import com.ruiyi.modules.domain.CalConstitute;

/**
 * 计算后的电芯/锂带/盖组Service接口
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
public interface ICalConstituteService 
{
    /**
     * 查询计算后的电芯/锂带/盖组
     * 
     * @param constituteId 计算后的电芯/锂带/盖组主键
     * @return 计算后的电芯/锂带/盖组
     */
    public CalConstitute selectCalConstituteByConstituteId(Long constituteId);

    /**
     * 查询计算后的电芯/锂带/盖组列表
     * 
     * @param calConstitute 计算后的电芯/锂带/盖组
     * @return 计算后的电芯/锂带/盖组集合
     */
    public List<CalConstitute> selectCalConstituteList(CalConstitute calConstitute);

    /**
     * 新增计算后的电芯/锂带/盖组
     * 
     * @param calConstitute 计算后的电芯/锂带/盖组
     * @return 结果
     */
    public int insertCalConstitute(CalConstitute calConstitute);

    /**
     * 修改计算后的电芯/锂带/盖组
     * 
     * @param calConstitute 计算后的电芯/锂带/盖组
     * @return 结果
     */
    public int updateCalConstitute(CalConstitute calConstitute);

    /**
     * 批量删除计算后的电芯/锂带/盖组
     * 
     * @param constituteIds 需要删除的计算后的电芯/锂带/盖组主键集合
     * @return 结果
     */
    public int deleteCalConstituteByConstituteIds(Long[] constituteIds);

    /**
     * 删除计算后的电芯/锂带/盖组信息
     * 
     * @param constituteId 计算后的电芯/锂带/盖组主键
     * @return 结果
     */
    public int deleteCalConstituteByConstituteId(Long constituteId);
}
