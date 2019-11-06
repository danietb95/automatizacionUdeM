package co.gov.ramajudicial.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.gov.ramajudicial.userinterfaces.ConsultaProcesosPage.LBL_BARRA_CONFIRMACION;

public class TextoBarra implements Question<Boolean> {
    private String mensaje;

    public TextoBarra(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_BARRA_CONFIRMACION.resolveFor(actor).getText().contains(mensaje);
    }

    public static TextoBarra VerificacionContiene(String mensaje){
        return new TextoBarra(mensaje);
    }
}
