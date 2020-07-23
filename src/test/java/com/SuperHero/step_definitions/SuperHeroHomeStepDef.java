package com.SuperHero.step_definitions;

import com.SuperHero.pages.SuperHeroHomePage;
import com.SuperHero.pages.SuperHeroLoginPage;
import com.project001.utilities.ConfigurationReader;
import com.project001.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SuperHeroHomeStepDef {
    // create an object to get methods and locators from LoginPAge
    public SuperHeroLoginPage lp = new SuperHeroLoginPage();
    public SuperHeroHomePage hp = new SuperHeroHomePage();

    @Then("user verifies the title of super hero table name")
    public void user_verifies_the_title_of_super_hero_table_name() throws InterruptedException {
       hp.verifyTableNameTitle();
    }

}
