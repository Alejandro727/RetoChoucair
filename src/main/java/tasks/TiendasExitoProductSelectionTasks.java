package tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.HomePage;

import java.util.List;
import java.util.Random;


public class TiendasExitoProductSelectionTasks implements Task {
    private final Target product;

    public TiendasExitoProductSelectionTasks(Target product) {
        this.product = product;
    }


    public static TiendasExitoProductSelectionTasks Seleccion(Target product) {
        return Tasks.instrumented(TiendasExitoProductSelectionTasks.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (int i = 0; i <= 4; i++) {
            List<WebElementFacade> productList = product.resolveAllFor(actor);
            WebElementFacade radom = productList.get(new Random().nextInt(productList.size()));
            try {
                Sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            actor.attemptsTo(Click.on(radom),
                    WaitUntil.the(HomePage.BTN_AGREGAR, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(HomePage.BTN_AGREGAR));
            for (int j = 0; j < Random(); j++) {
                actor.attemptsTo(
                        WaitUntil.the(HomePage.BTN_ADICIONAR_PRODUCTO, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                        Click.on(HomePage.BTN_ADICIONAR_PRODUCTO));
            }

            actor.attemptsTo(
                    WaitUntil.the(HomePage.BTN_CONTINUAR_COMPRANDO, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(HomePage.BTN_CONTINUAR_COMPRANDO)


            );
        }
    }

    public int Random() {
        Random random = new Random();
        //random.setSeed(10);
        //int num = (10)+1;
        return random.nextInt(2) + 1;
    }

    public void Sleep(int mill) throws InterruptedException {
        Thread.sleep(mill);
    }
}
