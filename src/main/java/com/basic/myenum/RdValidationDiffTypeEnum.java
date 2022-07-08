package com.basic.myenum;

/**
 * @author hyc
 * @date 2022-07-06 20:26:23
 */
public enum RdValidationDiffTypeEnum {

    /**
     * 只存在于Config，config多余的，需要删除
     */
    ONLY_IN_CONFIG,

    /**
     * 只存在于RD，config缺少的，需要补充
     */
    ONLY_IN_RD,


    /**
     * Config与RD都存在，但是详细信息配置不同
     */
    CONFIG_DIFF_RD;



    public static RdValidationDiffTypeEnum findEnumByType(String type) {
        for (RdValidationDiffTypeEnum typeEnum : RdValidationDiffTypeEnum.values()) {
            if (typeEnum.name().equals(type)) {
                return typeEnum;
            }
        }
        return null;
    }

}
