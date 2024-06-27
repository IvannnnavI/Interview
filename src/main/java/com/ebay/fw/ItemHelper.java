package com.ebay.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends BaseHelper{
    public ItemHelper(WebDriver driver) {
        super(driver);
    }

    public String getSecondItemName(String number) {
        return driver.findElement(By.cssSelector(".s-item:nth-child("+ number+") h3")).getText();
    }

    public void searchSecondItem(String secondItemName) {
        type(By.id("gh-ac"), secondItemName);
        click(By.id("gh-btn"));
    }


}
