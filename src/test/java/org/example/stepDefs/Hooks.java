package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void OpenBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
       // driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String baseUrl = "https://demo.nopcommerce.com/";
        driver.navigate().to(baseUrl);

    }

    @After
    public static void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}