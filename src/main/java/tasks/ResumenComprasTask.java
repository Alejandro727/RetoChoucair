package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.HomePage;

public class ResumenComprasTask implements Task {
    public static ResumenComprasTask ResumenCompras() {
        return Tasks.instrumented(ResumenComprasTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(WaitUntil.the(HomePage.BTN_CARRITO_DE_COMPRAS, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomePage.BTN_CARRITO_DE_COMPRAS));
    }
    public void Sleep(int mill) throws InterruptedException {
        Thread.sleep(mill);
    }
}
