package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.MenPage;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {


    HomePage homePage;
    MenPage menPage;

    ShoppingCartPage shoppingCartPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        menPage = new MenPage();
        shoppingCartPage = new ShoppingCartPage();
    }


    @Test(groups = {"sanity", "regression"})
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {

        //Mouse Hover on men Menu
        homePage.mouseHoverOnMenMenu();

        //Mouse Hover on Bottoms
        homePage.mouseHoverOnBottoms();

        //Click on pants
        homePage.mouseHoverAndClickOnPants();

        // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
        menPage.mouseHoverOnCoronusYogaPantsAndClickOn32();

        // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
        menPage.mouseHoverOnCoronusYogaPantsAndClickOnBlack();

        // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
        menPage.mouseHoverOnCoronusYogaPantsAndClickOnAddToCart();

        // Verify the text You added Cronus Yoga Pant to your shopping cart.
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = menPage.getAddedToCartMessage();
        Assert.assertEquals(expectedText, actualText, "The added to cart message is not displayed");

        // Click on ‘shopping cart’ Link into message
        menPage.clickOnShoppingCartElement();

        // Verify the text "Shopping Cart".
        expectedText = "Shopping Cart";
        actualText = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(expectedText, actualText, "Shopping cart text element is not displayed");

        // Verify the product name ‘Cronus Yoga Pant
        expectedText = "Cronus Yoga Pant";
        actualText = shoppingCartPage.getCoronusYogaPantText();
        Assert.assertEquals(expectedText, actualText, "Cronus Yoga Pant text element is not displayed");

        // Verify the product size ‘32’.
        expectedText = "32";
        actualText = shoppingCartPage.getSize32Text();
        Assert.assertEquals(expectedText, actualText, "'32' text element is not displayed");

        // Verify the product colour ‘Black’
        expectedText = "Black";
        actualText = shoppingCartPage.getColourBlackText();
        Assert.assertEquals(expectedText, actualText, "'Black' text element is not displayed");
    }
}
