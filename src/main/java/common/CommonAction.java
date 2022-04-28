package common;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static common.Config.BROWSER;
import static constants.Constant.Timeout.IMPLICIT_WAIT;

public class CommonAction {

    public static WebDriver createDriver()
    {
        WebDriver driver = null;
        switch (BROWSER)
        {
            case "chromedriver" :
                System.setProperty("webdriver.chrome.driver", "D:\\WORK\\Prog\\GD\\src\\main\\resources\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "geckodriver" :
                System.setProperty("webdriver.gecko.driver", "D:\\WORK\\Prog\\GD\\src\\main\\resources\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                Assertions.fail("BROWSER NAME NOT VALID" + BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}