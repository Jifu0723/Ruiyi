package com.ruiyi.modules.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruiyi.common.annotation.Excel;
import com.ruiyi.common.core.domain.BaseEntity;

/**
 * 材料出库单列对象 doc_delivery
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
public class DocDelivery extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long deliveryId;

    /** 审核日期 */
    @Excel(name = "审核日期")
    private String auditDate;

    /** 业务类型 */
    @Excel(name = "业务类型")
    private String businessType;

    /** 单据来源 */
    @Excel(name = "单据来源")
    private String documentSource;

    /** 表体生产批号 */
    @Excel(name = "表体生产批号")
    private String productNo;

    /** 表体生产订单号 */
    @Excel(name = "表体生产订单号")
    private String orderNum;

    /** 仓库编码 */
    @Excel(name = "仓库编码")
    private String warehouseCode;

    /** 仓库 */
    @Excel(name = "仓库")
    private String warehouseName;

    /** 出库日期 */
    @Excel(name = "出库日期")
    private String deliveryDate;

    /** 出库单号 */
    @Excel(name = "出库单号")
    private String deliveryNum;

    /** 出库类别 */
    @Excel(name = "出库类别")
    private String deliveryType;

    /** 部门 */
    @Excel(name = "部门")
    private String dept;

    /** 制单人 */
    @Excel(name = "制单人")
    private String documenter;

    /** 审核人 */
    @Excel(name = "审核人")
    private String auditor;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    /** 材料编码 */
    @Excel(name = "材料编码")
    private String materialCode;

    /** 材料名称 */
    @Excel(name = "材料名称")
    private String materialName;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String specificateMode;

    /** 主计量单位 */
    @Excel(name = "主计量单位")
    private String measureUnit;

    /** 批号 */
    @Excel(name = "批号")
    private String batchNumber;

    /** 数量 */
    @Excel(name = "数量")
    private String quantity;

    /** 单价 */
    @Excel(name = "单价")
    private String price;

    /** 金额 */
    @Excel(name = "金额")
    private String amount;

    /** 业务号 */
    @Excel(name = "业务号")
    private String serviceNum;

    /** 项目大类编码 */
    @Excel(name = "项目大类编码")
    private String bigclassCode;

    /** 制单时间 */
    @Excel(name = "制单时间")
    private String makingTime;

    /** 产品编码 */
    @Excel(name = "产品编码")
    private String productCode;

    /** 产品 */
    @Excel(name = "产品")
    private String product;

    /** 出库类别编码 */
    @Excel(name = "出库类别编码")
    private String deliveryTypeCode;

    /** 区分 */
    @Excel(name = "区分")
    private Integer materialType;

    public void setDeliveryId(Long deliveryId) 
    {
        this.deliveryId = deliveryId;
    }

    public Long getDeliveryId() 
    {
        return deliveryId;
    }
    public void setAuditDate(String auditDate) 
    {
        this.auditDate = auditDate;
    }

    public String getAuditDate() 
    {
        return auditDate;
    }
    public void setBusinessType(String businessType) 
    {
        this.businessType = businessType;
    }

    public String getBusinessType() 
    {
        return businessType;
    }
    public void setDocumentSource(String documentSource) 
    {
        this.documentSource = documentSource;
    }

    public String getDocumentSource() 
    {
        return documentSource;
    }
    public void setProductNo(String productNo) 
    {
        this.productNo = productNo;
    }

    public String getProductNo() 
    {
        return productNo;
    }
    public void setOrderNum(String orderNum) 
    {
        this.orderNum = orderNum;
    }

    public String getOrderNum() 
    {
        return orderNum;
    }
    public void setWarehouseCode(String warehouseCode) 
    {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseCode() 
    {
        return warehouseCode;
    }
    public void setWarehouseName(String warehouseName) 
    {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseName() 
    {
        return warehouseName;
    }
    public void setDeliveryDate(String deliveryDate) 
    {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryDate() 
    {
        return deliveryDate;
    }
    public void setDeliveryNum(String deliveryNum) 
    {
        this.deliveryNum = deliveryNum;
    }

    public String getDeliveryNum() 
    {
        return deliveryNum;
    }
    public void setDeliveryType(String deliveryType) 
    {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryType() 
    {
        return deliveryType;
    }
    public void setDept(String dept) 
    {
        this.dept = dept;
    }

    public String getDept() 
    {
        return dept;
    }
    public void setDocumenter(String documenter) 
    {
        this.documenter = documenter;
    }

    public String getDocumenter() 
    {
        return documenter;
    }
    public void setAuditor(String auditor) 
    {
        this.auditor = auditor;
    }

    public String getAuditor() 
    {
        return auditor;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }
    public void setMaterialCode(String materialCode) 
    {
        this.materialCode = materialCode;
    }

    public String getMaterialCode() 
    {
        return materialCode;
    }
    public void setMaterialName(String materialName) 
    {
        this.materialName = materialName;
    }

    public String getMaterialName() 
    {
        return materialName;
    }
    public void setSpecificateMode(String specificateMode) 
    {
        this.specificateMode = specificateMode;
    }

    public String getSpecificateMode() 
    {
        return specificateMode;
    }
    public void setMeasureUnit(String measureUnit) 
    {
        this.measureUnit = measureUnit;
    }

    public String getMeasureUnit() 
    {
        return measureUnit;
    }
    public void setBatchNumber(String batchNumber) 
    {
        this.batchNumber = batchNumber;
    }

    public String getBatchNumber() 
    {
        return batchNumber;
    }
    public void setQuantity(String quantity) 
    {
        this.quantity = quantity;
    }

    public String getQuantity() 
    {
        return quantity;
    }
    public void setPrice(String price) 
    {
        this.price = price;
    }

    public String getPrice() 
    {
        return price;
    }
    public void setAmount(String amount) 
    {
        this.amount = amount;
    }

    public String getAmount() 
    {
        return amount;
    }
    public void setServiceNum(String serviceNum) 
    {
        this.serviceNum = serviceNum;
    }

    public String getServiceNum() 
    {
        return serviceNum;
    }
    public void setBigclassCode(String bigclassCode) 
    {
        this.bigclassCode = bigclassCode;
    }

    public String getBigclassCode() 
    {
        return bigclassCode;
    }
    public void setMakingTime(String makingTime) 
    {
        this.makingTime = makingTime;
    }

    public String getMakingTime() 
    {
        return makingTime;
    }
    public void setProductCode(String productCode) 
    {
        this.productCode = productCode;
    }

    public String getProductCode() 
    {
        return productCode;
    }
    public void setProduct(String product) 
    {
        this.product = product;
    }

    public String getProduct() 
    {
        return product;
    }
    public void setDeliveryTypeCode(String deliveryTypeCode) 
    {
        this.deliveryTypeCode = deliveryTypeCode;
    }

    public String getDeliveryTypeCode() 
    {
        return deliveryTypeCode;
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
            .append("deliveryId", getDeliveryId())
            .append("auditDate", getAuditDate())
            .append("businessType", getBusinessType())
            .append("documentSource", getDocumentSource())
            .append("productNo", getProductNo())
            .append("orderNum", getOrderNum())
            .append("warehouseCode", getWarehouseCode())
            .append("warehouseName", getWarehouseName())
            .append("deliveryDate", getDeliveryDate())
            .append("deliveryNum", getDeliveryNum())
            .append("deliveryType", getDeliveryType())
            .append("dept", getDept())
            .append("documenter", getDocumenter())
            .append("auditor", getAuditor())
            .append("remarks", getRemarks())
            .append("materialCode", getMaterialCode())
            .append("materialName", getMaterialName())
            .append("specificateMode", getSpecificateMode())
            .append("measureUnit", getMeasureUnit())
            .append("batchNumber", getBatchNumber())
            .append("quantity", getQuantity())
            .append("price", getPrice())
            .append("amount", getAmount())
            .append("serviceNum", getServiceNum())
            .append("bigclassCode", getBigclassCode())
            .append("makingTime", getMakingTime())
            .append("productCode", getProductCode())
            .append("product", getProduct())
            .append("deliveryTypeCode", getDeliveryTypeCode())
            .append("materialType", getMaterialType())
            .toString();
    }
}
