package Nikaraz;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/Cart.feature"},
        glue = {"Nikaraz.StepDefs"}, // Adjust based on your package structure
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json"
        }
)
public class TestRunner {
}

