package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Plan_F_Select_Page extends Plan_TW_Page{

    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[7]/div[2]/a")FluentWebElement HospitalDirectoryPdf;    
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[7]/div[1]/img[1]")FluentWebElement HospitalDirectoryPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[7]/div[1]/img[2]")FluentWebElement HospitalDirectoryMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[7]/div[3]/p")FluentWebElement HospitalDirectoryContents;
    
    @Override
    public void isAt() {
        assertThat(YourPlanF.getText(), equalTo("AARP Medicare Select Plan F"));
    }
    public void clickAndVerify_F_Select(){
        clickAndVerify();
        if(!HospitalDirectoryPlus.isDisplayed()){
            assert(HospitalDirectoryContents.getText().equals("Find out which hospitals are part of the network for your AARP Medicare Select Plan."));
            HospitalDirectoryMinus.click();
        }
        HospitalDirectoryPdf.click();
        closeSpecificBrowser(1);
    }
}

