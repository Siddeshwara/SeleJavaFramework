package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Log4jDemo {

	static org.apache.logging.log4j.Logger logger = LogManager.getLogger(Log4jDemo.class); // Logger
	
	public static void main(String[] args) {
		
		System.out.println("\n  Hello World.....\n");
		
		logger.trace("This is trace message");
		logger.info("This is info message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");
		logger.warn("This is warning message");
		
		System.out.println("Completed..");

	}

}
