<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="表体生产订单号" prop="produceOrderNo">
        <el-input
          v-model="queryParams.produceOrderNo"
          placeholder="请输入表体生产订单号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="生产订单行号" prop="produceRowNo">
        <el-input
          v-model="queryParams.produceRowNo"
          placeholder="请输入生产订单行号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="审核日期" prop="chectData">
        <el-date-picker clearable
          v-model="queryParams.chectData"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择审核日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="记账人" prop="storageName">
        <el-input
          v-model="queryParams.storageName"
          placeholder="请输入记账人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="仓库编码" prop="storageStoreId">
        <el-input
          v-model="queryParams.storageStoreId"
          placeholder="请输入仓库编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="仓库" prop="storageStore">
        <el-input
          v-model="queryParams.storageStore"
          placeholder="请输入仓库"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="入库日期" prop="storageData">
        <el-date-picker clearable
          v-model="queryParams.storageData"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择入库日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="入库单号" prop="storageSingleId">
        <el-input
          v-model="queryParams.storageSingleId"
          placeholder="请输入入库单号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="部门" prop="storageDepart">
        <el-input
          v-model="queryParams.storageDepart"
          placeholder="请输入部门"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="制单人" prop="storageOrderName">
        <el-input
          v-model="queryParams.storageOrderName"
          placeholder="请输入制单人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="审核人" prop="chectName">
        <el-input
          v-model="queryParams.chectName"
          placeholder="请输入审核人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品编码" prop="produceCode">
        <el-input
          v-model="queryParams.produceCode"
          placeholder="请输入产品编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品名称" prop="produceName">
        <el-input
          v-model="queryParams.produceName"
          placeholder="请输入产品名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="规格型号" prop="produceModel">
        <el-input
          v-model="queryParams.produceModel"
          placeholder="请输入规格型号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数量" prop="produceNum">
        <el-input
          v-model="queryParams.produceNum"
          placeholder="请输入数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="单价" prop="produceMoney">
        <el-input
          v-model="queryParams.produceMoney"
          placeholder="请输入单价"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="金额" prop="produceTotalMoney">
        <el-input
          v-model="queryParams.produceTotalMoney"
          placeholder="请输入金额"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="包装图号" prop="producePackageId">
        <el-input
          v-model="queryParams.producePackageId"
          placeholder="请输入包装图号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="来源订单号" prop="produceSourceId">
        <el-input
          v-model="queryParams.produceSourceId"
          placeholder="请输入来源订单号"
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
      <el-form-item label="制单时间" prop="produceData">
        <el-date-picker clearable
          v-model="queryParams.produceData"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择制单时间">
        </el-date-picker>
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
          v-hasPermi="['modules:storage:add']"
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
          v-hasPermi="['modules:storage:edit']"
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
          v-hasPermi="['modules:storage:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['modules:storage:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="storageList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="入库单id" align="center" prop="  storageId" />
      <el-table-column label="表体生产订单号" align="center" prop="produceOrderNo" />
      <el-table-column label="生产订单行号" align="center" prop="produceRowNo" />
      <el-table-column label="审核日期" align="center" prop="chectData" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.chectData, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="记账人" align="center" prop="storageName" />
      <el-table-column label="仓库编码" align="center" prop="storageStoreId" />
      <el-table-column label="仓库" align="center" prop="storageStore" />
      <el-table-column label="入库日期" align="center" prop="storageData" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.storageData, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="入库单号" align="center" prop="storageSingleId" />
      <el-table-column label="入库类别" align="center" prop="storageType" />
      <el-table-column label="部门" align="center" prop="storageDepart" />
      <el-table-column label="制单人" align="center" prop="storageOrderName" />
      <el-table-column label="审核人" align="center" prop="chectName" />
      <el-table-column label="备注" align="center" prop="storageNote" />
      <el-table-column label="产品编码" align="center" prop="produceCode" />
      <el-table-column label="产品名称" align="center" prop="produceName" />
      <el-table-column label="规格型号" align="center" prop="produceModel" />
      <el-table-column label="数量" align="center" prop="produceNum" />
      <el-table-column label="单价" align="center" prop="produceMoney" />
      <el-table-column label="金额" align="center" prop="produceTotalMoney" />
      <el-table-column label="包装图号" align="center" prop="producePackageId" />
      <el-table-column label="来源订单号" align="center" prop="produceSourceId" />
      <el-table-column label="批号" align="center" prop="batchNumber" />
      <el-table-column label="制单时间" align="center" prop="produceData" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.produceData, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="区分" align="center" prop="materialType" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['modules:storage:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['modules:storage:remove']"
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

    <!-- 添加或修改产品入库单列对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="表体生产订单号" prop="produceOrderNo">
          <el-input v-model="form.produceOrderNo" placeholder="请输入表体生产订单号" />
        </el-form-item>
        <el-form-item label="生产订单行号" prop="produceRowNo">
          <el-input v-model="form.produceRowNo" placeholder="请输入生产订单行号" />
        </el-form-item>
        <el-form-item label="审核日期" prop="chectData">
          <el-date-picker clearable
            v-model="form.chectData"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择审核日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="记账人" prop="storageName">
          <el-input v-model="form.storageName" placeholder="请输入记账人" />
        </el-form-item>
        <el-form-item label="仓库编码" prop="storageStoreId">
          <el-input v-model="form.storageStoreId" placeholder="请输入仓库编码" />
        </el-form-item>
        <el-form-item label="仓库" prop="storageStore">
          <el-input v-model="form.storageStore" placeholder="请输入仓库" />
        </el-form-item>
        <el-form-item label="入库日期" prop="storageData">
          <el-date-picker clearable
            v-model="form.storageData"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择入库日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="入库单号" prop="storageSingleId">
          <el-input v-model="form.storageSingleId" placeholder="请输入入库单号" />
        </el-form-item>
        <el-form-item label="部门" prop="storageDepart">
          <el-input v-model="form.storageDepart" placeholder="请输入部门" />
        </el-form-item>
        <el-form-item label="制单人" prop="storageOrderName">
          <el-input v-model="form.storageOrderName" placeholder="请输入制单人" />
        </el-form-item>
        <el-form-item label="审核人" prop="chectName">
          <el-input v-model="form.chectName" placeholder="请输入审核人" />
        </el-form-item>
        <el-form-item label="备注" prop="storageNote">
          <el-input v-model="form.storageNote" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="产品编码" prop="produceCode">
          <el-input v-model="form.produceCode" placeholder="请输入产品编码" />
        </el-form-item>
        <el-form-item label="产品名称" prop="produceName">
          <el-input v-model="form.produceName" placeholder="请输入产品名称" />
        </el-form-item>
        <el-form-item label="规格型号" prop="produceModel">
          <el-input v-model="form.produceModel" placeholder="请输入规格型号" />
        </el-form-item>
        <el-form-item label="数量" prop="produceNum">
          <el-input v-model="form.produceNum" placeholder="请输入数量" />
        </el-form-item>
        <el-form-item label="单价" prop="produceMoney">
          <el-input v-model="form.produceMoney" placeholder="请输入单价" />
        </el-form-item>
        <el-form-item label="金额" prop="produceTotalMoney">
          <el-input v-model="form.produceTotalMoney" placeholder="请输入金额" />
        </el-form-item>
        <el-form-item label="包装图号" prop="producePackageId">
          <el-input v-model="form.producePackageId" placeholder="请输入包装图号" />
        </el-form-item>
        <el-form-item label="来源订单号" prop="produceSourceId">
          <el-input v-model="form.produceSourceId" placeholder="请输入来源订单号" />
        </el-form-item>
        <el-form-item label="批号" prop="batchNumber">
          <el-input v-model="form.batchNumber" placeholder="请输入批号" />
        </el-form-item>
        <el-form-item label="制单时间" prop="produceData">
          <el-date-picker clearable
            v-model="form.produceData"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择制单时间">
          </el-date-picker>
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
import { listStorage, getStorage, delStorage, addStorage, updateStorage } from "@/api/modules/storage";

export default {
  name: "Storage",
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
      // 产品入库单列表格数据
      storageList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        produceOrderNo: null,
        produceRowNo: null,
        chectData: null,
        storageName: null,
        storageStoreId: null,
        storageStore: null,
        storageData: null,
        storageSingleId: null,
        storageType: null,
        storageDepart: null,
        storageOrderName: null,
        chectName: null,
        storageNote: null,
        produceCode: null,
        produceName: null,
        produceModel: null,
        produceNum: null,
        produceMoney: null,
        produceTotalMoney: null,
        producePackageId: null,
        produceSourceId: null,
        batchNumber: null,
        produceData: null,
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
    /** 查询产品入库单列列表 */
    getList() {
      this.loading = true;
      listStorage(this.queryParams).then(response => {
        this.storageList = response.rows;
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
          storageId: null,
        produceOrderNo: null,
        produceRowNo: null,
        chectData: null,
        storageName: null,
        storageStoreId: null,
        storageStore: null,
        storageData: null,
        storageSingleId: null,
        storageType: null,
        storageDepart: null,
        storageOrderName: null,
        chectName: null,
        storageNote: null,
        produceCode: null,
        produceName: null,
        produceModel: null,
        produceNum: null,
        produceMoney: null,
        produceTotalMoney: null,
        producePackageId: null,
        produceSourceId: null,
        batchNumber: null,
        produceData: null,
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
      this.ids = selection.map(item => item.  storageId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加产品入库单列";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const   storageId = row.  storageId || this.ids
      getStorage(  storageId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改产品入库单列";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.  storageId != null) {
            updateStorage(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addStorage(this.form).then(response => {
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
      const   storageIds = row.  storageId || this.ids;
      this.$modal.confirm('是否确认删除产品入库单列编号为"' +   storageIds + '"的数据项？').then(function() {
        return delStorage(  storageIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('modules/storage/export', {
        ...this.queryParams
      }, `storage_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
