package com.ruiyi.modules.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruiyi.common.annotation.Excel;
import com.ruiyi.common.core.domain.BaseEntity;

/**
 * 完工产品成本汇总对象 doc_summary
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
public class DocSummary extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long summaryId;

    /** 年度 */
    @Excel(name = "年度")
    private String closingYear;

    /** 期间 */
    @Excel(name = "期间")
    private String closingPeriod;

    /** 成本中心编号 */
    @Excel(name = "成本中心编码")
    private String costcenterNo;

    /** 成本中心名称 */
    @Excel(name = "成本中心名称")
    private String costcenterName;

    /** 订单号 */
    @Excel(name = "订单号")
    private String closingOrdingNo;

    /** 订单行号 */
    @Excel(name = "订单行号")
    private String closingOrdingLinenumber;

    /** 产品编码 */
    @Excel(name = "产品编码")
    private String closingProductNo;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String closingProductName;

    /** 主计量产量 */
    @Excel(name = "主计量产量")
    private BigDecimal closingOutput;

    /** 材料费用 */
    @Excel(name = "材料费用")
    private BigDecimal closingMaterialcost;

    /** 人工费用 */
    @Excel(name = "人工费用")
    private BigDecimal closingLaborcost;

    /** 制造费用 */
    @Excel(name = "制造费用")
    private BigDecimal closingManufacturingcost;

    /** 总成本 */
    @Excel(name = "总成本")
    private BigDecimal closingTotalcost;

    /** 主计量单位成本 */
    @Excel(name = "主计量单位成本")
    private BigDecimal closingUnitcost;

    /** 材料编码 */
    @Excel(name = "材料编码")
    private String materialCode;

    /** 产品批号 */
    @Excel(name = "产品批号")
    private String productCode;

    /** 材料类别
 */
    @Excel(name = "材料类别 ")
    private Integer materialType;

    public void setSummaryId(Long summaryId) 
    {
        this.summaryId = summaryId;
    }

    public Long getSummaryId() 
    {
        return summaryId;
    }
    public void setClosingYear(String closingYear) 
    {
        this.closingYear = closingYear;
    }

    public String getClosingYear() 
    {
        return closingYear;
    }
    public void setClosingPeriod(String closingPeriod) 
    {
        this.closingPeriod = closingPeriod;
    }

    public String getClosingPeriod() 
    {
        return closingPeriod;
    }
    public void setCostcenterNo(String costcenterNo) 
    {
        this.costcenterNo = costcenterNo;
    }

    public String getCostcenterNo() 
    {
        return costcenterNo;
    }
    public void setCostcenterName(String costcenterName) 
    {
        this.costcenterName = costcenterName;
    }

    public String getCostcenterName() 
    {
        return costcenterName;
    }
    public void setClosingOrdingNo(String closingOrdingNo) 
    {
        this.closingOrdingNo = closingOrdingNo;
    }

    public String getClosingOrdingNo() 
    {
        return closingOrdingNo;
    }
    public void setClosingOrdingLinenumber(String closingOrdingLinenumber) 
    {
        this.closingOrdingLinenumber = closingOrdingLinenumber;
    }

    public String getClosingOrdingLinenumber() 
    {
        return closingOrdingLinenumber;
    }
    public void setClosingProductNo(String closingProductNo) 
    {
        this.closingProductNo = closingProductNo;
    }

    public String getClosingProductNo() 
    {
        return closingProductNo;
    }
    public void setClosingProductName(String closingProductName) 
    {
        this.closingProductName = closingProductName;
    }

    public String getClosingProductName() 
    {
        return closingProductName;
    }
    public void setClosingOutput(BigDecimal closingOutput) 
    {
        this.closingOutput = closingOutput;
    }

    public BigDecimal getClosingOutput() 
    {
        return closingOutput;
    }
    public void setClosingMaterialcost(BigDecimal closingMaterialcost) 
    {
        this.closingMaterialcost = closingMaterialcost;
    }

    public BigDecimal getClosingMaterialcost() 
    {
        return closingMaterialcost;
    }
    public void setClosingLaborcost(BigDecimal closingLaborcost) 
    {
        this.closingLaborcost = closingLaborcost;
    }

    public BigDecimal getClosingLaborcost() 
    {
        return closingLaborcost;
    }
    public void setClosingManufacturingcost(BigDecimal closingManufacturingcost) 
    {
        this.closingManufacturingcost = closingManufacturingcost;
    }

    public BigDecimal getClosingManufacturingcost() 
    {
        return closingManufacturingcost;
    }
    public void setClosingTotalcost(BigDecimal closingTotalcost) 
    {
        this.closingTotalcost = closingTotalcost;
    }

    public BigDecimal getClosingTotalcost() 
    {
        return closingTotalcost;
    }
    public void setClosingUnitcost(BigDecimal closingUnitcost) 
    {
        this.closingUnitcost = closingUnitcost;
    }

    public BigDecimal getClosingUnitcost() 
    {
        return closingUnitcost;
    }
    public void setMaterialCode(String materialCode) 
    {
        this.materialCode = materialCode;
    }

    public String getMaterialCode() 
    {
        return materialCode;
    }
    public void setProductCode(String productCode) 
    {
        this.productCode = productCode;
    }

    public String getProductCode() 
    {
        return productCode;
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
            .append("summaryId", getSummaryId())
            .append("closingYear", getClosingYear())
            .append("closingPeriod", getClosingPeriod())
            .append("costcenterNo", getCostcenterNo())
            .append("costcenterName", getCostcenterName())
            .append("closingOrdingNo", getClosingOrdingNo())
            .append("closingOrdingLinenumber", getClosingOrdingLinenumber())
            .append("closingProductNo", getClosingProductNo())
            .append("closingProductName", getClosingProductName())
            .append("closingOutput", getClosingOutput())
            .append("closingMaterialcost", getClosingMaterialcost())
            .append("closingLaborcost", getClosingLaborcost())
            .append("closingManufacturingcost", getClosingManufacturingcost())
            .append("closingTotalcost", getClosingTotalcost())
            .append("closingUnitcost", getClosingUnitcost())
            .append("materialCode", getMaterialCode())
            .append("productCode", getProductCode())
            .append("materialType", getMaterialType())
            .toString();
    }
}
