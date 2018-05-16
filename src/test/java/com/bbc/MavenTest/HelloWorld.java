package com.bbc.MavenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloWorld {

//	@Test
//	public void hello() {
//		System.out.println("helloWorld");
//	}
	@DataProvider(name="login")
	public Object[][] data1() {
		return new Object[][] {
			{"user1","pwd1"},{"user2","pwd2"}
		};
	}
	@Test(dataProvider="login")
	public void Test1(String user,String pwd) {
		System.out.println(user);
		System.out.println(pwd);
	}
}
