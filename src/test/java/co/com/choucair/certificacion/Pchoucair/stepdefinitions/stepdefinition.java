package co.com.choucair.certificacion.Pchoucair.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.jobs;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.LaRespuesta;
import questions.LaRespuestaC;
import questions.LaRespuestaQ;
import tasks.EnterSpecialCharacters;
import tasks.FindJobsMedellin;
import tasks.FindJobsQuibdo;
import tasks.OpenThe;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static utilities.constants.ZERO;

public class stepdefinition {

    @Before
    public void configuracionInicial(){
        setTheStage(new OnlineCast());
    }

    @Given("^enter the page in the works section$")
    public void enter_the_page_in_the_works_section() {
        theActorCalled("Carlos").wasAbleTo(OpenThe.Page());
    }


    @When("^wants to see the list of jobs in the city of medellin$")
    public void wants_to_see_the_list_of_jobs_in_the_city_of_medellin(List<jobs> data) {
        theActorInTheSpotlight().attemptsTo(FindJobsMedellin.ThePageWith(data.get(ZERO)));
    }

    @Then("^wants to visualize the works in the city of medellin (.*)$")
    public void wants_to_visualize_the_works_in_the_city_of_medellin(String pregunta)  {
        theActorInTheSpotlight().should(seeThat(LaRespuesta.es(pregunta)));
    }


    @Given("^enter the page in the works section choucair$")
    public void enter_the_page_in_the_works_section_choucair()  {
        theActorCalled("Carlos").wasAbleTo(OpenThe.Page());
    }


    @When("^wants to see the list of jobs in the city of Quibdo$")
    public void wants_to_see_the_list_of_jobs_in_the_city_of_Quibdo(List<jobs> data)  {
        theActorInTheSpotlight().attemptsTo(FindJobsQuibdo.ThePageWith(data.get(ZERO)));
    }

    @Then("^wants to visualize the works in the city of Quibdo(.*)$")
    public void wants_to_visualize_the_works_in_the_city_of_Quibdo(String preguntaQ) {
        theActorInTheSpotlight().should(seeThat(LaRespuestaQ.es(preguntaQ)));
    }


    @Given("^enter the page in the works section choucair jobs$")
    public void enter_the_page_in_the_works_section_choucair_jobs() {
        theActorCalled("Carlos").wasAbleTo(OpenThe.Page());
    }


    @When("^wants to enter numbers in the editbox of the choucair works section$")
    public void wants_to_enter_numbers_in_the_editbox_of_the_choucair_works_section(List<jobs> data) {
        theActorInTheSpotlight().attemptsTo(EnterSpecialCharacters.ThePageWith(data.get(ZERO)));
    }

    @Then("^wants the editbox to not support numbers(.*)$")
    public void wants_the_editbox_to_not_support_numbers(String preguntaC) {
        theActorInTheSpotlight().should(seeThat(LaRespuestaC.es(preguntaC)));
    }
}
