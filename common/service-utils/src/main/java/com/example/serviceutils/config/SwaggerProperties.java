package com.example.serviceutils.config;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @version v1.0
 * @ProjectName: Medical-System
 * @ClassName: SwaggerProperties
 * @Description: TODO(一句话描述该类的功能)
 * @Author:Promiseme
 * @Date: 2022/11/23 15:22
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class SwaggerProperties {


    /**
     * API文档生成基础路径
     */
    private String apiBasePackage;

    /**
     * 是否要启用登录认证
     */
    private boolean enableSecurity;

    /**
     * 文档标题
     */
    private String title;

    /**
     * 文档描述
     */
    private String description;

    /**
     * 文档版本
     */
    private String version;

    /**
     * 文档联系人姓名
     */
    private String contactName;

    /**
     * 文档联系人网址
     */
    private String contactUrl;

    /**
     * 文档联系人邮箱
     */
    private String contactEmail;

    /**
     * 版权信息
     */
    private String license;

    /**
     * 版权协议地址
     */
    private String licenseUrl;
}