package com.reetu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.reetu.beans.MyBean;

@SpringBootApplication
public class SpringBootAop2Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootAop2Application.class, args);
		MyBean m=ctx.getBean(MyBean.class);
		int result=m.sum(10,20);
		System.out.println("sum: "+result);
	}

}

