package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.Application;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SignInPage extends WelcomePage{
    @FindBy(xpath = "html/body/div[1]/div[1]/main/h1") FluentWebElement pageTitle;
    @FindBy(css = "#userNameId_input") FluentWebElement userName;    
    @FindBy(css = "#passwdId_input") FluentWebElement userPassword;
    FluentWebElement SignIn;
    @FindBy(xpath = "//*[@id='authQuestionWrapper']/div[1]/div/h1") FluentWebElement UnrecognizedDevice;
    
    public void fillAndSubmit(Application app){
        LoginButton.click();
        isAt();
        fill(userName).with("swedishchef");
        fill(userPassword).with("P@ssword1");
        SignIn.click();

        waitForElementPresent(10, "//*[@id='authQuestionWrapper']/div[1]/div/h1");
        
        if(UnrecognizedDevice.getText().equals("Unrecognized Device")){
        WebElement question = getDriver().findElement(By.xpath(".//*[@id='userCommand']/div[1]/div/div/div[1]/div/div/label"));

        String ans = question.getText().contains("friend")?"friend1":
            question.getText().contains("phone")?"phone1":"";
            WebElement answer = getDriver().findElement(By.xpath(".//*[@id='challengeQuestionList[0].userAnswer']"));
            answer.sendKeys(ans);
            WebElement nextButton=getDriver().findElement(By.id("authQuesSubmitButton"));
            nextButton.click();
        }
        
        

    }
    public void isAt() {
        assertThat(pageTitle.getText(), equalTo("Sign In With Your Optum ID"));
    }

}
