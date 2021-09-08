package log4j;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
	public class Test 
	{
		
		static final Logger logger=Logger.getLogger(Test.class);//we can use both class name with extension .class or name of the class
		public static void main(String[] args) {
			PropertyConfigurator.configure("log4j.properties");
			logger.debug("This is debug");
			logger.info("this is info");
			logger.error("this is error ");
			logger.warn("this warn section");
			logger.fatal("fatal section");
		}
	}

	//getLogger method is used to find or create a logger with the name passed as parameter.
	//It will create a new logger if logger does not exist with the passed name.
