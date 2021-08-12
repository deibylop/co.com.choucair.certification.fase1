package stepdefinitions;
import Answer.Answer;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast());  }



    @Given("^: Than brandom wants to learn automation at the academy choucair$")
    public void than_brandom_wants_to_learn_automation_at_the_academy_choucair(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorCalled("Brandom").wasAbleTo(OpenUp.thePage(),(Login
                .onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));
    }

    @When("^: he search for the course (.*) on the choucair acadey platform$")
    public void he_search_for_the_course_Recusos_Automatizacion_Bancolombia_on_the_choucair_acadey_platform(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^: he find the course called resources (.*)$")
    public void he_find_the_course_called_resources_Recusos_Automatizacion_Bancolombia(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should((GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse()))));
    }

}
