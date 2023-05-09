package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class GearPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffleElement;

    public void clickOnOvernightDuffleElement() throws InterruptedException {
        Reporter.log("CLick on Overnight Duffle " + overnightDuffleElement.toString());
        CustomListeners.test.log(Status.PASS, "CLick on Overnight Duffle " + overnightDuffleElement.toString());
        Thread.sleep(1000);
        clickOnElement(overnightDuffleElement);
    }

}
