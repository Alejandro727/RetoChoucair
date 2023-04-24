package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.HomePage;

public class CategoriaTask implements Task {

    public static CategoriaTask SeleccionCategorias() {
        return Tasks.instrumented(CategoriaTask.class);
    }

        @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(HomePage.SELECT_CATEGORY_MENU, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomePage.SELECT_CATEGORY_MENU),
                Click.on(HomePage.SELECT_CATEGORY_DORMITORIO),
                Click.on(HomePage.SELECT_CATEGORY_CABECEROS)
        );
    }
}
