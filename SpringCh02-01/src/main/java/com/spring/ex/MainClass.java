package com.spring.ex;

public class MainClass {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.setFirstNum(10);
		cal.setSecondNum(2);
		
		System.out.println("firstNum : " + cal.getFirstNum() + ", secondNum : " + cal.getSecondNum());
		System.out.println("-----------------------");
		cal.add();
		cal.sub();
		cal.mul();
		cal.dev();
		
	}

}
