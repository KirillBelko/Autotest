package pages.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import static constants.Constant.Timeout.WAIT;


public class CartPage extends BasePage {
    WebDriver driver;

    public CartPage (WebDriver driver){
        this.driver = driver;
    }

    public CartPage GoToProduct1(){
        WebElement EditButton = driver.findElement(By.xpath("(//img[@class='product-image-photo'])[2]"));
        EditButton.click();
        return this;
    }

    public CartPage GoToProduct2(){
        WebElement EditButton = driver.findElement(By.xpath("(//strong/a[@href='https://www.golfdiscount.com/heat-factory-mini-hand-warmer-2-pack'])[2]"));
        EditButton.click();
        return this;
    }

    public CartPage EditProductInProductFromCart(){
        WebElement EditButton = driver.findElement(By.xpath("//a[@class='action action-edit']"));
        EditButton.click();
        WebElement QtyBox = driver.findElement(By.xpath("//input[@name='qty']"));
        QtyBox.sendKeys(Keys.ARROW_LEFT);
        QtyBox.sendKeys(Keys.DELETE);
        QtyBox.sendKeys("2");
        WebElement UpdateButton = driver.findElement(By.xpath("//button[@title='Update Cart']"));
        UpdateButton.click();
        return this;
    }

    public CartPage EditProductInCart(){
        WebElement QtyBox = driver.findElement(By.xpath("//input[@title='Qty']"));
        QtyBox.sendKeys(Keys.ARROW_LEFT);
        QtyBox.sendKeys(Keys.DELETE);
        QtyBox.sendKeys("2");
        WebElement UpdateButton = driver.findElement(By.xpath("//button[@value='update_qty']"));
        UpdateButton.click();
        return this;
    }

    public CartPage DeleteProductInCart(){
        WebElement DeleteButton = driver.findElement(By.xpath("//a[@class='action action-delete']"));
        DeleteButton.click();
        return this;
    }

    public CartPage DeleteAllProduct(){
        WebElement DeleteButton = driver.findElement(By.xpath("//button[@value='empty_cart']"));
        DeleteButton.click();
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        WebElement Popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='modal-inner-wrap'])[2]")));
        WebElement OKButton = driver.findElement(By.xpath("//button[@class='action-primary action-accept']"));
        OKButton.click();
        return this;
    }

    public CartPage ApplyDiscount(){
        WebElement DiscountButton = driver.findElement(By.xpath("(//strong[@id='block-discount-heading'])[2]"));
        DiscountButton.click();
        WebElement DiscountTextBox = driver.findElement(By.xpath("//input[@id='coupon_code']"));
        DiscountTextBox.sendKeys("tyui765");
        WebElement ApplyButton = driver.findElement(By.xpath("//button[@class='action apply primary']"));
        ApplyButton.click();
        return this;
    }

    public CartPage ApplyGiftNotValid(){
 //       WebElement GiftButton = driver.findElement(By.xpath("//strong[@id='block-discount-heading']"));
 //       GiftButton.click();
        WebElement GiftTextBox = driver.findElement(By.xpath("//input[@name='giftcard_code']"));
        GiftTextBox.sendKeys("testtest");
        WebElement ApplyButton = driver.findElement(By.xpath("//button[@class='action giftcards primary']"));
        ApplyButton.click();
        return this;
    }

    public CartPage ApplyGiftValid(){
 //       WebElement GiftButton = driver.findElement(By.xpath("//strong[@id='block-discount-heading']"));
 //       GiftButton.click();
        WebElement GiftTextBox = driver.findElement(By.xpath("//input[@id='giftcard_code']"));
        GiftTextBox.sendKeys("artemtest");
        WebElement ApplyButton = driver.findElement(By.xpath("//button[@class='action giftcards primary']"));
        ApplyButton.click();
        return this;
    }
}
