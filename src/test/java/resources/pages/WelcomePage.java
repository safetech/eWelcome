package resources.pages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;
import resources.Application;
import resources.utils.PropertyUtils;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WelcomePage extends FluentPage {

    @FindBy(xpath = "//*[contains(text(),'Welcome!')]")
    FluentWebElement pageTitle;
    @FindBy(xpath = "html/body/div[3]/footer/div[1]/div/section[2]/div/p/img[1]") FluentWebElement QuestionsButton;
    @FindBy(xpath = "html/body/div[3]/footer/div[1]/div/section[2]/div/div/div[1]/p[2]/span") FluentWebElement TechnicalSupport;
    @FindBy(xpath = "html/body/div[3]/footer/div[1]/div/section[2]/div/div/div[1]/p[3]/span") FluentWebElement PlanInformation;
    @FindBy(xpath = "//*[contains(text(),'Register')]")
    FluentWebElement RegisterButton;
    @FindBy(xpath = "//*[contains(text(),'Login')]")
    FluentWebElement LoginButton;
    

    public String getUrl() {
        return PropertyUtils.getProperty("ewelcome.urls");
    }
    
    
    public void fillAndSubmit(Application app){
        
        isAt();

        QuestionsButton.click();
        try {
            Thread.sleep( 1000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertThat( TechnicalSupport.getText(), equalTo( app.getTechnicalSupport()));
        assertThat( PlanInformation.getText(), equalTo( app.getPlanInformation()));
        
    }
    public void isAt() {
        assertThat(pageTitle.getText(), equalTo("Welcome!"));
    }

}
