package tests.checkout;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

public class CheckoutPageTest extends BaseTest {

    @Test
    public void PlaceOrderWithGiftcardInCheckout(){
        basePage.OpenCart();
        basePage.GoToCheckout();
 //       basePage.CloseSignUpPopup();
        checkoutPage.FillData();
    }


}
