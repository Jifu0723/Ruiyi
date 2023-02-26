<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="年度" prop="closingYear">
        <el-input
          v-model="queryParams.closingYear"
          placeholder="请输入年度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="期间" prop="closingPeriod">
        <el-input
          v-model="queryParams.closingPeriod"
          placeholder="请输入期间"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="成本中心编号" prop="costcenterNo">
        <el-input
          v-model="queryParams.costcenterNo"
          placeholder="请输入成本中心编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="成本中心名称" prop="costcenterName">
        <el-input
          v-model="queryParams.costcenterName"
          placeholder="请输入成本中心名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="订单号" prop="closingOrdingNo">
        <el-input
          v-model="queryParams.closingOrdingNo"
          placeholder="请输入订单号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="订单行号" prop="closingOrdingLinenumber">
        <el-input
          v-model="queryParams.closingOrdingLinenumber"
          placeholder="请输入订单行号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品编码" prop="closingProductNo">
        <el-input
          v-model="queryParams.closingProductNo"
          placeholder="请输入产品编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品名称" prop="closingProductName">
        <el-input
          v-model="queryParams.closingProductName"
          placeholder="请输入产品名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="主计量产量" prop="closingOutput">
        <el-input
          v-model="queryParams.closingOutput"
          placeholder="请输入主计量产量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="材料费用" prop="closingMaterialcost">
        <el-input
          v-model="queryParams.closingMaterialcost"
          placeholder="请输入材料费用"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="人工费用" prop="closingLaborcost">
        <el-input
          v-model="queryParams.closingLaborcost"
          placeholder="请输入人工费用"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="制造费用" prop="closingManufacturingcost">
        <el-input
          v-model="queryParams.closingManufacturingcost"
          placeholder="请输入制造费用"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="总成本" prop="closingTotalcost">
        <el-input
          v-model="queryParams.closingTotalcost"
          placeholder="请输入总成本"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="主计量单位成本" prop="closingUnitcost">
        <el-input
          v-model="queryParams.closingUnitcost"
          placeholder="请输入主计量单位成本"
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
      <el-form-item label="产品批号" prop="productCode">
        <el-input
          v-model="queryParams.productCode"
          placeholder="请输入产品批号"
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
          v-hasPermi="['modules:summary:add']"
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
          v-hasPermi="['modules:summary:edit']"
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
          v-hasPermi="['modules:summary:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="info"
          plain
          icon="el-icon-upload2"
          size="mini"
          @click="handleImport"
          v-hasPermi="['modules:summary:export']"
        >导入</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['modules:summary:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="summaryList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="主键" align="center" prop="summaryId" />
      <el-table-column label="年度" align="center" prop="closingYear" />
      <el-table-column label="期间" align="center" prop="closingPeriod" />
      <el-table-column label="成本中心编号" align="center" prop="costcenterNo" />
      <el-table-column label="成本中心名称" align="center" prop="costcenterName" />
      <el-table-column label="订单号" align="center" prop="closingOrdingNo" />
      <el-table-column label="订单行号" align="center" prop="closingOrdingLinenumber" />
      <el-table-column label="产品编码" align="center" prop="closingProductNo" />
      <el-table-column label="产品名称" align="center" prop="closingProductName" />
      <el-table-column label="主计量产量" align="center" prop="closingOutput" />
      <el-table-column label="材料费用" align="center" prop="closingMaterialcost" />
      <el-table-column label="人工费用" align="center" prop="closingLaborcost" />
      <el-table-column label="制造费用" align="center" prop="closingManufacturingcost" />
      <el-table-column label="总成本" align="center" prop="closingTotalcost" />
      <el-table-column label="主计量单位成本" align="center" prop="closingUnitcost" />
      <el-table-column label="材料编码" align="center" prop="materialCode" />
      <el-table-column label="产品批号" align="center" prop="productCode" />
      <el-table-column label="材料类别
" align="center" prop="materialType" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['modules:summary:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['modules:summary:remove']"
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

    <!-- 添加或修改完工产品成本汇总对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="年度" prop="closingYear">
          <el-input v-model="form.closingYear" placeholder="请输入年度" />
        </el-form-item>
        <el-form-item label="期间" prop="closingPeriod">
          <el-input v-model="form.closingPeriod" placeholder="请输入期间" />
        </el-form-item>
        <el-form-item label="成本中心编号" prop="costcenterNo">
          <el-input v-model="form.costcenterNo" placeholder="请输入成本中心编号" />
        </el-form-item>
        <el-form-item label="成本中心名称" prop="costcenterName">
          <el-input v-model="form.costcenterName" placeholder="请输入成本中心名称" />
        </el-form-item>
        <el-form-item label="订单号" prop="closingOrdingNo">
          <el-input v-model="form.closingOrdingNo" placeholder="请输入订单号" />
        </el-form-item>
        <el-form-item label="订单行号" prop="closingOrdingLinenumber">
          <el-input v-model="form.closingOrdingLinenumber" placeholder="请输入订单行号" />
        </el-form-item>
        <el-form-item label="产品编码" prop="closingProductNo">
          <el-input v-model="form.closingProductNo" placeholder="请输入产品编码" />
        </el-form-item>
        <el-form-item label="产品名称" prop="closingProductName">
          <el-input v-model="form.closingProductName" placeholder="请输入产品名称" />
        </el-form-item>
        <el-form-item label="主计量产量" prop="closingOutput">
          <el-input v-model="form.closingOutput" placeholder="请输入主计量产量" />
        </el-form-item>
        <el-form-item label="材料费用" prop="closingMaterialcost">
          <el-input v-model="form.closingMaterialcost" placeholder="请输入材料费用" />
        </el-form-item>
        <el-form-item label="人工费用" prop="closingLaborcost">
          <el-input v-model="form.closingLaborcost" placeholder="请输入人工费用" />
        </el-form-item>
        <el-form-item label="制造费用" prop="closingManufacturingcost">
          <el-input v-model="form.closingManufacturingcost" placeholder="请输入制造费用" />
        </el-form-item>
        <el-form-item label="总成本" prop="closingTotalcost">
          <el-input v-model="form.closingTotalcost" placeholder="请输入总成本" />
        </el-form-item>
        <el-form-item label="主计量单位成本" prop="closingUnitcost">
          <el-input v-model="form.closingUnitcost" placeholder="请输入主计量单位成本" />
        </el-form-item>
        <el-form-item label="材料编码" prop="materialCode">
          <el-input v-model="form.materialCode" placeholder="请输入材料编码" />
        </el-form-item>
        <el-form-item label="产品批号" prop="productCode">
          <el-input v-model="form.productCode" placeholder="请输入产品批号" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
    <!-- 用户导入对话框 -->
    <el-dialog :title="upload.title" :visible.sync="upload.open" width="400px" append-to-body>
      <el-upload
        ref="upload"
        :limit="1"
        accept=".xlsx, .xls"
        :headers="upload.headers"
        :action="upload.url + '?updateSupport=' + upload.updateSupport"
        :disabled="upload.isUploading"
        :on-progress="handleFileUploadProgress"
        :on-success="handleFileSuccess"
        :auto-upload="false"
        drag
      >
        <i class="el-icon-upload"></i>
        <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
        <div class="el-upload__tip text-center" slot="tip">
          <div class="el-upload__tip" slot="tip">
            <el-checkbox v-model="upload.updateSupport" /> 是否更新已经存在的用户数据
          </div>
          <span>仅允许导入xls、xlsx格式文件。</span>
          <el-link type="primary" :underline="false" style="font-size:12px;vertical-align: baseline;" @click="importTemplate">下载模板</el-link>
        </div>
      </el-upload>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitFileForm">确 定</el-button>
        <el-button @click="upload.open = false">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listSummary, getSummary, delSummary, addSummary, updateSummary } from "@/api/modules/summary";
