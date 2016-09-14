package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;
import resources.Application;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class YourPlanPage extends WelcomePage{
    @FindBy(xpath = "//*[@id='textOverImage']/div/div/section[3]/div[1]/h1") FluentWebElement pageTitle;
    
    public void fillAndSubmit(Application app){
        isAt();
        
        
        
    }
    public void isAt() {
        assertThat(pageTitle.getText(), equalTo("Your Plan Information and Coverage"));
    }

}
