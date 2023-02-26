package com.ruiyi.modules.domain.ienum;
public enum materialTypeEnum {
    /**
     * 返回结果枚举，每个枚举代表着一个状态
     */
    Lithium(0L, "锂带"),
    Cover(1L, "盖组"),
    Cell(2L, "电芯"),
    Battery(3L, "电池"),
    ;

    private Long code;
    private String key;

    materialTypeEnum(Long code, String key) {
        this.code = code;
        this.key = key;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }
}
