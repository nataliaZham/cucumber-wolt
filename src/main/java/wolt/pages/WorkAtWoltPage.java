package wolt.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WorkAtWoltPage extends Page {

    //locators
    protected static By emailField = By.xpath("//*[@data-test-id ='woltAtWork.emailInput']");
    protected static By companyField = By.xpath("//*[@data-test-id ='woltAtWork.companyInput']");
    protected static By companySize = By.xpath("//*[@data-test-id ='woltAtWork.companySizeInput']");
    protected static By country = By.xpath("//*[@data-test-id ='woltAtWork.countryInput']");
    protected static By signUpFreeBtn = By.xpath("//*[@data-test-id ='woltAtWork.signupForFreeButton']");

    protected static By textHeader = By.xpath("//*[@data-localization-key ='wolt-at-work.sign-up-info-page.heading']");

    //methods
    public void fillInTheData(String email, String company, String sizeOfCompany, String chooseCountry) {
        $(emailField).setValue(email);
        $(companyField).setValue(company);
        $(companySize).selectOption(sizeOfCompany);
        $(country).selectOption(chooseCountry);
    }

    public void clickOnSignUpFreeBtn() {
        $(signUpFreeBtn).click();
    }

    public void checkTextHeader(String text) {
        $(textHeader).shouldHave(Condition.text(text));
    }

}
