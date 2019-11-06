package co.gov.ramajudicial.stepdefinitions;

import co.gov.ramajudicial.questions.TextoBarra;
import co.gov.ramajudicial.questions.VerificarBoton;
import co.gov.ramajudicial.tasks.AbrirConsulta;
import co.gov.ramajudicial.tasks.Consultar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.gov.ramajudicial.stepdefinitions.Hooks.Daniel;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ConsultaProcesoStepDefinition {

    @Dado("^que el actor esta consultando el proceso judicial$")
    public void actorConsultaProcesoJudicial() {
        Daniel.attemptsTo(
                AbrirConsulta.proceso()
        );
    }

    @Entonces("^selecciona Ciudad (.*), entidad (.*) y numero de radicado (.*)$")
    public void seleccionarDatosConsultaRadicado(String ciudad, String entidad, String numeroRadicacion) {
        Daniel.attemptsTo(
                Consultar.proceso(ciudad, entidad, numeroRadicacion)
        );
    }

    @Cuando("^debe poder activar la consulta$")
    public void debePoderActivarConsultas() {
        Daniel.should(
                seeThat(
                        VerificarBoton.continuarEsteHabilitado()),
                seeThat(
                        TextoBarra.VerificacionContiene("Deslice la barra a la derecha para iniciar la consulta"))
        );
    }
}
