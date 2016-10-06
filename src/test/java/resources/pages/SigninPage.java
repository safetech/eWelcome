package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.Application;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SignInPage extends WelcomePage{
    @FindBy(id = "signInOptumID") FluentWebElement pageTitle;
    @FindBy(css = "#userNameId_input") FluentWebElement userName;    
    @FindBy(css = "#passwdId_input") FluentWebElement userPassword;
    FluentWebElement SignIn;
    @FindBy(xpath = "//*[@id='authQuestionWrapper']/div[1]/div/h1") FluentWebElement UnrecognizedDevice;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[1]") FluentWebElement YourPlan;
    public void fillAndSubmit(Application app){
        LoginButton.click();
        waitForSpecificSeconds(1);
        isAt();
        fill(userName).with(app.getUserName());
        fill(userPassword).with("P@ssword1");
        SignIn.click();

        try {
            waitForElementPresent(10, "//*[@id='authQuestionWrapper']/div[1]/div/h1");
            if(UnrecognizedDevice.getText().equals("Unrecognized Device")){
                WebElement question = getDriver().findElement(By.xpath(".//*[@id='userCommand']/div[1]/div/div/div[1]/div/div/label"));

                String ans = question.getText().contains("friend")?"friend1":question.getText().contains("phone")?"phone1":"color1";
                WebElement answer = getDriver().findElement(By.xpath(".//*[@id='challengeQuestionList[0].userAnswer']"));
                answer.sendKeys(ans);
                WebElement nextButton=getDriver().findElement(By.id("authQuesSubmitButton"));
                nextButton.click();
            }
        }
        catch (Exception e)
        {
            
        }

        waitForSpecificSeconds(20);
        assertThat(YourPlan.getText(), equalTo("Your Plan"));
        waitForSpecificSeconds(5);
    }
    public void isAt() {
        assertThat(pageTitle.getText(), equalTo("Sign In With Your Optum ID"));
    }

}
