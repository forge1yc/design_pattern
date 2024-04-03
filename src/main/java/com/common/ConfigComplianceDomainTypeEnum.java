package com.common;


import com.google.common.base.CaseFormat;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.assertj.core.util.Sets;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Config 相关开发者类型描述
 * @author hyc
 * @date 2022-08-02 14:37:18
 */
public enum ConfigComplianceDomainTypeEnum {
    /**
     * 空
     */
    None(""),

    /**
     * 法规
     */
    Law( "法规"),

    /**
     * 资源管控
     */
    resourceControl( "资源管控");


    private final String desc;


    ConfigComplianceDomainTypeEnum(String desc){
        this.desc = desc;
    }

    public static ConfigComplianceDomainTypeEnum of(String type) {
        for (ConfigComplianceDomainTypeEnum value : ConfigComplianceDomainTypeEnum.values()) {
            if (value.name().equalsIgnoreCase(type)){
                return value;
            }
        }
        return None;
    }

    public String getDeveloperTypeDesc() {
        return desc;
    }

    public static void main(String[] args) {
        String a = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_CAMEL, "ResourceControl");
        System.out.println(a);

        System.out.println(ConfigComplianceDomainTypeEnum.resourceControl);

//        System.out.println(Integer.parseInt("0") * 100.0 / Integer.parseInt("0"));

//        System.out.println(Objects.equals(Integer.parseInt("0") * 100.0 / Integer.parseInt("0"), "NaN"));

        if (Objects.equals(new AtomicLong().get(), 0L)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        Gson gson = new Gson();
        Set<String> setTmp = gson.fromJson("[sdf, asdfa]", new TypeToken<Set<String>>(){}.getType());
        System.out.println(setTmp.size());

        Set<String> s = Sets.newHashSet();
        s.add("2");
        s.add("3");

        System.out.println(s.toString());
    }

    public class apple {
        Integer Id;
        Integer commandLevel;
    }


}
