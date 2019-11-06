package co.gov.ramajudicial.stepdefinitions;

import co.gov.ramajudicial.tasks.Abrir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;

import static co.gov.ramajudicial.utils.Constantes.NAVEGADOR;

public class Hooks {

    @Managed(driver = NAVEGADOR)
    private WebDriver suNavegador;
    public static final Actor Daniel = Actor.named("Daniel");

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Before
    public void inicializacion() {
        Daniel.can(BrowseTheWeb.with(suNavegador));
        Daniel.wasAbleTo(Abrir.elNavegador());
    }
}
