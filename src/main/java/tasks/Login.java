package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import utils.Random;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.parseInt;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterface.LoginManagement.*;
import net.serenitybdd.screenplay.ensure.Ensure;

public class Login implements Task {


    private final List<String> list;
    private final List<String> values = Collections.singletonList("Come Visit Us");


    @Override
    public <T extends Actor> void performAs(T actor) {
        String EMAIL_DOMAIN = "@gmail.com";
        int parOrInpar = parseInt(Random.generate());
        actor.attemptsTo(
                Ensure.that(INFO).textValues().containsExactlyElementsFrom(values),
                Click.on(SIGN_IN),
                Enter.theValue(list.get(19) + Random.generate() + EMAIL_DOMAIN).into(INPUT_EMAIL),
                Click.on(BUTTON_LOGIN),
                (parOrInpar % 2 == 0) ? Click.on(SELECT_MR) : Click.on(SELECT_MRS),
                Enter.theValue(list.get(20)).into(INPUT_NAME),
                Enter.theValue(list.get(21)).into(INPUT_LAST_NAME),
                Enter.theValue(list.get(16) + Random.generate() + EMAIL_DOMAIN).into(INPUT_CONFIRM_EMAIL),
                Enter.theValue(list.get(22)).into(INPUT_PASS),
                Click.on(SELECT_DAY.of(String.valueOf(parseInt(list.get(23)) + 1))),
                Click.on(SELECT_MONTH.of(list.get(24))),
                Click.on(SELECT_YEAR.of(list.get(25))),
                Click.on(SELECT_CHECK_NEWSLETTER),
                Click.on(SELECT_CHECK_PARTNERS),
                Enter.theValue(list.get(26)).into(INPUT_FIRST_NAME_ADDRESS),
                Enter.theValue(list.get(27)).into(INPUT_LAST_NAME_ADDRESS),
                Enter.theValue(list.get(28)).into(INPUT_COMPANY),
                Enter.theValue(list.get(29)).into(INPUT_ADDRESS_1),
                Enter.theValue(list.get(30)).into(INPUT_ADDRESS_2),
                Enter.theValue(list.get(31)).into(INPUT_CITY),
                Click.on(STATE_LIST),
                Click.on(STATE_SELECT.of(list.get(32))),
                Enter.theValue(list.get(33)).into(POSTAL_CODE_ZIP),
                Click.on(COUNTRY_LIST),
                Click.on(COUNTRY_USA),
                Enter.theValue(list.get(34)).into(OTHER_INPUT),
                Enter.theValue(list.get(35)).into(HOME_PHONE_INPUT),
                Enter.theValue(list.get(36)).into(PHONE_MOBILE_INPUT),
                Enter.theValue(list.get(37)).into(ALIAS_ADDRESS_INPUT),
                WaitUntil.the(REGISTRY_BUTTON, isClickable()).forNoMoreThan(3).seconds(),
                Click.on(REGISTRY_BUTTON)
        );
    }

    public Login(List<String> list) {
        this.list = list;
    }

    public static Login inPage(List<String> list) {
        return Tasks.instrumented(Login.class, list);
    }
}