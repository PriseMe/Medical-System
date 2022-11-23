package com.example.servicehospitalapi.Config;

import com.example.serviceutils.config.BaseSwaggerConfig;
import com.example.serviceutils.config.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @version v1.0
 * @ProjectName: Medical-System
 * @ClassName: SwaggerConfiguration
 * @Description: TODO(一句话描述该类的功能)
 * @Author:Promiseme
 * @Date: 2022/11/23 15:43
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration extends BaseSwaggerConfig {

    //kinefe4j主页
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.example.servicehospitalapi.Controller") //扫描那个目录包
                .title("Hospital") //主页标题
                .description("后台相关接口文档") //简介
                .contactName("Bess Croft")  //作者
                .contactEmail("besscroft@foxmail.com") //
                .contactUrl("https://github.com/besscroft/aurora-mall")
                .license("Open Source")
                .licenseUrl("https://github.com/besscroft/aurora-mall/blob/main/LICENSE")
                .version("0.1.0") //版本号
                .enableSecurity(true)
                .build();
    }

}
