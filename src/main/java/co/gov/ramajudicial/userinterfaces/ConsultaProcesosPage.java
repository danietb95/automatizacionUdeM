package co.gov.ramajudicial.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConsultaProcesosPage {
    public static final Target LST_CIUDAD = Target.the("Listado de ciudades").located(By.id("ddlCiudad"));
    public static final Target LST_ENTIDAD = Target.the("Listado de entidades").locatedBy("//option[contains(.,'{0}')]");
    public static final Target INPUT_NUMERO_RADICACION = Target.the("Número de radicación").locatedBy("//div[@id='divNumRadicacion']//tr[.//h1[contains(.,'Número de Radicación')]]/following-sibling::tr[1]//input");
    public static final Target LBL_CARGANDO = Target.the("Pop up de carga").locatedBy("//td[contains(.,'CARGANDO')]");
    public static final Target BARRA_CONFIRMACION = Target.the("Barra de confirmación").located(By.id("sliderBehaviorNumeroProceso_railElement"));
    public static final Target LBL_BARRA_CONFIRMACION = Target.the("Label barra de confirmación").located(By.id("ConsultarNum"));
    public static final Target BTN_CONTINUAR = Target.the("Boton continuar").locatedBy("//div[@id='divNumRadicacion']//input[@value='Consultar']");

    private ConsultaProcesosPage() {
    }
}
