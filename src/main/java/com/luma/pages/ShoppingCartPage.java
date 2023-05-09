package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productNameTextElement;

    //Verify the Qty is ‘3’
    By attributeValue = By.xpath("//input[@title='Qty']");
    @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement productPrice;
    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement updateShoppingCartField;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCartButton;

    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement updatedProductPrice;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartTextElement;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement coronusYogaPantsTextElement;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size32TextElement;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement colourBlackTextElement;

    public String getTextProductNameTextElement() throws InterruptedException {
        Reporter.log("Getting text to verify product name " + productNameTextElement.toString());
        CustomListeners.test.log(Status.PASS, "Getting text to verify product name " + productNameTextElement.toString());
        Thread.sleep(1000);
        return getTextFromElement(productNameTextElement);
    }

    public String getInputQty() throws InterruptedException {
        Reporter.log("Getting text to verify quantity " + attributeValue.toString());
        CustomListeners.test.log(Status.PASS, "Getting text to verify quantity " + attributeValue.toString());
        Thread.sleep(1000);
        return getAttributeValueFromElement((By) attributeValue);
    }

    public String getProductPrice() throws InterruptedException {
        Reporter.log("Getting text to verify product price " + productPrice.toString());
        CustomListeners.test.log(Status.PASS, "Getting text to verify product price " + productPrice.toString());
        Thread.sleep(1000);
        return getTextFromElement(productPrice);
    }

    public void sendQtyToUpdateInQuantityBox(String quantity) throws InterruptedException {
        Reporter.log("Entering new quantity to quantity box " + updateShoppingCartField.toString());
        CustomListeners.test.log(Status.PASS, "Entering new quantity to quantity box " + updateShoppingCartField.toString());
        Thread.sleep(2000);
        sendTextToElement(updateShoppingCartField, quantity);
    }

    public void clickUpdateShoppingCartButton() throws InterruptedException {
        Reporter.log("Click on update shopping cart button " + updateShoppingCartButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on update shopping cart button " + updateShoppingCartButton.toString());
        Thread.sleep(1000);
        clickOnElement(updateShoppingCartButton);
    }

    public String getUpdatedProductPrice() throws InterruptedException {
        Reporter.log("Getting the updated product price to verify " + updatedProductPrice.toString());
        CustomListeners.test.log(Status.PASS, "Getting the updated product price to verify " + updatedProductPrice.toString());
        Thread.sleep(1000);
        return getTextFromElement(updatedProductPrice);
    }

    public String getShoppingCartText(){
        Reporter.log("Getting the Shopping cart text element " + shoppingCartTextElement.toString());
        CustomListeners.test.log(Status.PASS, "Getting the Shopping cart text element " + shoppingCartTextElement.toString());
        return getTextFromElement(shoppingCartTextElement);
    }

    public String getCoronusYogaPantText(){
        Reporter.log("Getting the Yoga Pant text element " + coronusYogaPantsTextElement.toString());
        CustomListeners.test.log(Status.PASS, "Getting theYoga Pant text element " + coronusYogaPantsTextElement.toString());
        return getTextFromElement(coronusYogaPantsTextElement);
    }

    public String getSize32Text(){
        Reporter.log("Getting the text element of size to verify " + size32TextElement.toString());
        CustomListeners.test.log(Status.PASS, "Getting the text element of size to verify " + size32TextElement.toString());
        return getTextFromElement(size32TextElement);
    }

    public String getColourBlackText(){
        Reporter.log("Getting the text element of colour to verify " + colourBlackTextElement.toString());
        CustomListeners.test.log(Status.PASS, "Getting the text element of colour to verify " + colourBlackTextElement.toString());
        return getTextFromElement(colourBlackTextElement);
    }
}
