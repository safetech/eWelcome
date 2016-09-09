package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;
import resources.Application;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SignInPage extends WelcomePage{
    @FindBy(xpath = "//*[contains(text(),'Sign In With Your Optum ID')]")
    FluentWebElement pageTitle;
    
    public void fillAndSubmit(Application app){
        LoginButton.click();
        isAt();

    }
    public void isAt() {
        assertThat(pageTitle.getText(), equalTo("Sign In With Your Optum ID"));
    }

}
