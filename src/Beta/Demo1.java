package Beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=LogManager.getLogger(Demo1.class.getName());
		log.debug("i am debugging");
		log.info("Object is present");
		log.error("Object is not present");
		log.fatal("this is fatal");
	}

}