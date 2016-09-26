package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Plan_UW_Page extends Plan_F_Page{
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[2]/button")FluentWebElement InProgress;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div[2]")FluentWebElement YourPlanContents;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div[2]")FluentWebElement YourPlanStartDateContents;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div[1]")FluentWebElement YourPlanUW;

        public void clickAndVerify(){
        
        isAt();
        hasPlanHeaders();
            
        assert(InProgress.isDisplayed());
        OutLineOfCoveragePdf.click();
        closeSpecificBrowser(1);
        GuideToHealthPdf.click();
        closeSpecificBrowser(1);
        PrivacyAuthorizationPdf.click();
        closeSpecificBrowser(1);
        FileAClaimPdf.click();
        closeSpecificBrowser(1);

        if(PlanDocumentPlus.isDisplayed()){
            PlanDocumentPlus.click();
            assert(PlanDocumentContents.getText().equals("Your plan documents may not be up to date on this site because they are currently being delivered to you by mail. In order to update your documents online, please change your preference to \"online\" in the profile and preferences page."));
            PlanDocumentMinus.click();
        }
        if(!OutlineOfCoverageMinus.isDisplayed()){
            OutLineOfCoveragePlus.click();
            assert(OutlineOfCoverageContents.getText().equals("Here you will find an outline of your plan benefits and the amount payable for those benefits for the year shown."));
        }
        if(!GuideToHealthMinus.isDisplayed()){
            GuideToHealthPlus.click();
            assert(GuideToHealthContents.getText().equals("This guide has the basics about Medicare and gives you information to help you understand Medicare Supplement Insurance plans."));
        }
        if(!PrivacyAuthorizationMinus.isDisplayed()){
            PrivacyAuthorizationPlus.click();
            assert(PrivacyAuthorizationContents.getText().equals("Information about your health insurance coverage cannot be given out without your permission. If you would like to allow someone of your choice to help you with your health insurance, you can use this form."));
        }
        if(!FileAClaimMinus.isDisplayed()){
            FileAClaimPlus.click();
            assert(FileAClaimContents.getText().equals("Claim filing is easier than ever. This provides instructions on how to submit your claim for payment."));
        }
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
            QuestionsPlus.click();
            assertThat( TechnicalSupport.getText(), equalTo("1-866-388-9919"));
    }
    public void isAt() {
        assertThat(YourPlanUW.getText(), equalTo("AARP Extended Basic Medicare Supplement Plan UW"));
    }
}

