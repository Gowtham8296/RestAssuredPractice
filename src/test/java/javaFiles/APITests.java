package javaFiles;

import Common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class APITests extends BasePage {

    public static void driverLauncher() {
        String title = driver.getTitle();
        logger.info(title);
//        assertEquals("Web form", title);
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//        WebElement textBox = driver.findElement(By.name("my-text"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button"));
//        textBox.sendKeys("Selenium");
//        submitButton.click();
//        driver.quit();
    }


    public static void driverquit(String waiting) throws InterruptedException {
//        driver.wait(Integer.parseInt(waiting));
//        driver.quit();
        logger.info("none");
    }
}
