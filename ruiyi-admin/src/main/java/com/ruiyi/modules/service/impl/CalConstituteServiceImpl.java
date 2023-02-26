package com.ruiyi.modules.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruiyi.modules.mapper.CalConstituteMapper;
import com.ruiyi.modules.domain.CalConstitute;
import com.ruiyi.modules.service.ICalConstituteService;

/**
 * 计算后的电芯/锂带/盖组Service业务层处理
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
@Service
public class CalConstituteServiceImpl implements ICalConstituteService 
{
    @Autowired
    private CalConstituteMapper calConstituteMapper;

    /**
     * 查询计算后的电芯/锂带/盖组
     * 
     * @param constituteId 计算后的电芯/锂带/盖组主键
     * @return 计算后的电芯/锂带/盖组
     */
    @Override
    public CalConstitute selectCalConstituteByConstituteId(Long constituteId)
    {
        return calConstituteMapper.selectCalConstituteByConstituteId(constituteId);
    }

    /**
     * 查询计算后的电芯/锂带/盖组列表
     * 
     * @param calConstitute 计算后的电芯/锂带/盖组
     * @return 计算后的电芯/锂带/盖组
     */
    @Override
    public List<CalConstitute> selectCalConstituteList(CalConstitute calConstitute)
    {
        return calConstituteMapper.selectCalConstituteList(calConstitute);
    }

    /**
     * 新增计算后的电芯/锂带/盖组
     * 
     * @param calConstitute 计算后的电芯/锂带/盖组
     * @return 结果
     */
    @Override
    public int insertCalConstitute(CalConstitute calConstitute)
    {
        return calConstituteMapper.insertCalConstitute(calConstitute);
    }

    /**
     * 修改计算后的电芯/锂带/盖组
     * 
     * @param calConstitute 计算后的电芯/锂带/盖组
     * @return 结果
     */
    @Override
    public int updateCalConstitute(CalConstitute calConstitute)
    {
        return calConstituteMapper.updateCalConstitute(calConstitute);
    }

    /**
     * 批量删除计算后的电芯/锂带/盖组
     * 
     * @param constituteIds 需要删除的计算后的电芯/锂带/盖组主键
     * @return 结果
     */
    @Override
    public int deleteCalConstituteByConstituteIds(Long[] constituteIds)
    {
        return calConstituteMapper.deleteCalConstituteByConstituteIds(constituteIds);
    }

    /**
     * 删除计算后的电芯/锂带/盖组信息
     * 
     * @param constituteId 计算后的电芯/锂带/盖组主键
     * @return 结果
     */
    @Override
    public int deleteCalConstituteByConstituteId(Long constituteId)
    {
        return calConstituteMapper.deleteCalConstituteByConstituteId(constituteId);
    }
}
