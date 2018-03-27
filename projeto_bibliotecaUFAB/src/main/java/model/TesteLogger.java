package model;

import java.util.logging.Logger;

import org.apache.log4j.spi.LoggerFactory;

public class TesteLogger {
	
	final static Logger logger = Logger.getLogger("test.log");
	static String test;
	public static void main(String[] args) {
		
		System.out.println("testando");
		test = "asdfasdf";
		logger.warning(test);

	}

}
