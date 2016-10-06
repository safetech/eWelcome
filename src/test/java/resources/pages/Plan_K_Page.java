package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Plan_K_Page extends Plan_F_Page{
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[4]/div[2]/a")FluentWebElement OutLineOfCoveragePdf;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[2]/a")FluentWebElement GuideToHealthPdf;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[2]/div[2]/a")FluentWebElement PlanKorLPdf;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[2]/div[1]/img[1]")FluentWebElement PlanKorLPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[2]/div[1]/img[2]")FluentWebElement PlanKorLMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[2]/div[3]/p")FluentWebElement PlanKorLContents;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[2]/button[2]")FluentWebElement Request;
    
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[4]/div[1]/img[1]")FluentWebElement OutLineOfCoveragePlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[4]/div[1]/img[2]")FluentWebElement OutlineOfCoverageMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[4]/div[3]/p")FluentWebElement OutlineOfCoverageContents;
    
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[1]/img[1]")FluentWebElement GuideToHealthPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[1]/img[2]")FluentWebElement GuideToHealthMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[3]/p")FluentWebElement GuideToHealthContents;
    
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[7]/div[1]/div[3]/div/p")FluentWebElement YourOnlineAccountContent;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[7]/div[2]/div[2]/p")FluentWebElement YourOnlineAccountPlusContent;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[7]/div[1]/div[4]/img[1]")FluentWebElement YourOnlineAccountPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[7]/div[1]/div[4]/img[2]")FluentWebElement YourOnlineAccountMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[7]/div[1]/div[3]/div/p/a")FluentWebElement myAArpMedicareLink;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[9]/div[1]/div[4]/img[1]")FluentWebElement NurseHealthLinePlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[9]/div[1]/div[3]/p[2]")FluentWebElement NurseHealthLineContent;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[9]/div[2]/p[3]/a")FluentWebElement AARPHealthAndWellnessLink;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[9]/div[2]/div/i")FluentWebElement DisclaimerLink;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[9]/div[2]/div/div/p[2]")FluentWebElement DisclaimerContents;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[9]/div[1]/div[4]/img[2]")FluentWebElement NurseHealthLinkMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[12]/div[1]/div[3]/p[2]")FluentWebElement SilverSneakersContents;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[12]/div[1]/div[4]/img[1]")FluentWebElement SilverSneakersPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[12]/div[1]/div[4]/img[2]")FluentWebElement SilverSneakersMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[12]/div[1]/div[3]/p[2]/a")FluentWebElement SilverSneakersFitnessLink;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[12]/div[2]/ul/li[1]/a")FluentWebElement SilverSneakersPlusLink;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[12]/div[2]/div/i")FluentWebElement SilverSneakersDisclaimerLink;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[12]/div[2]/div/div/p[1]")FluentWebElement SilverSneakersDisclaimerContents;
    
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[13]/div[1]/div[3]/p[2]")FluentWebElement SavingsOnVisionContents;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[13]/div[1]/div[4]/img[1]")FluentWebElement SavingsOnVisionPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[13]/div[2]/ul/li[4]/a")FluentWebElement AarpHealthcareVisionLink;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[13]/div[2]/div/i")FluentWebElement AarpVisionDisclaimerLink;    
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[13]/div[2]/div/div/p/b")FluentWebElement AarpVisionDisclaimerContents;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div[1]")FluentWebElement YourPlanK;
    
    public void clickAndVerify(){
        isAt();
        hasPlanHeaders();

        try{
            if(Request.isEnabled()) {
                Request.click();
                assert(!InProgress.isDisplayed());
                verifyPlanDocumentsContents("Request");

            }
            if(InProgress.isDisplayed()) {
                assert(!Request.isDisplayed());
                verifyPlanDocumentsContents("In Progress");
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
        verifyOutlineOfCoverageDocumentsContents();
        verifyGuideToHealthDocumentsContents();
        verifyPrivacyAuthorizationDocumentsContents();
        verifyFileAClaimDocumentsContents();
        verifyPlanKorLContents();
        
        myAArpMedicareLink.click();
        closeSpecificBrowser(1);
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
        assert (SilverSneakersContents.isDisplayed() && SilverSneakersPlus.isDisplayed());
        SilverSneakersFitnessLink.click();
        closeSpecificBrowser(1);
        SilverSneakersPlus.click();
        waitForSpecificSeconds(1);
        SilverSneakersPlusLink.click();
        closeSpecificBrowser(1);
        SilverSneakersDisclaimerLink.click();
        waitForSpecificSeconds(1);
        assert (SilverSneakersDisclaimerContents.isDisplayed() && (!SilverSneakersDisclaimerContents.getText().equals("")));        waitForSpecificSeconds(1);
        SilverSneakersDisclaimerLink.click();
        waitForSpecificSeconds(1);
        assert( SilverSneakersMinus.isDisplayed());
        SilverSneakersMinus.click();
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
        QuestionsPlus.click();
        waitForSpecificSeconds(1);
        assertThat( TechnicalSupport.getText(), equalTo("1-866-388-9919"));
        QuestionsMinus.click();
    }
  
    public void verifyOutlineOfCoverageDocumentsContents(){
        if(!OutlineOfCoverageMinus.isDisplayed()){
            OutLineOfCoveragePlus.click();
            assert(OutlineOfCoverageContents.getText().equals("Here you will find an outline of your plan benefits and the amount payable for those benefits for the year shown."));
         }
        OutLineOfCoveragePdf.click();
        closeSpecificBrowser(1);
    }    
    public void verifyGuideToHealthDocumentsContents(){
        if(!GuideToHealthMinus.isDisplayed()){
            GuideToHealthPlus.click();
            assert(GuideToHealthContents.getText().equals("This guide has the basics about Medicare and gives you information to help you understand Medicare Supplement Insurance plans."));
        }
        GuideToHealthPdf.click();
        closeSpecificBrowser(1);
    }    

    public void verifyPlanKorLContents(){
        if(!PlanKorLMinus.isDisplayed()){
            PlanKorLPlus.click();
            assert(
                    PlanKorLContents.getText().equals("Updated information on your calendar year Out of Pocket maximum for Plan K or L for the year shown.") );
        }
        PlanKorLPdf.click();
        closeSpecificBrowser(1);
    }
    public void isAt() {
        
        assertThat(YourPlanK.getText(), equalTo("AARP Medicare Supplement Plan K"));
    }
}
