package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Plan_TW_Page extends Plan_F_Page{

    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[3]/div[1]/img[1]")FluentWebElement OutLineOfCoveragePlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[3]/div[1]/img[2]")FluentWebElement OutlineOfCoverageMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[3]/div[3]/p")FluentWebElement OutlineOfCoverageContents;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div[2]")FluentWebElement YourPlanContents;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div[2]")FluentWebElement YourPlanStartDateContents;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div[1]")FluentWebElement YourPlanTW;
        public void clickAndVerify(){
        isAt();
        hasPlanHeaders();
            
        assert(Request.isDisplayed());
        verifyPlanDocumentsContents();
        verifyOutlineOfCoverageDocumentsContents();
        verifyGuideToHealthDocumentsContents();
        verifyPrivacyAuthorizationDocumentsContents();
        verifyFileAClaimDocumentsContents();
            
            assert (YourPlanContents.isDisplayed() && 
                    (!YourPlanContents.getText().equals(""))&&
                    YourPlanStartDateContents.isDisplayed()&&
                    (!YourPlanStartDateContents.getText().equals("")));

            myAArpMedicareLink.click();
            getDriver().switchTo().alert().dismiss();
            assert( YourOnlineAccountPlus.isDisplayed());
            YourOnlineAccountPlus.click();
            assert( YourOnlineAccountPlusContent.isDisplayed() && (!YourOnlineAccountContent.getText().equals("")) );
            assert( YourOnlineAccountMinus.isDisplayed());
            YourOnlineAccountMinus.click();

            assert (NurseHealthLineContent.isDisplayed() &&
                    NurseHealthLinePlus.isDisplayed() &&
                    NurseHealthLineContent.getText().equals("Call Nurse HealthLine for 24/7 access to a registered nurse via telephone who will help you make the best health decisions.") );
            NurseHealthLinePlus.click();
            waitForSpecificSeconds(1);
            AARPHealthAndWellnessLink.click();
            closeSpecificBrowser(1);
            DisclaimerLink.click();
            waitForSpecificSeconds(1);
            assert (DisclaimerContents.isDisplayed()&&(!DisclaimerContents.getText().isEmpty()));
            DisclaimerLink.click();
            waitForSpecificSeconds(1);
            assert (!DisclaimerContents.isDisplayed());
            NurseHealthLinkMinus.click();
            waitForSpecificSeconds(1);
            assert (SavingsOnVisionContents.isDisplayed() &&
                    (!SavingsOnVisionContents.getText().equals("")) &&
                    SavingsOnVisionPlus.isDisplayed());
            SavingsOnVisionPlus.click();
            waitForSpecificSeconds(1);
            AarpHealthcareVisionLink.click();
            closeSpecificBrowser(1);
            AarpVisionDisclaimerLink.click();
            waitForSpecificSeconds(1);
            assert (AarpVisionDisclaimerContents.isDisplayed() && (!AarpVisionDisclaimerContents.getText().isEmpty()));
            AarpVisionDisclaimerLink.click();
            SavingsOnVisionMinus.click();
            QuestionsPlus.click();
            assertThat( TechnicalSupport.getText(), equalTo("1-866-388-9919"));
            QuestionsMinus.click();
    }

    public void isAt() {
        assertThat(YourPlanTW.getText(), equalTo("AARP Basic Medicare Supplement Plan TW"));
    }
}

