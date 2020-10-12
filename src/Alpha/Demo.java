package Alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=LogManager.getLogger(Demo.class.getName());
		log.debug("I have clicked on button");
		log.info("Button is displyed");
		log.error("Button is not displayed");
		log.fatal("Button is missing");
	}

}