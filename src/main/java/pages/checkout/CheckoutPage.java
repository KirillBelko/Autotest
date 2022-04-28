package pages.checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import java.util.concurrent.TimeUnit;

import static constants.Constant.Timeout.IMPLICIT_WAIT;
import static constants.Constant.Timeout.WAIT;

public class CheckoutPage extends BasePage {
    WebDriver driver;

    public CheckoutPage (WebDriver driver){
        this.driver = driver;
    }

    public CheckoutPage FillData(){
        WebElement PaymentSelect = driver.findElement(By.xpath("//span[@id='block-mageworx-giftcards-heading']"));
        PaymentSelect.click();
        WebElement PaymentBox = driver.findElement(By.xpath("//input[@name='giftcard_code']"));
        PaymentBox.sendKeys("artemtest");
        WebElement PaymentButton = driver.findElement(By.xpath("//button[@class='action action-apply']"));
        PaymentButton.click();
        WebElement EmailBox = driver.findElement(By.xpath("//input[@id='customer-email']"));
        EmailBox.sendKeys("tanihe9777@topyte.com");
        WebElement FirstBox = driver.findElement(By.xpath("//input[@name='firstname']"));
        FirstBox.sendKeys("DONT");
        WebElement LastBox = driver.findElement(By.xpath("//input[@name='lastname']"));
        LastBox.sendKeys("PRINT");
        WebElement StreetBox = driver.findElement(By.xpath("//input[@name='city']"));
        StreetBox.sendKeys("13405 SE 30th St, Suite 1A");
        WebElement CityBox = driver.findElement(By.xpath("//input[@name='street[0]']"));
        CityBox.sendKeys("Bellevue");
        WebElement ZipBox = driver.findElement(By.xpath("//input[@name='postcode']"));
        ZipBox.sendKeys("98004");
        WebElement CompanyBox = driver.findElement(By.xpath("//input[@name='company']"));
        CompanyBox.sendKeys("TEST ORDER");
        WebElement TelephoneBox = driver.findElement(By.xpath("//input[@name='telephone']"));
        TelephoneBox.sendKeys("1234567890");
        WebElement StateBox = driver.findElement(By.xpath("//select[@name='region_id']/option[@value='62']"));
        StateBox.click();
        WebElement ShippingSelect = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        ShippingSelect.click();

 //      WebElement PlaceOrderButton = driver.findElement(By.xpath("//button[@type='submit'][@title='Place Order']"));
        WebElement PlaceOrderButton = driver.findElement(By.xpath("//div[@class='iosc-place-order-container']"));

        PlaceOrderButton.click();
        return this;
    }
}