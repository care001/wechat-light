package com.github.care.wx.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
@MapperScan("com.github.care.wx.mp.dao.mapper")
@SpringBootApplication
public class WxMpDemoApplication {



    public static void main(String[] args) {
        SpringApplication.run(WxMpDemoApplication.class, args);
    }
}
