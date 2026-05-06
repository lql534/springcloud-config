package com.example.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableConfigServer      // ⚠️ 开启配置中心服务
@EnableDiscoveryClient   // 注册到 Nacos
public class ConfigCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApplication.class, args);
        System.out.println("========================================");
        System.out.println("  Config Server 启动成功！");
        System.out.println("  访问地址：http://localhost:3344");
        System.out.println("  测试：http://localhost:3344/config-dev.yml");
        System.out.println("========================================");
    }

}
