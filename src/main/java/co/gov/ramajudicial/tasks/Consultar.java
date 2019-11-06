package co.gov.ramajudicial.tasks;

import co.gov.ramajudicial.interactions.Verificar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.gov.ramajudicial.userinterfaces.ConsultaProcesosPage.*;
import static co.gov.ramajudicial.userinterfaces.ConsultaProcesosPage.BARRA_CONFIRMACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Consultar implements Task {
    private String ciudad;
    private String entidad;
    private String numeroRadicacion;

    public Consultar(String ciudad, String entidad, String numeroRadicacion) {
        this.ciudad = ciudad;
        this.entidad = entidad;
        this.numeroRadicacion = numeroRadicacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(ciudad).from(LST_CIUDAD),
                Verificar.carga(),
                Click.on(LST_ENTIDAD.of(entidad)),
                Enter.theValue(numeroRadicacion).into(INPUT_NUMERO_RADICACION),
                Click.on(BARRA_CONFIRMACION)
        );
    }

    public static Consultar proceso(String ciudad, String entidad, String numeroRadicacion) {
        return instrumented(Consultar.class, ciudad, entidad, numeroRadicacion);
    }
}
