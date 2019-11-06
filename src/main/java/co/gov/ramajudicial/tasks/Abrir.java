package co.gov.ramajudicial.tasks;

import co.gov.ramajudicial.userinterfaces.InicioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Task {
    private InicioPage inicioPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(inicioPage));
    }

    public static Performable elNavegador(){
        return instrumented(Abrir.class);
    }
}
