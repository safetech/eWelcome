package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.Application;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class YourPlanPage extends WelcomePage{
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[1]") FluentWebElement pageTitle;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[2]/div[1]") FluentWebElement YourPlanStartDate;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[1]") FluentWebElement YourPlanDocuments;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[1]") FluentWebElement ImportantInformation;
    
    protected int TOTAL_POSSIBLE_QUESTION_COUNT = 2;
    public void fillAndSubmit(Application app){

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isAt();

        
        
        
        
        int i=1;
        ArrayList<WebElement> plans = new ArrayList<>();
        try {
            for(;; i++){
                WebElement plan = getDriver().findElement(By.xpath("//*[@id='bodyContent']/div[5]/div/div/div/div/div[2]/div[2]/form/ul/li["+i+"]/a/p[1]"));
                plans.add(plan);
            }
        }
        catch (Exception e) {
            
        }
        for(WebElement plan : plans)
        {
//            if(plan.getText().equals("Plan MW")){
//                plan.click();
//                availablePlans(plan.getText());
//            }else if(plan.getText().equals("Plan OW")){
//                plan.click();
//                availablePlans(plan.getText());
//            }else if(plan.getText().equals("Plan SW")){
//                plan.click();
//                availablePlans(plan.getText());
//            }else if(plan.getText().equals("Plan F")){
//                plan.click();
//                availablePlans(plan.getText());
//            }
            plan.click();
            availablePlans(plan.getText());
        }
    }

    public void isAt() {
        assertThat(pageTitle.getText(), equalTo("Your Plan"));
    }       
    public void hasPlanHeaders() {
        assertThat(YourPlanStartDate.getText(), equalTo("Your Plan Start Date*"));
        assertThat(YourPlanDocuments.getText(), equalTo("Your Plan Documents"));
        assertThat(ImportantInformation.getText(), equalTo("Important Information"));
    }    
    
    public void availablePlans(String PlanName) {
        hasPlanHeaders();
        switch (PlanName){
            case "Plan MW":
                break;
            case "Plan OW":
                break;
            case "Plan SW":
                break;
            case "Plan F":
                break;
        }
        
        
    }    
    

}
