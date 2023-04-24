package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.CategoriaTask;
import tasks.OpenUp;
import tasks.ResumenComprasTask;
import tasks.TiendasExitoProductSelectionTasks;
import ui.HomePage;

public class TiendasExitoSteps {

    private HomePage HomePage = new HomePage();

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("el usuario está en la página de Tiendas Éxito")
    public void elUsuarioEstáEnLaPáginaDeTiendasÉxito() {
        OnStage.theActorCalled("Cliente").wasAbleTo(OpenUp.thePage());
    }
    @When("el usuario selecciona la categoría {string}")
    public void elUsuarioSeleccionaLaCategoría(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(CategoriaTask.SeleccionCategorias());
        

    }
    @When("el usuario selecciona la subcategoría {string}")
    public void elUsuarioSeleccionaLaSubcategoría(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("el usuario debería ver una lista de productos")
    public void elUsuarioDeberíaVerUnaListaDeProductos() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("el usuario elige {int} productos al azar debe tener una cantidad aleatoria entre 1 y 10")
    public void elUsuarioEligeProductosAlAzar(Integer int1) {
        OnStage.theActorInTheSpotlight().attemptsTo(TiendasExitoProductSelectionTasks.Seleccion(ui.HomePage.productList));

    }
    @Then("el usuario debería ver los detalles de cada producto seleccionado")
    public void elUsuarioDeberíaVerLosDetallesDeCadaProductoSeleccionado() {
        OnStage.theActorInTheSpotlight().attemptsTo(ResumenComprasTask.ResumenCompras());

    }

}
