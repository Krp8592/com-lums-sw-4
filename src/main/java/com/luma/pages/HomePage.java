package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement womenTops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
            WebElement womenJackets;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
            WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
            WebElement menBottoms;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
            WebElement menPants;

    @FindBy(xpath = "//span[normalize-space()='Gear']")
            WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement gearBags;


    public void mouseHoverOnWomenMenu() throws InterruptedException {
        Reporter.log("Mouse Hover on Women Menu " + womenMenu.toString());
        CustomListeners.test.log(Status.PASS, "Mouse Hover on Women Menu " + womenMenu.toString());
        Thread.sleep(1000);
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() throws InterruptedException {
        Reporter.log("Mouse Hover on Women Tops " + womenTops.toString());
        CustomListeners.test.log(Status.PASS, "Mouse Hover on Women Tops " + womenTops.toString());
        Thread.sleep(1000);
        mouseHoverToElement(womenTops);
    }

    public void mouseHoverAndClickOnJackets() throws InterruptedException {
        Reporter.log("Mouse Hover on Jackets and Click " + womenJackets.toString());
        CustomListeners.test.log(Status.PASS, "Mouse Hover on Women Jackets and click " + womenJackets.toString());
        Thread.sleep(1000);
        mouseHoverToElementAndClick(womenJackets);
    }

    public void mouseHoverOnMenMenu() throws InterruptedException {
        Reporter.log("Mouse Hover on men Menu " + menMenu.toString());
        CustomListeners.test.log(Status.PASS, "Mouse Hover on men Menu " + menMenu.toString());
        Thread.sleep(1000);
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottoms() throws InterruptedException {
        Reporter.log("Mouse Hover on men Bottoms " + menBottoms.toString());
        CustomListeners.test.log(Status.PASS, "Mouse Hover on men Bottoms " + menBottoms.toString());
        Thread.sleep(1000);
        mouseHoverToElement(menBottoms);
    }

    public void mouseHoverAndClickOnPants() throws InterruptedException {
        Reporter.log("Mouse Hover on men Pants and click " + menPants.toString());
        CustomListeners.test.log(Status.PASS, "Mouse Hover on men Pants and click " + menPants.toString());
        Thread.sleep(1000);
        mouseHoverToElementAndClick(menPants);
    }


    public void mouseHoverOnGearMenu() throws InterruptedException {
        Reporter.log("Mouse Hover on Gear Menu " + gearMenu.toString());
        CustomListeners.test.log(Status.PASS, "Mouse Hover on Gear Menu " + gearMenu.toString());
        Thread.sleep(1000);
        mouseHoverToElement(gearMenu);
    }

    public void mouseHoverAndClickOnBags() throws InterruptedException {
        Reporter.log("Mouse Hover on bags and click " + gearBags.toString());
        CustomListeners.test.log(Status.PASS, "Mouse Hover on bags and click " + gearBags.toString());
        Thread.sleep(1000);
        mouseHoverToElementAndClick(gearBags);
    }
}
