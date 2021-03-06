package com.myapp.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber.html"
        },
        features = "src/test/resources/features",
        glue = "com/myapp/step_definitions",
        dryRun = true

)
public class TestRunner {
}
