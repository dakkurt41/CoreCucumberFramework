package com.SuperHero.step_definitions;

import com.SuperHero.pages.SuperHeroLoginPage;
import com.project001.utilities.ConfigurationReader;
import com.project001.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SuperHeroLoginStepDef {
    // create an object to get methods and locators from LoginPAge
    public SuperHeroLoginPage lp = new SuperHeroLoginPage();


    @When("user open login page1")
    public void user_open_login_page() {

        Driver.get().get(ConfigurationReader.getProperty("superHeroUrl"));
    }

    @Then("user enter emails and password")
    public void user_enter_emails_and_password() throws InterruptedException {

        lp.loginToHomePage();
    }

    @Then("user verifies the title of home page")
    public void user_verifies_the_title_of_home_page() {
        Assert.assertEquals(Driver.get().getTitle(), "Superhero Roster");
    }


    @And("user navigate home link and verify the title")
    public void userNavigateHomeLinkAndVerifyTheTitle() {
        lp.navigateHomeLink();
    }
}
