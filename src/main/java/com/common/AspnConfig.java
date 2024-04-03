package com.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AspnConfig {


    /**
     * 这里名字变了就可以
     * @return
     */
    @Bean
    public PersonAbcImpl personBean() {
        return new PersonAbcImpl();
    }

//    @Bean
//    public Person personBean() {
//        return new PersonAbcImpl();
//    }

}
