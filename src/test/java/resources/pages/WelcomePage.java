package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;
import resources.utils.PropertyUtils;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WelcomePage {

    @FindBy(css = "#loginText.size16.smallSize11>h1")
    FluentWebElement pageTitle;

    public String getUrl() {
        return PropertyUtils.getProperty("ewelcome.urls");
    }
    
    
    public void fillAndSubmit(){
        
        isAt();
        
    }
    public void isAt() {
        assertThat(pageTitle.getText(), equalTo("Cheat Page"));
    }

}
