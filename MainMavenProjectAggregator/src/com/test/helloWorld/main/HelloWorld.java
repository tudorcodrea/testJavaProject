package com.test.helloWorld.main;

import com.test.childProjects.connection.TestProject1Connection;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hi Jenkins builder !!!");
		System.out.println("Hi Jenkins builder !!! "+new TestProject1Connection().mUseTest1Test1HelloConstant);
		
	}

}
