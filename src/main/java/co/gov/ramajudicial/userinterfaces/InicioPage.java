package co.gov.ramajudicial.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.ramajudicial.gov.co")
public class InicioPage extends PageObject {
    public static final Target BTN_CONSULTA_PROCESO = Target.the("Boton consulta de proceso").locatedBy("//a[contains(.,'Consulta de Procesos')]/..");

    private InicioPage() {
    }
}
