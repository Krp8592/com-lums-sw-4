package com.luma.testsuite;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OvernightDufflePage;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {

    HomePage homePage;
    GearPage gearPage;
    ShoppingCartPage shoppingCartPage;
    OvernightDufflePage overnightDufflePage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        gearPage = new GearPage();
        shoppingCartPage = new ShoppingCartPage();
        overnightDufflePage = new OvernightDufflePage();
    }


    @Test(groups = {"sanity", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        // Mouse Hover on Gear Menu
        homePage.mouseHoverOnGearMenu();

        // Click on Bags
        homePage.mouseHoverAndClickOnBags();

        // Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOvernightDuffleElement();

        // Verify the text ‘Overnight Duffle’
        String expectedText = "Overnight Duffle";
        String actualText = overnightDufflePage.getOvernightDuffleText();
        Assert.assertEquals(expectedText, actualText, "Overnight Duffle text element is not displayed");

        // Change Qty 3
        overnightDufflePage.sendQtyToInputQuantityBox("3");

        // Click on ‘Add to Cart’ Button.
        overnightDufflePage.clickOnOverAddToCartButton();

        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        expectedText = "You added Overnight Duffle to your shopping cart.";
        actualText = overnightDufflePage.getAddedToCartMessage();
        Assert.assertEquals(expectedText, actualText, "Added to shooping cart message not displayed.");

        // Click on ‘shopping cart’ Link into message
        overnightDufflePage.clickOnShoppingCartElement();

        // Verify the product name ‘Overnight Duffle’
        expectedText = "Overnight Duffle";
        actualText = shoppingCartPage.getTextProductNameTextElement();
        Assert.assertEquals(expectedText, actualText, "'Overnight Duffle' text element is not displayed.");

        //Verify the Qty is ‘3’
        expectedText = "3";
        actualText = shoppingCartPage.getInputQty();
        Assert.assertEquals(expectedText, actualText, "'3' text element is not displayed.");

        //Verify the Qty is ‘$135.00’
        expectedText = "$135.00";
        actualText = shoppingCartPage.getProductPrice();
        Assert.assertEquals(expectedText, actualText, "'$135.00' text element is not displayed.");

        // Change Qty to ‘5’
        shoppingCartPage.sendQtyToUpdateInQuantityBox("5");

        // Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickUpdateShoppingCartButton();

        // Verify the product price ‘$225.00’
        expectedText = "$225.00";
        actualText = shoppingCartPage.getUpdatedProductPrice();
        Assert.assertEquals(expectedText, actualText, "'$225.00' text element is not displayed.");

    }
}
