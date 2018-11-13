package com.lmq;

import java.sql.Date;
import java.util.Calendar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value="com.lmq.dao")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		
		Calendar now = Calendar.getInstance(); 
		StringBuffer nub=new StringBuffer("XSD");
		nub.append(now.get(Calendar.YEAR));
		nub.append(now.get(Calendar.MONTH)+1);
		nub.append(now.get(Calendar.DAY_OF_MONTH));
		int i=20;
		int ib=10000+20;
		nub.append((ib+"").substring(1, (ib+"").length()));
		System.out.println(nub.toString());
	}
}
