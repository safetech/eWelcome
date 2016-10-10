package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class YourPlanPage extends WelcomePage{
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[1]") FluentWebElement pageTitle;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[2]/div[1]") FluentWebElement YourPlanStartDate;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[1]") FluentWebElement YourPlanDocuments;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[1]") FluentWebElement ImportantInformation;

    
    
    public void isAt() {
        assertThat(pageTitle.getText(), equalTo("Your Plan"));
    }       
   
    public void hasPlanHeaders() {
        assertThat(YourPlanStartDate.getText(), equalTo("Your Plan Start Date*"));
        assertThat(YourPlanDocuments.getText(), equalTo("Your Plan Documents"));
        assertThat(ImportantInformation.getText(), equalTo("Important Information"));
    }   
    
public void Logout() {
    WebElement more=getDriver().findElement(By.xpath("html/body/div[3]/header/div/div[3]/section[2]/button"));
    more.click();
    waitForSpecificSeconds(2);
    WebElement logout=getDriver().findElement(By.xpath("html/body/div[3]/header/div/div[3]/section[2]/ul/li[3]/a"));
    logout.click();
    getDriver().switchTo().alert().accept();
    waitForSpecificSeconds(4);
    WebElement Welcome=getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div/div[2]/div/section/div[1]/div/h1"));
    assert(Welcome.getText().equals("Welcome!"));
    } 

   
}
