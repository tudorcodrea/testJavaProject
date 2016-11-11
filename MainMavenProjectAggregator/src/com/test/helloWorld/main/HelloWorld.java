package com.test.helloWorld.main;

import com.test.util.Constants;

/**
 * Main class for starting the app
 * 
 * @author Tudor
 *
 */
public class HelloWorld {

	private HelloWorld() {
	}

	public static void main(String[] args) {

		System.out.println("Hi Jenkins builder !!!");
		System.out.println("Hi Jenkins builder !!! " + Constants.TEST1_HELLO);
		System.out.println("Hi Jenkins builder !!!");

	}

}
