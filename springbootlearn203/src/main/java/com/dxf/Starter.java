package com.dxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Starter {

//    @Bean
//    public ExitCodeGenerator exitCodeGenerator() {
//        return () -> 42;
//    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Starter.class, args);
//        SpringApplication application = new SpringApplication(Example.class);
//        application.setBannerMode(Banner.Mode.OFF);
//        application.setApplicationContextClass();
//        application.run(args);
//        System.exit(SpringApplication
//                .exit((ApplicationContext) application));
//        System.exit(SpringApplication
//                .exit(SpringApplication.run(Example.class, args)));
    }

}
