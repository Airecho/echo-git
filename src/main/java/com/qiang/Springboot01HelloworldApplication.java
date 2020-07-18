package com.qiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication：标注这个类是Springboot的应用：启动类下的所有资源被导入
@SpringBootApplication
public class Springboot01HelloworldApplication {
	//将Springboot应用启动
	//SpringApplication类//run方法
	public static void main(String[] args) {
		SpringApplication.run(Springboot01HelloworldApplication.class, args);
	}

}
