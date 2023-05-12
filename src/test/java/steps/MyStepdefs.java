package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("When I on the Ebay HomePage")
    public void whenIOnTheEbayHomePage() {
        System.out.println("EBAY HP YAYY");
    }

    @When("I  click on the Advanced Search Link Button")
    public void iClickOnTheAdvancedSearchLinkButton() {
        System.out.println("LOve I");
    }

    @Then("I should navigate to Advanced Search page")
    public void iShouldNavigateToAdvancedSearchPage() {
        System.out.println("UTK BOSS");
    }
}
