package base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties OR = new Properties();
	public static Properties Config = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	
	
	public void setUp() {
		
	}
	
	public void tearDown () {
		
	}

}
