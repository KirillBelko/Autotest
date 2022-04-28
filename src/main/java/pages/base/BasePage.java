package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.Timeout.WAIT;
import static constants.Constant.Urls.TEST_PRODUCT;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) { this.driver = driver; }

    public BasePage() {
    }


    // Навигация по url
    public void goToUrl(String url){
        driver.get(url);
    }

    // Ожидание появления элемента в DOM
    public WebElement WaitElementIsVisible(WebElement element){
        new WebDriverWait(driver, WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;}


    public BasePage CloseSignUpPopup(){
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        WebElement SignUpPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@id='zaius-email__phone_collection_modal_form_general_web_modal']")));
        driver.switchTo().frame(SignUpPopup);
        WebElement SignUpClose = driver.findElement(By.xpath("//div[@id='modal-close']"));
        SignUpClose.click();
        driver.switchTo().defaultContent();
        return this;
    }

    public BasePage GoToCart(){
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        WebElement AddToCart = driver.findElement(By.xpath("//button[@title='Add to Cart']"));
        AddToCart.click();
        WebElement AddedPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mmaddoverajax_popup']")));
        WebElement GoToCartInPopup = driver.findElement(By.xpath("//a[@class='link-to-cart']"));
        GoToCartInPopup.click();
        return this;
    }


    public void OpenCart(){
        goToUrl(TEST_PRODUCT);
        CloseSignUpPopup();
        GoToCart();
    }
    public void GoToCheckout(){
        WebElement GoToCheckoutButton = driver.findElement(By.xpath("//button[@data-role='proceed-to-checkout']"));
        GoToCheckoutButton.click();
    }
}
