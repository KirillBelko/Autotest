package tests.base;

import common.CommonAction;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.cart.CartPage;
import pages.checkout.CheckoutPage;

import static common.Config.BROWSER_OPEN;
import static common.Config.CLEAR_COOKIES;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected CartPage cartPage = new CartPage(driver);
    protected CheckoutPage checkoutPage = new CheckoutPage(driver);

    @AfterEach
    void clearCookiesStorage() {
        if (CLEAR_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterAll
    void close() {
        if (!BROWSER_OPEN) {
            driver.close();
        }
    }

}
