package com.SuperHero.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/mdogan/Desktop/project2020/CoreCucumber/CoreCucumberFramework/src/test/resources",
        glue = "/Users/mdogan/Desktop/project2020/CoreCucumber/CoreCucumberFramework/src/test/java/com/SuperHero/step_definitions",
        dryRun = false,
        tags = "@smoke",
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)
public class CucumberRunner {

}
