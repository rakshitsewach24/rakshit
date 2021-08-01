package Log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class BasicConfiguratorEg1 {

static Logger log1=Logger.getLogger(BasicConfiguratorEg1.class);
	@Test
	public void basicconfig() {
		
		BasicConfigurator.configure();
		
		log1.debug("print debug msg");
		log1.info("Print information msg ");
		log1.warn("Print warning msg");
		log1.error("Print error msg");
		log1.fatal("Print fatal msg");
	}
}
