package co.gov.ramajudicial.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Scroll;

import static co.gov.ramajudicial.userinterfaces.InicioPage.BTN_CONSULTA_PROCESO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirConsulta implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_CONSULTA_PROCESO).andAlignToBottom(),
                Click.on(BTN_CONSULTA_PROCESO)
        );
    }

    public static Performable proceso() {
        return instrumented(AbrirConsulta.class);
    }
}
