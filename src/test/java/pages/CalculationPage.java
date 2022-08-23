package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CalculationPage {
    public CalculationPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "number")
    public WebElement placeholder;

    @FindBy(xpath = "//button[text()=\"Calculate!\"]")
    public WebElement calculateButton;

    @FindBy(id = "resultDiv")
    public WebElement result;

    @FindBy(xpath = "//a[text()=\"Pubirno\"]")
    public WebElement pubinnoLink;

    @FindBy(xpath = "//a[text()=\"Terms and Conditions\"]")
    public WebElement termsAndConditions;

    @FindBy(xpath = "//a[text()=\"Privacy\"]")
    public WebElement privacy;

    @FindBy (className = "icon-arrow-right")
    public WebElement arrowRight;

    @FindBy(xpath = "//input[@placeholder=\"Enter an integer\"]")
    public WebElement cssValueofPlaceHolder;

}
