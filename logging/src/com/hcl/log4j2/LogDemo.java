package com.hcl.log4j2;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogDemo {
	
	static  Logger logger = LogManager.getLogger(LogDemo.class);

	public static void main(String[] args) {
		
		System.out.println("Printing Logs using Log4j");
		
		logger.trace("this is a TRACE message");
		logger.debug("this is a DEBUG message");
		logger.info("this is a INFO message");
		logger.warn("this is a WARN message");
		logger.error("this is a ERROR message");
		logger.fatal("this is a FATAL message");
		
		
	}
}
