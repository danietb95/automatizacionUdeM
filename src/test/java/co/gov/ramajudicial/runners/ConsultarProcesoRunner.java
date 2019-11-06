package co.gov.ramajudicial.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/consulta_proceso.feature",
        glue = "co.gov.ramajudicial.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ConsultarProcesoRunner {
}
