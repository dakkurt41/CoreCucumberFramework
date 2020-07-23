package com.SuperHero.pages;


import com.project001.utilities.BrowserUtils;
import com.project001.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperHeroLoginPage {


    // variables
    public String url = "https://glitchitsystem.com/superhero/";


    // constructor
    public SuperHeroLoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    //locators

    @FindBy(id = "loginEmail")
    public WebElement email;

    @FindBy(id = "loginPassword")
    public WebElement password;


    @FindBy(css = "#form-login > button")
    public WebElement submitButton;

    @FindBy(id = "login-title")
    public WebElement loginTitleText;


    @FindBy(css = "#navbarSupportedContent > ul > li.nav-item.active > a")
    public WebElement homeNavLink;



    // methods


    public void loginToHomePage() throws InterruptedException {
        email.sendKeys("data@gmail.com");
        BrowserUtils.wait(1);
        password.sendKeys("23456789");
        Thread.sleep(1000);
        submitButton.click();
        BrowserUtils.waitForPageToLoad(1);
    }


    public void navigateHomeLink(){
        homeNavLink.click();
        BrowserUtils.wait(1);
        Assert.assertEquals("Welcome. Please Log In.", loginTitleText.getText());
    }



}
