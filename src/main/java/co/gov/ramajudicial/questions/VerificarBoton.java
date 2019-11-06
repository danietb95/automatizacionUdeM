package co.gov.ramajudicial.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.gov.ramajudicial.userinterfaces.ConsultaProcesosPage.BTN_CONTINUAR;

public class VerificarBoton implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_CONTINUAR.resolveFor(actor).isEnabled();
    }

    public static VerificarBoton continuarEsteHabilitado(){
        return new VerificarBoton();
    }
}
