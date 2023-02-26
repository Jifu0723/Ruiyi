<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="电芯/锂带/盖组的编码" prop="constituteCode">
        <el-input
          v-model="queryParams.constituteCode"
          placeholder="请输入电芯/锂带/盖组的编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电芯/锂带/盖组的批号" prop="batchNumber">
        <el-input
          v-model="queryParams.batchNumber"
          placeholder="请输入电芯/锂带/盖组的批号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电芯/锂带/盖组的金额" prop="amount">
        <el-input
          v-model="queryParams.amount"
          placeholder="请输入电芯/锂带/盖组的金额"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="材料占比" prop="materialProp">
        <el-input
          v-model="queryParams.materialProp"
          placeholder="请输入材料占比"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="人工占比" prop="manualProp">
        <el-input
          v-model="queryParams.manualProp"
          placeholder="请输入人工占比"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="制费占比" prop="productFeeProp">
        <el-input
          v-model="queryParams.productFeeProp"
          placeholder="请输入制费占比"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="材料金额" prop="materialFee">
        <el-input
          v-model="queryParams.materialFee"
          placeholder="请输入材料金额"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="人工金额" prop="manualFee">
        <el-input
          v-model="queryParams.manualFee"
          placeholder="请输入人工金额"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="制造费用" prop="productFee">
        <el-input
          v-model="queryParams.productFee"
          placeholder="请输入制造费用"
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
          v-hasPermi="['modules:constitute:add']"
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
          v-hasPermi="['modules:constitute:edit']"
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
          v-hasPermi="['modules:constitute:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['modules:constitute:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="constituteList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="主键" align="center" prop="constituteId" />
      <el-table-column label="电芯/锂带/盖组的编码" align="center" prop="constituteCode" />
      <el-table-column label="电芯/锂带/盖组的批号" align="center" prop="batchNumber" />
      <el-table-column label="电芯/锂带/盖组的金额" align="center" prop="amount" />
      <el-table-column label="材料占比" align="center" prop="materialProp" />
      <el-table-column label="人工占比" align="center" prop="manualProp" />
      <el-table-column label="制费占比" align="center" prop="productFeeProp" />
      <el-table-column label="材料金额" align="center" prop="materialFee" />
      <el-table-column label="人工金额" align="center" prop="manualFee" />
      <el-table-column label="制造费用" align="center" prop="productFee" />
      <el-table-column label="区分类型" align="center" prop="materialType" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['modules:constitute:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['modules:constitute:remove']"
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

    <!-- 添加或修改计算后的电芯/锂带/盖组对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="电芯/锂带/盖组的编码" prop="constituteCode">
          <el-input v-model="form.constituteCode" placeholder="请输入电芯/锂带/盖组的编码" />
        </el-form-item>
        <el-form-item label="电芯/锂带/盖组的批号" prop="batchNumber">
          <el-input v-model="form.batchNumber" placeholder="请输入电芯/锂带/盖组的批号" />
        </el-form-item>
        <el-form-item label="电芯/锂带/盖组的金额" prop="amount">
          <el-input v-model="form.amount" placeholder="请输入电芯/锂带/盖组的金额" />
        </el-form-item>
        <el-form-item label="材料占比" prop="materialProp">
          <el-input v-model="form.materialProp" placeholder="请输入材料占比" />
        </el-form-item>
        <el-form-item label="人工占比" prop="manualProp">
          <el-input v-model="form.manualProp" placeholder="请输入人工占比" />
        </el-form-item>
        <el-form-item label="制费占比" prop="productFeeProp">
          <el-input v-model="form.productFeeProp" placeholder="请输入制费占比" />
        </el-form-item>
        <el-form-item label="材料金额" prop="materialFee">
          <el-input v-model="form.materialFee" placeholder="请输入材料金额" />
        </el-form-item>
        <el-form-item label="人工金额" prop="manualFee">
          <el-input v-model="form.manualFee" placeholder="请输入人工金额" />
        </el-form-item>
        <el-form-item label="制造费用" prop="productFee">
          <el-input v-model="form.productFee" placeholder="请输入制造费用" />
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
import { listConstitute, getConstitute, delConstitute, addConstitute, updateConstitute } from "@/api/modules/constitute";

export default {
  name: "Constitute",
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
      // 计算后的电芯/锂带/盖组表格数据
      constituteList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        constituteCode: null,
        batchNumber: null,
        amount: null,
        materialProp: null,
        manualProp: null,
        productFeeProp: null,
        materialFee: null,
        manualFee: null,
        productFee: null,
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
    /** 查询计算后的电芯/锂带/盖组列表 */
    getList() {
      this.loading = true;
      listConstitute(this.queryParams).then(response => {
        this.constituteList = response.rows;
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
        constituteId: null,
        constituteCode: null,
        batchNumber: null,
        amount: null,
        materialProp: null,
        manualProp: null,
        productFeeProp: null,
        materialFee: null,
        manualFee: null,
        productFee: null,
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
      this.ids = selection.map(item => item.constituteId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加计算后的电芯/锂带/盖组";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const constituteId = row.constituteId || this.ids
      getConstitute(constituteId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改计算后的电芯/锂带/盖组";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.constituteId != null) {
            updateConstitute(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addConstitute(this.form).then(response => {
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
      const constituteIds = row.constituteId || this.ids;
      this.$modal.confirm('是否确认删除计算后的电芯/锂带/盖组编号为"' + constituteIds + '"的数据项？').then(function() {
        return delConstitute(constituteIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('modules/constitute/export', {
        ...this.queryParams
      }, `constitute_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
