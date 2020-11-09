package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author  Dongsu
 * @date  2020/11/9 23:22
 * @desc  GreatBoot启动类
 * @SpringBootApplication 标注这是一个springboot主程序类
 **/
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}
