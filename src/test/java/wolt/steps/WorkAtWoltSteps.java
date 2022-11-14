package wolt.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.docstring.DocString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static wolt.pages.Constants.WORK_AT_WOLT_URL;

public class WorkAtWoltSteps extends BaseSteps {

    @Given("I am on the Work at Wolt page")
    public void iAmOnTheWorkAtWoltPage() {
        open(WORK_AT_WOLT_URL);
        workAtWoltPage.accCookies();
    }

    @When("I enter following details")
    public void iEnterFollowingDetails(DataTable dataTable) {
        List<List<String>> workAtWoltForm = dataTable.asLists(String.class);
        String email = workAtWoltForm.get(0).get(0);
        String company = workAtWoltForm.get(0).get(1);
        String companySize = workAtWoltForm.get(0).get(2);
        String country = workAtWoltForm.get(0).get(3);
        workAtWoltPage.fillInTheData(email, company, companySize, country);
    }

    @When("I click on Sign op free button")
    public void iClickOnSignOpFreeButton() {
        workAtWoltPage.clickOnSignUpFreeBtn();
    }

    @Then("I see the title")
    public void iSeeTheTitle(DocString headerText) {
        String text = headerText.getContent();
        workAtWoltPage.checkTextHeader(text);
    }
}
