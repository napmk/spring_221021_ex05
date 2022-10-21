package com.napmkmk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Student stu = new Student("홍길동","30살", "3학년", "3반") ;
		
		// 홍길동 , 30살 , 3학년, 3반
//		stu.setName("홍길동");
//		stu.setAge("30살");
//		stu.setGredeNum("3학년");
//		stu.setClassNum("3반");
		
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		StudentInfo stuInfo1 = ctx.getBean("studentInfo1", StudentInfo.class);
		stuInfo1.getStudentInfo();
		
		
	
		
		StudentInfo stuInfo2 = ctx.getBean("studentInfo2", StudentInfo.class);
		stuInfo2.getStudentInfo();
		
		ctx.close();
		
		
	}

	
	
}
