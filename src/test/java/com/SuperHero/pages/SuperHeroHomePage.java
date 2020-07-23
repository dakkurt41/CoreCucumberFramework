package com.SuperHero.pages;


import com.project001.utilities.BrowserUtils;
import com.project001.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperHeroHomePage {


    // constructor
    public SuperHeroHomePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    //locators

    @FindBy(css = "body > div.container-fluid > div:nth-child(4) > h3")
    public WebElement tableNameTitle;





    public void verifyTableNameTitle() throws InterruptedException {
        Assert.assertEquals("Build Your Superhero Roster:", tableNameTitle.getText());
    }





}
