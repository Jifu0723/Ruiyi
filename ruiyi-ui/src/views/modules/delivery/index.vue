<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="审核日期" prop="auditDate">
        <el-input
          v-model="queryParams.auditDate"
          placeholder="请输入审核日期"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="单据来源" prop="documentSource">
        <el-input
          v-model="queryParams.documentSource"
          placeholder="请输入单据来源"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="表体生产批号" prop="productNo">
        <el-input
          v-model="queryParams.productNo"
          placeholder="请输入表体生产批号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="表体生产订单号" prop="orderNum">
        <el-input
          v-model="queryParams.orderNum"
          placeholder="请输入表体生产订单号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="仓库编码" prop="warehouseCode">
        <el-input
          v-model="queryParams.warehouseCode"
          placeholder="请输入仓库编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="仓库" prop="warehouseName">
        <el-input
          v-model="queryParams.warehouseName"
          placeholder="请输入仓库"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="出库日期" prop="deliveryDate">
        <el-input
          v-model="queryParams.deliveryDate"
          placeholder="请输入出库日期"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="出库单号" prop="deliveryNum">
        <el-input
          v-model="queryParams.deliveryNum"
          placeholder="请输入出库单号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="部门" prop="dept">
        <el-input
          v-model="queryParams.dept"
          placeholder="请输入部门"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="制单人" prop="documenter">
        <el-input
          v-model="queryParams.documenter"
          placeholder="请输入制单人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="审核人" prop="auditor">
        <el-input
          v-model="queryParams.auditor"
          placeholder="请输入审核人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注" prop="remarks">
        <el-input
          v-model="queryParams.remarks"
          placeholder="请输入备注"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="材料编码" prop="materialCode">
        <el-input
          v-model="queryParams.materialCode"
          placeholder="请输入材料编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="材料名称" prop="materialName">
        <el-input
          v-model="queryParams.materialName"
          placeholder="请输入材料名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="规格型号" prop="specificateMode">
        <el-input
          v-model="queryParams.specificateMode"
          placeholder="请输入规格型号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="主计量单位" prop="measureUnit">
        <el-input
          v-model="queryParams.measureUnit"
          placeholder="请输入主计量单位"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="批号" prop="batchNumber">
        <el-input
          v-model="queryParams.batchNumber"
          placeholder="请输入批号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数量" prop="quantity">
        <el-input
          v-model="queryParams.quantity"
          placeholder="请输入数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="单价" prop="price">
        <el-input
          v-model="queryParams.price"
          placeholder="请输入单价"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="金额" prop="amount">
        <el-input
          v-model="queryParams.amount"
          placeholder="请输入金额"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="业务号" prop="serviceNum">
        <el-input
          v-model="queryParams.serviceNum"
          placeholder="请输入业务号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="项目大类编码" prop="bigclassCode">
        <el-input
          v-model="queryParams.bigclassCode"
          placeholder="请输入项目大类编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="制单时间" prop="makingTime">
        <el-input
          v-model="queryParams.makingTime"
          placeholder="请输入制单时间"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品编码" prop="productCode">
        <el-input
          v-model="queryParams.productCode"
          placeholder="请输入产品编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品" prop="product">
        <el-input
          v-model="queryParams.product"
          placeholder="请输入产品"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="出库类别编码" prop="deliveryTypeCode">
        <el-input
          v-model="queryParams.deliveryTypeCode"
          placeholder="请输入出库类别编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['modules:delivery:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['modules:delivery:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['modules:delivery:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['modules:delivery:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="deliveryList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="主键" align="center" prop="deliveryId" />
      <el-table-column label="审核日期" align="center" prop="auditDate" />
      <el-table-column label="业务类型" align="center" prop="businessType" />
      <el-table-column label="单据来源" align="center" prop="documentSource" />
      <el-table-column label="表体生产批号" align="center" prop="productNo" />
      <el-table-column label="表体生产订单号" align="center" prop="orderNum" />
      <el-table-column label="仓库编码" align="center" prop="warehouseCode" />
      <el-table-column label="仓库" align="center" prop="warehouseName" />
      <el-table-column label="出库日期" align="center" prop="deliveryDate" />
      <el-table-column label="出库单号" align="center" prop="deliveryNum" />
      <el-table-column label="出库类别" align="center" prop="deliveryType" />
      <el-table-column label="部门" align="center" prop="dept" />
      <el-table-column label="制单人" align="center" prop="documenter" />
      <el-table-column label="审核人" align="center" prop="auditor" />
      <el-table-column label="备注" align="center" prop="remarks" />
      <el-table-column label="材料编码" align="center" prop="materialCode" />
      <el-table-column label="材料名称" align="center" prop="materialName" />
      <el-table-column label="规格型号" align="center" prop="specificateMode" />
      <el-table-column label="主计量单位" align="center" prop="measureUnit" />
      <el-table-column label="批号" align="center" prop="batchNumber" />
      <el-table-column label="数量" align="center" prop="quantity" />
      <el-table-column label="单价" align="center" prop="price" />
      <el-table-column label="金额" align="center" prop="amount" />
      <el-table-column label="业务号" align="center" prop="serviceNum" />
      <el-table-column label="项目大类编码" align="center" prop="bigclassCode" />
      <el-table-column label="制单时间" align="center" prop="makingTime" />
      <el-table-column label="产品编码" align="center" prop="productCode" />
      <el-table-column label="产品" align="center" prop="product" />
      <el-table-column label="出库类别编码" align="center" prop="deliveryTypeCode" />
      <el-table-column label="区分" align="center" prop="materialType" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['modules:delivery:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['modules:delivery:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改材料出库单列对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="审核日期" prop="auditDate">
          <el-input v-model="form.auditDate" placeholder="请输入审核日期" />
        </el-form-item>
        <el-form-item label="单据来源" prop="documentSource">
          <el-input v-model="form.documentSource" placeholder="请输入单据来源" />
        </el-form-item>
        <el-form-item label="表体生产批号" prop="productNo">
          <el-input v-model="form.productNo" placeholder="请输入表体生产批号" />
        </el-form-item>
        <el-form-item label="表体生产订单号" prop="orderNum">
          <el-input v-model="form.orderNum" placeholder="请输入表体生产订单号" />
        </el-form-item>
        <el-form-item label="仓库编码" prop="warehouseCode">
          <el-input v-model="form.warehouseCode" placeholder="请输入仓库编码" />
        </el-form-item>
        <el-form-item label="仓库" prop="warehouseName">
          <el-input v-model="form.warehouseName" placeholder="请输入仓库" />
        </el-form-item>
        <el-form-item label="出库日期" prop="deliveryDate">
          <el-input v-model="form.deliveryDate" placeholder="请输入出库日期" />
        </el-form-item>
        <el-form-item label="出库单号" prop="deliveryNum">
          <el-input v-model="form.deliveryNum" placeholder="请输入出库单号" />
        </el-form-item>
        <el-form-item label="部门" prop="dept">
          <el-input v-model="form.dept" placeholder="请输入部门" />
        </el-form-item>
        <el-form-item label="制单人" prop="documenter">
          <el-input v-model="form.documenter" placeholder="请输入制单人" />
        </el-form-item>
        <el-form-item label="审核人" prop="auditor">
          <el-input v-model="form.auditor" placeholder="请输入审核人" />
        </el-form-item>
        <el-form-item label="备注" prop="remarks">
          <el-input v-model="form.remarks" placeholder="请输入备注" />
        </el-form-item>
        <el-form-item label="材料编码" prop="materialCode">
          <el-input v-model="form.materialCode" placeholder="请输入材料编码" />
        </el-form-item>
        <el-form-item label="材料名称" prop="materialName">
          <el-input v-model="form.materialName" placeholder="请输入材料名称" />
        </el-form-item>
        <el-form-item label="规格型号" prop="specificateMode">
          <el-input v-model="form.specificateMode" placeholder="请输入规格型号" />
        </el-form-item>
        <el-form-item label="主计量单位" prop="measureUnit">
          <el-input v-model="form.measureUnit" placeholder="请输入主计量单位" />
        </el-form-item>
        <el-form-item label="批号" prop="batchNumber">
          <el-input v-model="form.batchNumber" placeholder="请输入批号" />
        </el-form-item>
        <el-form-item label="数量" prop="quantity">
          <el-input v-model="form.quantity" placeholder="请输入数量" />
        </el-form-item>
        <el-form-item label="单价" prop="price">
          <el-input v-model="form.price" placeholder="请输入单价" />
        </el-form-item>
        <el-form-item label="金额" prop="amount">
          <el-input v-model="form.amount" placeholder="请输入金额" />
        </el-form-item>
        <el-form-item label="业务号" prop="serviceNum">
          <el-input v-model="form.serviceNum" placeholder="请输入业务号" />
        </el-form-item>
        <el-form-item label="项目大类编码" prop="bigclassCode">
          <el-input v-model="form.bigclassCode" placeholder="请输入项目大类编码" />
        </el-form-item>
        <el-form-item label="制单时间" prop="makingTime">
          <el-input v-model="form.makingTime" placeholder="请输入制单时间" />
        </el-form-item>
        <el-form-item label="产品编码" prop="productCode">
          <el-input v-model="form.productCode" placeholder="请输入产品编码" />
        </el-form-item>
        <el-form-item label="产品" prop="product">
          <el-input v-model="form.product" placeholder="请输入产品" />
        </el-form-item>
        <el-form-item label="出库类别编码" prop="deliveryTypeCode">
          <el-input v-model="form.deliveryTypeCode" placeholder="请输入出库类别编码" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listDelivery, getDelivery, delDelivery, addDelivery, updateDelivery } from "@/api/modules/delivery";

