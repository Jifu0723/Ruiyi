<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="订单号" prop="orderNum">
        <el-input
          v-model="queryParams.orderNum"
          placeholder="请输入订单号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="订单行号" prop="orderNo">
        <el-input
          v-model="queryParams.orderNo"
          placeholder="请输入订单行号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产量" prop="cellProNum">
        <el-input
          v-model="queryParams.cellProNum"
          placeholder="请输入产量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="费用编码" prop="feesNum">
        <el-input
          v-model="queryParams.feesNum"
          placeholder="请输入费用编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="费用名称" prop="feesName">
        <el-input
          v-model="queryParams.feesName"
          placeholder="请输入费用名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电芯单价" prop="cellMoney">
        <el-input
          v-model="queryParams.cellMoney"
          placeholder="请输入电芯单价"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电芯数量" prop="cellNum">
        <el-input
          v-model="queryParams.cellNum"
          placeholder="请输入电芯数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电芯单位耗量" prop="cellUse">
        <el-input
          v-model="queryParams.cellUse"
          placeholder="请输入电芯单位耗量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="金额" prop="cellMoneyAll">
        <el-input
          v-model="queryParams.cellMoneyAll"
          placeholder="请输入金额"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="单位成本" prop="cellCosts">
        <el-input
          v-model="queryParams.cellCosts"
          placeholder="请输入单位成本"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="占总成本比例" prop="proportionTotal">
        <el-input
          v-model="queryParams.proportionTotal"
          placeholder="请输入占总成本比例"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="占成本项目比例" prop="proportionProject">
        <el-input
          v-model="queryParams.proportionProject"
          placeholder="请输入占成本项目比例"
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
          v-hasPermi="['modules:split:add']"
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
          v-hasPermi="['modules:split:edit']"
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
          v-hasPermi="['modules:split:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['modules:split:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="splitList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="电芯成本拆分主键" align="center" prop="cellId" />
      <el-table-column label="订单号" align="center" prop="orderNum" />
      <el-table-column label="订单行号" align="center" prop="orderNo" />
      <el-table-column label="产量" align="center" prop="cellProNum" />
      <el-table-column label="费用类型" align="center" prop="feesType" />
      <el-table-column label="费用编码" align="center" prop="feesNum" />
      <el-table-column label="费用名称" align="center" prop="feesName" />
      <el-table-column label="电芯单价" align="center" prop="cellMoney" />
      <el-table-column label="电芯数量" align="center" prop="cellNum" />
      <el-table-column label="电芯单位耗量" align="center" prop="cellUse" />
      <el-table-column label="金额" align="center" prop="cellMoneyAll" />
      <el-table-column label="单位成本" align="center" prop="cellCosts" />
      <el-table-column label="占总成本比例" align="center" prop="proportionTotal" />
      <el-table-column label="占成本项目比例" align="center" prop="proportionProject" />
      <el-table-column label="区分" align="center" prop="materialType" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['modules:split:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['modules:split:remove']"
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

    <!-- 添加或修改电芯能源传品拆分对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="订单号" prop="orderNum">
          <el-input v-model="form.orderNum" placeholder="请输入订单号" />
        </el-form-item>
        <el-form-item label="订单行号" prop="orderNo">
          <el-input v-model="form.orderNo" placeholder="请输入订单行号" />
        </el-form-item>
        <el-form-item label="产量" prop="cellProNum">
          <el-input v-model="form.cellProNum" placeholder="请输入产量" />
        </el-form-item>
        <el-form-item label="费用编码" prop="feesNum">
          <el-input v-model="form.feesNum" placeholder="请输入费用编码" />
        </el-form-item>
        <el-form-item label="费用名称" prop="feesName">
          <el-input v-model="form.feesName" placeholder="请输入费用名称" />
        </el-form-item>
        <el-form-item label="电芯单价" prop="cellMoney">
          <el-input v-model="form.cellMoney" placeholder="请输入电芯单价" />
        </el-form-item>
        <el-form-item label="电芯数量" prop="cellNum">
          <el-input v-model="form.cellNum" placeholder="请输入电芯数量" />
        </el-form-item>
        <el-form-item label="电芯单位耗量" prop="cellUse">
          <el-input v-model="form.cellUse" placeholder="请输入电芯单位耗量" />
        </el-form-item>
        <el-form-item label="金额" prop="cellMoneyAll">
          <el-input v-model="form.cellMoneyAll" placeholder="请输入金额" />
        </el-form-item>
        <el-form-item label="单位成本" prop="cellCosts">
          <el-input v-model="form.cellCosts" placeholder="请输入单位成本" />
        </el-form-item>
        <el-form-item label="占总成本比例" prop="proportionTotal">
          <el-input v-model="form.proportionTotal" placeholder="请输入占总成本比例" />
        </el-form-item>
        <el-form-item label="占成本项目比例" prop="proportionProject">
          <el-input v-model="form.proportionProject" placeholder="请输入占成本项目比例" />
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
import { listSplit, getSplit, delSplit, addSplit, updateSplit } from "@/api/modules/split";

export default {
  name: "Split",
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
      // 电芯能源传品拆分表格数据
      splitList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        orderNum: null,
        orderNo: null,
        cellProNum: null,
        feesType: null,
        feesNum: null,
        feesName: null,
        cellMoney: null,
        cellNum: null,
        cellUse: null,
        cellMoneyAll: null,
        cellCosts: null,
        proportionTotal: null,
        proportionProject: null,
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
    /** 查询电芯能源传品拆分列表 */
    getList() {
      this.loading = true;
      listSplit(this.queryParams).then(response => {
        this.splitList = response.rows;
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
        cellId: null,
        orderNum: null,
        orderNo: null,
        cellProNum: null,
        feesType: null,
        feesNum: null,
        feesName: null,
        cellMoney: null,
        cellNum: null,
        cellUse: null,
        cellMoneyAll: null,
        cellCosts: null,
        proportionTotal: null,
        proportionProject: null,
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
      this.ids = selection.map(item => item.cellId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加电芯能源传品拆分";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const cellId = row.cellId || this.ids
      getSplit(cellId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改电芯能源传品拆分";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.cellId != null) {
            updateSplit(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addSplit(this.form).then(response => {
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
      const cellIds = row.cellId || this.ids;
      this.$modal.confirm('是否确认删除电芯能源传品拆分编号为"' + cellIds + '"的数据项？').then(function() {
        return delSplit(cellIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('modules/split/export', {
        ...this.queryParams
      }, `split_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
