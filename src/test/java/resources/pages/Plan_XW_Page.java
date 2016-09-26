package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Plan_XW_Page extends Plan_OW_Page{
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div[2]")FluentWebElement YourPlanContents;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div[2]")FluentWebElement YourPlanStartDateContents;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div[1]")FluentWebElement YourPlanXW;
    
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[3]/p")FluentWebElement WI_GuideToHealthContents;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[2]/a")FluentWebElement WI_GuideToHealthPdf;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[1]/img[1]")FluentWebElement WI_GuideToHealthPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[1]/img[2]")FluentWebElement WI_GuideToHealthMinus;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[2]/a")FluentWebElement PrivacyAuthorizationPdf;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[1]/img[1]")FluentWebElement PrivacyAuthorizationPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[1]/img[2]")FluentWebElement PrivacyAuthorizationMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[3]/p")FluentWebElement PrivacyAuthorizationContents;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[2]/form/ul/li[2]/div/div/div[4]/div[2]/div[4]/div[2]/a")FluentWebElement WI_FileAClaimPdf;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[2]/form/ul/li[2]/div/div/div[4]/div[2]/div[4]/div[1]/img[3]")FluentWebElement WI_FileAClaimPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[2]/form/ul/li[2]/div/div/div[4]/div[2]/div[4]/div[1]/img[4]")FluentWebElement WI_FileAClaimMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[2]/form/ul/li[2]/div/div/div[4]/div[2]/div[4]/div[3]/p")FluentWebElement WI_FileAClaimContents;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[1]/img[1]")FluentWebElement PlanDocumentPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[1]/img[2]")FluentWebElement PlanDocumentMinus;
    @FindBy(xpath = ".//html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[4]/p[3]")FluentWebElement PlanDocumentContents;
        public void clickAndVerify(){
        isAt();
        hasPlanHeaders();
        assert(Request.isDisplayed());

        verifyPlanDocumentsContents();
        verify_WI_GuideToHealthDocumentsContents();
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
    public void verifyPlanDocumentsContents(){
        if(!PlanDocumentPlus.isDisplayed()){
            assert(PlanDocumentContents.getText().equals("Your plan documents may not be up to date on this site because they are currently being delivered to you by mail. In order to update your documents online, please change your preference to \"online\" in the profile and preferences page."));
            PlanDocumentMinus.click();
        }
    }
    public void verifyOutlineOfCoverageDocumentsContents(){
        if(!OutlineOfCoverageMinus.isDisplayed()){
            OutLineOfCoveragePlus.click();
            assert(OutlineOfCoverageContents.getText().equals("Here you will find an outline of your plan benefits and the amount payable for those benefits for the year shown."));
        }
    }
    public void isAt() {
        assertThat(YourPlanOW.getText(), equalTo("AARP Medicare Supplement Rider 1 XW"));
    }
    public void verify_WI_GuideToHealthDocumentsContents(){
        if(!WI_GuideToHealthMinus.isDisplayed()){
            WI_GuideToHealthPlus.click();
            assert(WI_GuideToHealthContents.getText().equals("This guide has the basics about Medicare and gives you information to help you understand Medicare Supplement Insurance plans."));
        }
        WI_GuideToHealthPdf.click();
        closeSpecificBrowser(1);
    }
    public void verifyPrivacyAuthorizationDocumentsContents(){
        if(!PrivacyAuthorizationMinus.isDisplayed()){
            PrivacyAuthorizationPlus.click();
            assert(PrivacyAuthorizationContents.getText().equals("Information about your health insurance coverage cannot be given out without your permission. If you would like to allow someone of your choice to help you with your health insurance, you can use this form."));
        }
        PrivacyAuthorizationPdf.click();
        closeSpecificBrowser(1);
    }
//    public void verifyFileAClaimDocumentsContents(){
//        if(!WI_FileAClaimMinus.isDisplayed()){
//            WI_FileAClaimPlus.click();
//            assert(WI_FileAClaimContents.isDisplayed() &&
//                    FileAClaimContents.getText().equals("Claim filing is easier than ever. This provides instructions on how to submit your claim for payment."));
//        }
//        WI_FileAClaimPdf.click();
//        closeSpecificBrowser(1);
//    }
}

