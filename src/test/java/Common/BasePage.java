package Common;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.log4testng.Logger;

import java.time.Duration;
import java.util.Properties;

public class BasePage {
    public static Logger logger = Logger.getLogger(BasePage.class);

    public static WebDriver driver = null;
//    "hello"

}
