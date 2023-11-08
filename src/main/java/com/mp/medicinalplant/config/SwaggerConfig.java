package com.mp.medicinalplant.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//@EnableOpenApi   // 开启Swagger自定义接口文档
//@Configuration   // 相当于Spring配置中的<beans>
//public class SwaggerConfig {
//	// 读取yaml中的配置
//   @Value("${swagger.enable}")
//    private Boolean enable;
//
//    @Bean   // 相当于Spring 配置中的<bean>
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.OAS_30)
//                // 配置swagger是否生效
//                .enable(enable)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
//                .paths(PathSelectors.any())
//                .build();
//    }
//    // API基础信息定义（就是更新Swagger默认页面上的信息）
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("药用植物系统Swagger3接口文档测试")
//                .description("这里是文档描述")
//                .contact(new Contact("陌莨", "网址", "邮箱"))
//                .version("v1.0")
//                .build();
//    }
//}
