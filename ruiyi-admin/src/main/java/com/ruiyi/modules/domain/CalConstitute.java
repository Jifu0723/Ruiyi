package com.ruiyi.modules.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruiyi.common.annotation.Excel;
import com.ruiyi.common.core.domain.BaseEntity;

/**
 * 计算后的电芯/锂带/盖组对象 cal_constitute
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
public class CalConstitute extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long constituteId;

    /** 电芯/锂带/盖组的编码 */
    @Excel(name = "电芯/锂带/盖组的编码")
    private String constituteCode;

    /** 电芯/锂带/盖组的批号 */
    @Excel(name = "电芯/锂带/盖组的批号")
    private String batchNumber;

    /** 电芯/锂带/盖组的金额 */
    @Excel(name = "电芯/锂带/盖组的金额")
    private BigDecimal amount;

    /** 材料占比 */
    @Excel(name = "材料占比")
    private Long materialProp;

    /** 人工占比 */
    @Excel(name = "人工占比")
    private Long manualProp;

    /** 制费占比 */
    @Excel(name = "制费占比")
    private Long productFeeProp;

    /** 材料金额 */
    @Excel(name = "材料金额")
    private BigDecimal materialFee;

    /** 人工金额 */
    @Excel(name = "人工金额")
    private BigDecimal manualFee;

    /** 制造费用 */
    @Excel(name = "制造费用")
    private BigDecimal productFee;

    /** 区分类型 */
    @Excel(name = "区分类型")
    private Integer materialType;

    public void setConstituteId(Long constituteId) 
    {
        this.constituteId = constituteId;
    }

    public Long getConstituteId() 
    {
        return constituteId;
    }
    public void setConstituteCode(String constituteCode) 
    {
        this.constituteCode = constituteCode;
    }

    public String getConstituteCode() 
    {
        return constituteCode;
    }
    public void setBatchNumber(String batchNumber) 
    {
        this.batchNumber = batchNumber;
    }

    public String getBatchNumber() 
    {
        return batchNumber;
    }
    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }
    public void setMaterialProp(Long materialProp) 
    {
        this.materialProp = materialProp;
    }

    public Long getMaterialProp() 
    {
        return materialProp;
    }
    public void setManualProp(Long manualProp) 
    {
        this.manualProp = manualProp;
    }

    public Long getManualProp() 
    {
        return manualProp;
    }
    public void setProductFeeProp(Long productFeeProp) 
    {
        this.productFeeProp = productFeeProp;
    }

    public Long getProductFeeProp() 
    {
        return productFeeProp;
    }
    public void setMaterialFee(BigDecimal materialFee) 
    {
        this.materialFee = materialFee;
    }

    public BigDecimal getMaterialFee() 
    {
        return materialFee;
    }
    public void setManualFee(BigDecimal manualFee) 
    {
        this.manualFee = manualFee;
    }

    public BigDecimal getManualFee() 
    {
        return manualFee;
    }
    public void setProductFee(BigDecimal productFee) 
    {
        this.productFee = productFee;
    }

    public BigDecimal getProductFee() 
    {
        return productFee;
    }
    public void setMaterialType(Integer materialType) 
    {
        this.materialType = materialType;
    }

    public Integer getMaterialType() 
    {
        return materialType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("constituteId", getConstituteId())
            .append("constituteCode", getConstituteCode())
            .append("batchNumber", getBatchNumber())
            .append("amount", getAmount())
            .append("materialProp", getMaterialProp())
            .append("manualProp", getManualProp())
            .append("productFeeProp", getProductFeeProp())
            .append("materialFee", getMaterialFee())
            .append("manualFee", getManualFee())
            .append("productFee", getProductFee())
            .append("materialType", getMaterialType())
            .toString();
    }
}
