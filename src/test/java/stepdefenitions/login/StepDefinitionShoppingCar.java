package stepdefenitions.login;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.Shopping;


public class StepDefinitionShoppingCar {


    @When("The user enters items in the shopping cart")
    public void the_user_enters_items_in_the_shopping_cart() {
        OnStage.theActorInTheSpotlight().attemptsTo(Shopping.inCar());

    }

    @Then("The user verifies that their items have been added")
    public void the_user_verifies_that_their_items_have_been_added() {

    }
}
