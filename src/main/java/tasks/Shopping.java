package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.HoverOverBy;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;


import static userinterface.ShoppingManagement.*;

public class Shopping implements Task {
    private static String priceValue;

    @Override
    public <T extends Actor> void performAs(T actor) {
        priceValue = Text.of(PRICE).viewedBy(actor).asString().replace("$","");
        actor.attemptsTo(
                Ensure.that(PRICE).textValues().contains("$16.51"),
                Ensure.that(priceValue).asADouble().isEqualTo(16.51d),
                Ensure.that(priceValue).matches("(.*).(.*)"),
                Ensure.that(IMAGE_ONE).isDisplayed(),
                Ensure.that(IMAGE_TWO).isEnabled(),
                HoverOverBy.over(IMAGE_ONE),
                Click.on(ADD_TO_CART.of("1")),
                Click.on(CONTINUE_SHOPPING),
                HoverOverBy.over(IMAGE_TWO),
                Click.on(ADD_TO_CART.of("2")),
                Click.on(CONTINUE_SHOPPING),
                Click.on(SHOPPING_CART)
        );
    }


    public static Shopping inCar() {
        return Tasks.instrumented(Shopping.class);
    }
}