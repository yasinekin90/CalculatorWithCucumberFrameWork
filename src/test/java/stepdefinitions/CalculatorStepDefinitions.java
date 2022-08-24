package stepdefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.CalculationPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class CalculatorStepDefinitions {

    CalculationPage calculationPage=new CalculationPage();

    @Given("User navigates to {string} page")
    public void user_navigates_to_page(String pageUrl) {
        Driver.getDriver().get(ConfigurationReader.getProperty(pageUrl));
    }

    @Then("writes {string} to placeholder")
    public void writesToPlaceholder(String number) {
        calculationPage.placeholder.sendKeys(number);
    }

    @Then("clicks to calculate button")
    public void clicksToCalculateButton() {
        calculationPage.calculateButton.click();
    }


    @Then("verify the result of calculation")
    public void verify_the_result_of_calculation() {
        ReusableMethods.waitForVisibility(calculationPage.result,3);

        String actualResult = calculationPage.result.getText();
        String expectedResult="The factorial of 8 is: 40320";
        String[] s = expectedResult.split(" ");

    //s[5] is 40320
        Assert.assertTrue("result is not true",actualResult.contains(s[5]));
        System.out.println("actualResult = " + actualResult);
        System.out.println("expectedResult = " + expectedResult);
    }


    @Then("verify the content of pubinno link")
    public void verifyTheContentOfPubinnoLink() throws IOException {


        String expected="Pubinno";
        String actual=calculationPage.pubinnoLink.getText();
        Assert.assertEquals("Content of link is wrong",expected,actual);

    }

    @When("clicks to pubinno link")
    public void clicksToPubinnoLink() {
        calculationPage.pubinnoLink.click();
    }

    @Then("navigates to pubinno homepage")
    public void navigatesToPubinnoHomepage() {
        String title = Driver.getDriver().getTitle();
        String expectedTitle="Pubinno | The Future of Draft Beer - Beer tap system";

        Assert.assertEquals("User couldn't be directed to HomePage",title,expectedTitle);

    }

    @When("clicks on terms and conditions link")
    public void clicksOnTermsAndConditionsLink() {
        calculationPage.termsAndConditions.click();
    }

    @Then("verifies if the direction is correct")
    public void verifiesIfTheDirectionIsCorrect() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://pubinno-qa-interview.azurewebsites.net/terms";
        Assert.assertEquals("Terms and Conditions Link Directs to wrong page",expectedUrl,actualUrl);

    }

    @When("clicks privacy link")
    public void clicksPrivacyLink() {
        calculationPage.privacy.click();
    }

    @Then("user verifies if the direction is correct")
    public void userVerifiesIfTheDirectionIsCorrect() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://pubinno-qa-interview.azurewebsites.net/privacy";
        Assert.assertEquals("Privacy Link Directs to wrong page",expectedUrl,actualUrl);
    }

    @Then("clicks to Enter from the Keyboard")
    public void clicksToEnterFromTheKeyboard() {
        Actions actions=new Actions(Driver.getDriver());
        actions.keyDown(Keys.ENTER).perform();
        ReusableMethods.waitFor(5);
        String text = calculationPage.result.getText();
        Assert.assertEquals("Enter button is not enabled.It should be better If it is activated",
                "The factorial of 4 is: 24",text);


    }

    @Then("clicks to rightArrow button")
    public void clicksToRightArrowButton() {
        calculationPage.arrowRight.click();

    }

    @And("User should see the result")
    public void userShouldSeeTheResult() {
        String text = calculationPage.result.getText();

        Assert.assertEquals("RightArrow button is not enabled.It should be better If it is activated",
                "The factorial of 4 is: 24",text);
    }

    @Then("user should understand the context of placeholder clearly")
    public void userShouldUnderstandTheContextOfPlaceholderClearly() {
        String actualContext=calculationPage.cssValueofPlaceHolder.getAttribute("placeholder");//Enter an Integer

        String expectedContext="Enter a number"; //for example

        Assert.assertEquals("User may not understand what the meaning of \"INTEGER\" is"
                ,actualContext,expectedContext);

    }


    @And("User verifies {string} gives the correct results")
    public void userVerifiesGivesTheCorrectResults(String integer) {
        ReusableMethods.waitFor(3);
        String result = calculationPage.result.getText();
        String[] s = result.split(" "); //s[5] gives the integer in the result
        System.out.println("result = " + result);
        if(result.contains("Infinity")){
            System.out.println("Number Between 171-978 gives Infinity as a result And "+integer+" gives "+s[5]+" as a result");
            Assert.assertTrue("Test is Failed",true);
            System.out.println("Numbers between 171-978 gives Infinity.Test is Passed");
        }else if(result.contains("e+")){
            System.out.println("Number Between 22-170 gives numbers that can not be understandable And "
                    +integer+" gives "+s[5]+" as a result");
            Assert.assertTrue("Number Between 22-170 gives numbers that can not be understandable.Test is Failed"
                    ,false);

        }else if(result.equals("")){
            System.out.println("979 and up gives no action And "
                    +integer+" gives no result.Function of calculate button is not activated");
            Assert.assertTrue("979 and up gives no action.Function of calculate button is not activated.Test is Failed"
                    ,false);
        }
        else {
            System.out.println("Number Between 0-21 gives normal results And "+integer+" gives "+s[5]+" as a result.");
            Assert.assertTrue("Test Failed",true);
            System.out.println("Number Between 0-21 gives normal results.Test is passed");
        }
    }
}
