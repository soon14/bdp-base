package com.platform.finance.report.common.enums;

/**
 * @author wlhbdp
 * @date 2020/9/5 20:09
 * @description 还款状态
 */
public enum PayStatusEnum {

    TQHK("tqhk", "提前还款"),
    ZZHK("zzhk", "转账还款"),
    ZZDK("zzdk", "债转代扣"),
    PTDC("ptdc", "平台代偿"),
    TQJQ("tqjq", "提前结清"),
    YBHK("ybhk", "一般还款"),
    QYZZ("qyzz", "企业转账");

    private String code;
    private String desc;

    PayStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDescFrom(String code) {
        for (PayStatusEnum e : PayStatusEnum.values()) {
            if (e.code.equals(code)) {
                return e.desc;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}