export default {
  name: "Delivery",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 材料出库单列表格数据
      deliveryList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        auditDate: null,
        businessType: null,
        documentSource: null,
        productNo: null,
        orderNum: null,
        warehouseCode: null,
        warehouseName: null,
        deliveryDate: null,
        deliveryNum: null,
        deliveryType: null,
        dept: null,
        documenter: null,
        auditor: null,
        remarks: null,
        materialCode: null,
        materialName: null,
        specificateMode: null,
        measureUnit: null,
        batchNumber: null,
        quantity: null,
        price: null,
        amount: null,
        serviceNum: null,
        bigclassCode: null,
        makingTime: null,
        productCode: null,
        product: null,
        deliveryTypeCode: null,
        materialType: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询材料出库单列列表 */
    getList() {
      this.loading = true;
      listDelivery(this.queryParams).then(response => {
        this.deliveryList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        deliveryId: null,
        auditDate: null,
        businessType: null,
        documentSource: null,
        productNo: null,
        orderNum: null,
        warehouseCode: null,
        warehouseName: null,
        deliveryDate: null,
        deliveryNum: null,
        deliveryType: null,
        dept: null,
        documenter: null,
        auditor: null,
        remarks: null,
        materialCode: null,
        materialName: null,
        specificateMode: null,
        measureUnit: null,
        batchNumber: null,
        quantity: null,
        price: null,
        amount: null,
        serviceNum: null,
        bigclassCode: null,
        makingTime: null,
        productCode: null,
        product: null,
        deliveryTypeCode: null,
        materialType: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.deliveryId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加材料出库单列";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const deliveryId = row.deliveryId || this.ids
      getDelivery(deliveryId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改材料出库单列";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.deliveryId != null) {
            updateDelivery(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addDelivery(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const deliveryIds = row.deliveryId || this.ids;
      this.$modal.confirm('是否确认删除材料出库单列编号为"' + deliveryIds + '"的数据项？').then(function() {
        return delDelivery(deliveryIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('modules/delivery/export', {
        ...this.queryParams
      }, `delivery_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
