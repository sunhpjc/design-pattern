package com.sunhp.designpattern.singleton.enums;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum TypeEnum {
    HUNGER("001","饿汉式"),
    DCL("002","双重校验锁"),
    REGISTER("003","登记式"),
    ENUMS("004","枚举方式");

    private static final Logger logger = LoggerFactory.getLogger(TypeEnum.class);

    private final String code;
    private final String desc;

    TypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static TypeEnum getEnumsByCode(String key){
        TypeEnum typeEnum = null;
        if(StringUtils.isNotBlank(key)){
            for(TypeEnum typeEnum1 : values()){
                if((typeEnum1.getCode().equals(key))){
                    typeEnum = typeEnum1;
                }
            }
        }
        else {
            logger.info("参数key为空");
        }
        return typeEnum;
    }
}
