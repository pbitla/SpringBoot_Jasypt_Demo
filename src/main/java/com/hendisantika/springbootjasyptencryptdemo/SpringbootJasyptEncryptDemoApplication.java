package com.hendisantika.springbootjasyptencryptdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
@PropertySource("encrypted.properties")
public class SpringbootJasyptEncryptDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringbootJasyptEncryptDemoApplication.class, args);
        MyTest myTest = configurableApplicationContext.getBean(MyTest.class);
        myTest.testPrint();
    }
}