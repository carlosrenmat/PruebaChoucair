package co.com.choucair.certificacion.Pchoucair.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/reto.feature",
        glue = "co.com.choucair.certificacion.Pchoucair.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class run {
}
