package com.Example;

import java.util.logging.Logger;

public class Main {
	
	private static Logger LOGGER = LoggerConfiguration.configurator(Main.class.getName());
	
	public static void main(String[] args) {
	
		int a = 0 ;
		LOGGER.info("inside main():: a: "+ a);
		
		Main main = new Main();
		main.method1();
		main.method2();
		main.method3();
		
	}
	
	
	private void method1() {
		LOGGER.info("inside method1()");

	}
	
	private void method2() {
		LOGGER.info("inside method2()");
	}
	
	private void method3() {
		LOGGER.info("inside method3()");
	}

}
