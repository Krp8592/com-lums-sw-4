package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MenPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement coronusYogaPants;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
            WebElement coronusYogaPants32;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
            WebElement coronusYogaPantsBlack;
    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
            WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
            WebElement addedToShoppingCartTextMessage;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
            WebElement shoppingCart;

    public void mouseHoverOnCoronusYogaPantsAndClickOn32() throws InterruptedException {
        Reporter.log("Mouse hover on Coronus Yoga Pants And click on size '32'  " + coronusYogaPants32.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover on Coronus Yoga Pants And click on size '32'  " + coronusYogaPants32.toString());
        Thread.sleep(1000);
        mouseHoverToElement(coronusYogaPants);
        mouseHoverToElementAndClick(coronusYogaPants32);
    }

    public void mouseHoverOnCoronusYogaPantsAndClickOnBlack() throws InterruptedException {
        Reporter.log("Mouse hover on Coronus Yoga Pants And click on colour 'Black'  " + coronusYogaPantsBlack.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover on Coronus Yoga Pants And click on colour 'Black'  " + coronusYogaPantsBlack.toString());
        Thread.sleep(1000);
        mouseHoverToElement(coronusYogaPants);
        mouseHoverToElementAndClick(coronusYogaPantsBlack);
    }

    public void mouseHoverOnCoronusYogaPantsAndClickOnAddToCart() throws InterruptedException {
        Reporter.log("Mouse hover on Coronus Yoga Pants And click on add to cart button " + addToCart.toString());
        CustomListeners.test.log(Status.PASS, "Mouse hover on Coronus Yoga Pants And click add to cart button  " + addToCart.toString());
        Thread.sleep(1000);
        mouseHoverToElement(coronusYogaPants);
        mouseHoverToElementAndClick(addToCart);
    }

    public String getAddedToCartMessage(){
        Reporter.log("Get the text element to verify added to cart message " + addedToShoppingCartTextMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get the text element to verify added to cart message  " + addedToShoppingCartTextMessage.toString());
        return getTextFromElement(addedToShoppingCartTextMessage);
    }

    public void clickOnShoppingCartElement(){
        Reporter.log("Click on shopping cart element shown in the message" + shoppingCart.toString());
        CustomListeners.test.log(Status.PASS, "Click on shopping cart element shown in the message" + shoppingCart.toString());
        clickOnElement(shoppingCart);
    }


}
