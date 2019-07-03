//package com.github.zuihou.authority.config;
//
//import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
//import com.github.zuihou.common.swagger2.Swagger2WebMvcConfigurerAdapter;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// * Swagger2的配置类
// *
// * @author xubin.
// * @create 2017-04-08
// */
//@Configuration
//@EnableSwagger2
//@EnableSwaggerBootstrapUI
//@EnableConfigurationProperties({Swagger2WebMvcConfigurerAdapter.Swagger2BaseProperties.class})
//public class Swagger2 extends Swagger2WebMvcConfigurerAdapter {
//
//    @Autowired
//    Swagger2BaseProperties swagger2Properties;
//
//    @Override
//    protected Swagger2BaseProperties getSwagger2BaseProperties() {
//        return swagger2Properties;
//    }
//
//    /**
//     * 权限文档
//     *
//     * @return
//     */
//    @Bean
//    public Docket createPriAuthModule() {
//        return getDefDocket("auth", "priAuth");
//    }
//
//    /**
//     * 公共部分文档
//     *
//     * @return
//     */
//    @Bean
//    public Docket createCommonApi() {
//        return getDefDocket("common", "priCommon");
//    }
//
//    @Bean
//    public Docket createCoreInsideApi() {
//        return getDefDocket("core", "priCore");
//    }
//
//}
