package com.aring.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class TestLoooger {
	
	
	@Test
	public void testName(){
		PropertyConfigurator.configure("E:\\JavaWebProject\\aring\\src\\main\\resourse\\properties\\log4j.properties");
        Logger logger  =  Logger.getLogger(TestLoooger.class );
        logger.info("info");  
        logger.warn("warn");  
        logger.debug("debug");  
        logger.error("error");  
        logger.fatal("fatal");
		 System.out.println("Hello World!");
	}
}
