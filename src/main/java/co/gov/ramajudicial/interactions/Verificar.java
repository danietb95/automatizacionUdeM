package co.gov.ramajudicial.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static co.gov.ramajudicial.userinterfaces.ConsultaProcesosPage.LBL_CARGANDO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Verificar implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (LBL_CARGANDO.resolveFor(actor).isVisible()){
        }
    }

    public static Verificar carga(){
        return instrumented(Verificar.class);
    }
}
