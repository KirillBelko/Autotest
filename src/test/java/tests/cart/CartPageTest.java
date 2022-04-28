package tests.cart;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.TEST_PRODUCT;



public class CartPageTest extends BaseTest {

    @Test
    public void GoToProductFromCart1(){
        basePage.OpenCart();
        cartPage.GoToProduct1();
    }
    @Test
    public void GoToProductFromCart2(){
        basePage.OpenCart();
        cartPage.GoToProduct2();
    }
    @Test
    public void GoToEditProduct(){
        basePage.OpenCart();
        cartPage.EditProductInProductFromCart();
    }
    @Test
    public void EditProductInCartPage(){
        basePage.OpenCart();
        cartPage.EditProductInCart();
    }
    @Test
    public void DeleteProductInCartPage(){
        basePage.OpenCart();
        cartPage.DeleteProductInCart();
    }
    @Test
    public void DeleteAllProductInCart(){
        basePage.OpenCart();
        cartPage.DeleteAllProduct();
    }
    @Test
    public void ApplyCouponInCart(){
        basePage.OpenCart();
        cartPage.ApplyDiscount();
    }
    @Test
    public void ApplyGiftNotValidInCart(){
        basePage.OpenCart();
        cartPage.ApplyGiftNotValid();
    }
    @Test
    public void ApplyGiftValidInCart(){
        basePage.OpenCart();
        cartPage.ApplyGiftValid();
    }
    @Test
    public void GoToCheckoutInCart(){
        basePage.OpenCart();
        basePage.GoToCheckout();
    }
}
