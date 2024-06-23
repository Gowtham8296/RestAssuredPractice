package StepDefFiles;

import Common.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
//import io.cucumber.java8.En;
import io.cucumber.java8.En;
import javaFiles.APITests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class TestStepdef extends BasePage implements En {
    @Before
    public void initialiseDriver(Scenario scenario) {
        scenario.attach("hi","text-line","randomId");
        String browser = System.getProperty("browser");
        if(browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")){
            driver = new InternetExplorerDriver();
        } else {
            logger.info("Invalid browser");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @After
    public void quitBrowser() {
        if(driver != null) {
            driver.quit();
        }
    }
   public TestStepdef () {
       Given("I m n XYZ page", () -> {
           APITests.driverLauncher();
       });
       And("^I wait for driver to quit (.+)$",(String wait) -> {
           APITests.driverquit(wait);
       });

   }

//    @Given("I m n XYZ page")
//        APITests.driverLauncher();


}
