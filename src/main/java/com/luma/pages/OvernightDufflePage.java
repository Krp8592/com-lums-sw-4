package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OvernightDufflePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overnightDuffleTextElement;
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement inputQuantityBox;

    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedToShoppingCartTextMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    public String getOvernightDuffleText() throws InterruptedException {
        Reporter.log("Getting text to verify 'Overnight Duffle' " + overnightDuffleTextElement.toString());
        CustomListeners.test.log(Status.PASS, "Getting text to verify 'Overnight Duffle' " + overnightDuffleTextElement.toString());
        Thread.sleep(1000);
        return getTextFromElement(overnightDuffleTextElement);
    }

    public void sendQtyToInputQuantityBox(String quantity) throws InterruptedException {
        Reporter.log("Changing the quantity in quantity box " + inputQuantityBox.toString());
        CustomListeners.test.log(Status.PASS, "Getting text to verify 'Overnight Duffle' " + inputQuantityBox.toString());
        Thread.sleep(2000);
        sendTextToElement(inputQuantityBox, quantity);
    }

    public void clickOnOverAddToCartButton() throws InterruptedException {
        Reporter.log("Click on added to cart button " + addToCartButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on added to cart button " + addToCartButton.toString());
        Thread.sleep(1000);
        clickOnElement(addToCartButton);
    }

    public String getAddedToCartMessage() throws InterruptedException {
        Reporter.log("Get the text element to verify added to cart message " + addedToShoppingCartTextMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get the text element to verify added to cart message  " + addedToShoppingCartTextMessage.toString());
        Thread.sleep(1000);
        return getTextFromElement(addedToShoppingCartTextMessage);
    }

    public void clickOnShoppingCartElement() throws InterruptedException {
        Reporter.log("Click on shopping cart element shown in the message" + shoppingCart.toString());
        CustomListeners.test.log(Status.PASS, "Click on shopping cart element shown in the message" + shoppingCart.toString());
        Thread.sleep(1000);
        clickOnElement(shoppingCart);
    }

}