import {getToken} from "@/utils/auth";

export default {
  name: "Summary",
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
      // 完工产品成本汇总表格数据
      summaryList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 导入参数
      upload: {
        // 是否显示弹出层（用户导入）
        open: false,
        // 弹出层标题（用户导入）
        title: "",
        // 是否禁用上传
        isUploading: false,
        // 是否更新已经存在的用户数据
        updateSupport: 0,
        // 设置上传的请求头部
        headers: { Authorization: "Bearer " + getToken() },
        // 上传的地址
        url: process.env.VUE_APP_BASE_API + "/modules/summary/importData"
      },
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        closingYear: null,
        closingPeriod: null,
        costcenterNo: null,
        costcenterName: null,
        closingOrdingNo: null,
        closingOrdingLinenumber: null,
        closingProductNo: null,
        closingProductName: null,
        closingOutput: null,
        closingMaterialcost: null,
        closingLaborcost: null,
        closingManufacturingcost: null,
        closingTotalcost: null,
        closingUnitcost: null,
        materialCode: null,
        productCode: null,
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
    /** 查询完工产品成本汇总列表 */
    getList() {
      this.loading = true;
      listSummary(this.queryParams).then(response => {
        this.summaryList = response.rows;
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
        summaryId: null,
        closingYear: null,
        closingPeriod: null,
        costcenterNo: null,
        costcenterName: null,
        closingOrdingNo: null,
        closingOrdingLinenumber: null,
        closingProductNo: null,
        closingProductName: null,
        closingOutput: null,
        closingMaterialcost: null,
        closingLaborcost: null,
        closingManufacturingcost: null,
        closingTotalcost: null,
        closingUnitcost: null,
        materialCode: null,
        productCode: null,
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
      this.ids = selection.map(item => item.summaryId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加完工产品成本汇总";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const summaryId = row.summaryId || this.ids
      getSummary(summaryId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改完工产品成本汇总";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.summaryId != null) {
            updateSummary(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addSummary(this.form).then(response => {
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
      const summaryIds = row.summaryId || this.ids;
      this.$modal.confirm('是否确认删除完工产品成本汇总编号为"' + summaryIds + '"的数据项？').then(function() {
        return delSummary(summaryIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('modules/summary/export', {
        ...this.queryParams
      }, `summary_${new Date().getTime()}.xlsx`)
    },
    /** 导入按钮操作 */
    handleImport() {
      this.upload.title = "完工产品成本汇总数据导入";
      this.upload.open = true;
    },
    /** 下载模板操作 */
    importTemplate() {
      this.download('modules/summary/importTemplate', {
      }, `summary_template_${new Date().getTime()}.xlsx`)
    },
    // 文件上传中处理
    handleFileUploadProgress(event, file, fileList) {
      this.upload.isUploading = true;
    },
    // 文件上传成功处理
    handleFileSuccess(response, file, fileList) {
      this.upload.open = false;
      this.upload.isUploading = false;
      this.$refs.upload.clearFiles();
      this.$alert("<div style='overflow: auto;overflow-x: hidden;max-height: 70vh;padding: 10px 20px 0;'>" + response.msg + "</div>", "导入结果", { dangerouslyUseHTMLString: true });
      this.getList();
    },
    // 提交上传文件
    submitFileForm() {
      this.$refs.upload.submit();
    }
  }
};
</script>
