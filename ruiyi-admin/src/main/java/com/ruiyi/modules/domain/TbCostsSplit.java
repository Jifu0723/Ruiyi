package com.ruiyi.modules.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruiyi.common.annotation.Excel;
import com.ruiyi.common.core.domain.BaseEntity;

/**
 * 电芯能源传品拆分对象 tb_costs_split
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
public class TbCostsSplit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 电芯成本拆分主键 */
    private Long cellId;

    /** 订单号 */
    @Excel(name = "订单号")
    private String orderNum;

    /** 订单行号 */
    @Excel(name = "订单行号")
    private String orderNo;

    /** 产量 */
    @Excel(name = "产量")
    private String cellProNum;

    /** 费用类型 */
    @Excel(name = "费用类型")
    private String feesType;

    /** 费用编码 */
    @Excel(name = "费用编码")
    private String feesNum;

    /** 费用名称 */
    @Excel(name = "费用名称")
    private String feesName;

    /** 电芯单价 */
    @Excel(name = "电芯单价")
    private String cellMoney;

    /** 电芯数量 */
    @Excel(name = "电芯数量")
    private String cellNum;

    /** 电芯单位耗量 */
    @Excel(name = "电芯单位耗量")
    private String cellUse;

    /** 金额 */
    @Excel(name = "金额")
    private String cellMoneyAll;

    /** 单位成本 */
    @Excel(name = "单位成本")
    private String cellCosts;

    /** 占总成本比例 */
    @Excel(name = "占总成本比例")
    private String proportionTotal;

    /** 占成本项目比例 */
    @Excel(name = "占成本项目比例")
    private String proportionProject;

    /** 区分 */
    @Excel(name = "区分")
    private Integer materialType;

    public void setCellId(Long cellId) 
    {
        this.cellId = cellId;
    }

    public Long getCellId() 
    {
        return cellId;
    }
    public void setOrderNum(String orderNum) 
    {
        this.orderNum = orderNum;
    }

    public String getOrderNum() 
    {
        return orderNum;
    }
    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }
    public void setCellProNum(String cellProNum) 
    {
        this.cellProNum = cellProNum;
    }

    public String getCellProNum() 
    {
        return cellProNum;
    }
    public void setFeesType(String feesType) 
    {
        this.feesType = feesType;
    }

    public String getFeesType() 
    {
        return feesType;
    }
    public void setFeesNum(String feesNum) 
    {
        this.feesNum = feesNum;
    }

    public String getFeesNum() 
    {
        return feesNum;
    }
    public void setFeesName(String feesName) 
    {
        this.feesName = feesName;
    }

    public String getFeesName() 
    {
        return feesName;
    }
    public void setCellMoney(String cellMoney) 
    {
        this.cellMoney = cellMoney;
    }

    public String getCellMoney() 
    {
        return cellMoney;
    }
    public void setCellNum(String cellNum) 
    {
        this.cellNum = cellNum;
    }

    public String getCellNum() 
    {
        return cellNum;
    }
    public void setCellUse(String cellUse) 
    {
        this.cellUse = cellUse;
    }

    public String getCellUse() 
    {
        return cellUse;
    }
    public void setCellMoneyAll(String cellMoneyAll) 
    {
        this.cellMoneyAll = cellMoneyAll;
    }

    public String getCellMoneyAll() 
    {
        return cellMoneyAll;
    }
    public void setCellCosts(String cellCosts) 
    {
        this.cellCosts = cellCosts;
    }

    public String getCellCosts() 
    {
        return cellCosts;
    }
    public void setProportionTotal(String proportionTotal) 
    {
        this.proportionTotal = proportionTotal;
    }

    public String getProportionTotal() 
    {
        return proportionTotal;
    }
    public void setProportionProject(String proportionProject) 
    {
        this.proportionProject = proportionProject;
    }

    public String getProportionProject() 
    {
        return proportionProject;
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
            .append("cellId", getCellId())
            .append("orderNum", getOrderNum())
            .append("orderNo", getOrderNo())
            .append("cellProNum", getCellProNum())
            .append("feesType", getFeesType())
            .append("feesNum", getFeesNum())
            .append("feesName", getFeesName())
            .append("cellMoney", getCellMoney())
            .append("cellNum", getCellNum())
            .append("cellUse", getCellUse())
            .append("cellMoneyAll", getCellMoneyAll())
            .append("cellCosts", getCellCosts())
            .append("proportionTotal", getProportionTotal())
            .append("proportionProject", getProportionProject())
            .append("materialType", getMaterialType())
            .toString();
    }
}
