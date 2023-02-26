package com.ruiyi.modules.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruiyi.common.annotation.Excel;
import com.ruiyi.common.core.domain.BaseEntity;

/**
 * 产品入库单列对象 tb_storage
 * 
 * @author ruiyi
 * @date 2023-02-26
 */
public class TbStorage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 入库单id（主键） */
    private Long StorageId;

    /** 表体生产订单号 */
    @Excel(name = "表体生产订单号")
    private String produceOrderNo;

    /** 生产订单行号 */
    @Excel(name = "生产订单行号")
    private String produceRowNo;

    /** 审核日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date chectData;

    /** 记账人 */
    @Excel(name = "记账人")
    private String storageName;

    /** 仓库编码 */
    @Excel(name = "仓库编码")
    private String storageStoreId;

    /** 仓库 */
    @Excel(name = "仓库")
    private String storageStore;

    /** 入库日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入库日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date storageData;

    /** 入库单号 */
    @Excel(name = "入库单号")
    private String storageSingleId;

    /** 入库类别 */
    @Excel(name = "入库类别")
    private String storageType;

    /** 部门 */
    @Excel(name = "部门")
    private String storageDepart;

    /** 制单人 */
    @Excel(name = "制单人")
    private String storageOrderName;

    /** 审核人 */
    @Excel(name = "审核人")
    private String chectName;

    /** 备注 */
    @Excel(name = "备注")
    private String storageNote;

    /** 产品编码 */
    @Excel(name = "产品编码")
    private String produceCode;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String produceName;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String produceModel;

    /** 数量 */
    @Excel(name = "数量")
    private String produceNum;

    /** 单价 */
    @Excel(name = "单价")
    private String produceMoney;

    /** 金额 */
    @Excel(name = "金额")
    private String produceTotalMoney;

    /** 包装图号 */
    @Excel(name = "包装图号")
    private String producePackageId;

    /** 来源订单号 */
    @Excel(name = "来源订单号")
    private String produceSourceId;

    /** 批号 */
    @Excel(name = "批号")
    private String batchNumber;

    /** 制单时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "制单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date produceData;

    /** 区分 */
    @Excel(name = "区分")
    private Integer materialType;

    public void setStorageId(Long StorageId) 
    {
        this.StorageId = StorageId;
    }

    public Long getStorageId() 
    {
        return StorageId;
    }
    public void setProduceOrderNo(String produceOrderNo) 
    {
        this.produceOrderNo = produceOrderNo;
    }

    public String getProduceOrderNo() 
    {
        return produceOrderNo;
    }
    public void setProduceRowNo(String produceRowNo) 
    {
        this.produceRowNo = produceRowNo;
    }

    public String getProduceRowNo() 
    {
        return produceRowNo;
    }
    public void setChectData(Date chectData) 
    {
        this.chectData = chectData;
    }

    public Date getChectData() 
    {
        return chectData;
    }
    public void setStorageName(String storageName) 
    {
        this.storageName = storageName;
    }

    public String getStorageName() 
    {
        return storageName;
    }
    public void setStorageStoreId(String storageStoreId) 
    {
        this.storageStoreId = storageStoreId;
    }

    public String getStorageStoreId() 
    {
        return storageStoreId;
    }
    public void setStorageStore(String storageStore) 
    {
        this.storageStore = storageStore;
    }

    public String getStorageStore() 
    {
        return storageStore;
    }
    public void setStorageData(Date storageData) 
    {
        this.storageData = storageData;
    }

    public Date getStorageData() 
    {
        return storageData;
    }
    public void setStorageSingleId(String storageSingleId) 
    {
        this.storageSingleId = storageSingleId;
    }

    public String getStorageSingleId() 
    {
        return storageSingleId;
    }
    public void setStorageType(String storageType) 
    {
        this.storageType = storageType;
    }

    public String getStorageType() 
    {
        return storageType;
    }
    public void setStorageDepart(String storageDepart) 
    {
        this.storageDepart = storageDepart;
    }

    public String getStorageDepart() 
    {
        return storageDepart;
    }
    public void setStorageOrderName(String storageOrderName) 
    {
        this.storageOrderName = storageOrderName;
    }

    public String getStorageOrderName() 
    {
        return storageOrderName;
    }
    public void setChectName(String chectName) 
    {
        this.chectName = chectName;
    }

    public String getChectName() 
    {
        return chectName;
    }
    public void setStorageNote(String storageNote) 
    {
        this.storageNote = storageNote;
    }

    public String getStorageNote() 
    {
        return storageNote;
    }
    public void setProduceCode(String produceCode) 
    {
        this.produceCode = produceCode;
    }

    public String getProduceCode() 
    {
        return produceCode;
    }
    public void setProduceName(String produceName) 
    {
        this.produceName = produceName;
    }

    public String getProduceName() 
    {
        return produceName;
    }
    public void setProduceModel(String produceModel) 
    {
        this.produceModel = produceModel;
    }

    public String getProduceModel() 
    {
        return produceModel;
    }
    public void setProduceNum(String produceNum) 
    {
        this.produceNum = produceNum;
    }

    public String getProduceNum() 
    {
        return produceNum;
    }
    public void setProduceMoney(String produceMoney) 
    {
        this.produceMoney = produceMoney;
    }

    public String getProduceMoney() 
    {
        return produceMoney;
    }
    public void setProduceTotalMoney(String produceTotalMoney) 
    {
        this.produceTotalMoney = produceTotalMoney;
    }

    public String getProduceTotalMoney() 
    {
        return produceTotalMoney;
    }
    public void setProducePackageId(String producePackageId) 
    {
        this.producePackageId = producePackageId;
    }

    public String getProducePackageId() 
    {
        return producePackageId;
    }
    public void setProduceSourceId(String produceSourceId) 
    {
        this.produceSourceId = produceSourceId;
    }

    public String getProduceSourceId() 
    {
        return produceSourceId;
    }
    public void setBatchNumber(String batchNumber) 
    {
        this.batchNumber = batchNumber;
    }

    public String getBatchNumber() 
    {
        return batchNumber;
    }
    public void setProduceData(Date produceData) 
    {
        this.produceData = produceData;
    }

    public Date getProduceData() 
    {
        return produceData;
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
            .append("StorageId", getStorageId())
            .append("produceOrderNo", getProduceOrderNo())
            .append("produceRowNo", getProduceRowNo())
            .append("chectData", getChectData())
            .append("storageName", getStorageName())
            .append("storageStoreId", getStorageStoreId())
            .append("storageStore", getStorageStore())
            .append("storageData", getStorageData())
            .append("storageSingleId", getStorageSingleId())
            .append("storageType", getStorageType())
            .append("storageDepart", getStorageDepart())
            .append("storageOrderName", getStorageOrderName())
            .append("chectName", getChectName())
            .append("storageNote", getStorageNote())
            .append("produceCode", getProduceCode())
            .append("produceName", getProduceName())
            .append("produceModel", getProduceModel())
            .append("produceNum", getProduceNum())
            .append("produceMoney", getProduceMoney())
            .append("produceTotalMoney", getProduceTotalMoney())
            .append("producePackageId", getProducePackageId())
            .append("produceSourceId", getProduceSourceId())
            .append("batchNumber", getBatchNumber())
            .append("produceData", getProduceData())
            .append("materialType", getMaterialType())
            .toString();
    }
}
