package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;
import resources.Application;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Plan_F_Page extends YourPlanPage{
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[5]/div[2]/a")FluentWebElement OutLineOfCoveragePdf;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[2]/a")FluentWebElement GuideToHealthPdf;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[4]/div[2]/a")FluentWebElement FileAClaimPdf;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[2]/button[2]")FluentWebElement Request;    
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[2]/button")FluentWebElement InProgress;
    
    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[1]/img[1]")FluentWebElement PlanDocumentPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[1]/img[2]")FluentWebElement PlanDocumentMinus;
    @FindBy(xpath = ".//*[@id='bodyContent']/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[4]/p[3]")FluentWebElement PlanDocumentContents;    
    
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[5]/div[1]/img[1]")FluentWebElement OutLineOfCoveragePlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[5]/div[1]/img[2]")FluentWebElement OutlineOfCoverageMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[5]/div[3]/p")FluentWebElement OutlineOfCoverageContents;
    
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[1]/img[1]")FluentWebElement GuideToHealthPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[1]/img[2]")FluentWebElement GuideToHealthMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[3]/p")FluentWebElement GuideToHealthContents;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[2]/a")FluentWebElement PrivacyAuthorizationPdf;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[1]/img[1]")FluentWebElement PrivacyAuthorizationPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[1]/img[2]")FluentWebElement PrivacyAuthorizationMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[3]/p")FluentWebElement PrivacyAuthorizationContents;
    
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[4]/div[1]/img[1]")FluentWebElement FileAClaimPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[4]/div[1]/img[2]")FluentWebElement FileAClaimMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[4]/div[3]/p")FluentWebElement FileAClaimContents;
    
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[7]/div[1]/div[3]/div/p")FluentWebElement YourOnlineAccountContent;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[7]/div[1]/div[3]/div/p")FluentWebElement YourOnlineAccountPlusContent;
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
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[13]/div[1]/div[4]/img[2]")FluentWebElement SavingsOnVisionMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[13]/div[2]/ul/li[4]/a")FluentWebElement AarpHealthcareVisionLink;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[13]/div[2]/div/i")FluentWebElement AarpVisionDisclaimerLink;    
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[5]/div/div[13]/div[2]/div/div/p/b")FluentWebElement AarpVisionDisclaimerContents;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div[1]")FluentWebElement YourPlanF;
    public void clickAndVerify(Application app){

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

//        verifyPlanDocumentsContents(PlanDocStatus);
        verifyOutlineOfCoverageDocumentsContents();
        verifyGuideToHealthDocumentsContents();
        verifyPrivacyAuthorizationDocumentsContents();
        verifyFileAClaimDocumentsContents();
        if(app.getMessages()){
            Messages();
        }
        myAArpMedicareLink.click();
        closeSpecificBrowser(1);
        assert( YourOnlineAccountPlus.isDisplayed());
        YourOnlineAccountPlus.click();
        assert( YourOnlineAccountPlusContent.isDisplayed() && (!YourOnlineAccountContent.getText().equals("")) );
        assert( YourOnlineAccountMinus.isDisplayed());
        YourOnlineAccountMinus.click();
        
        if(app.getNurseHealthLine()){
            assert (NurseHealthLineContent.isDisplayed() &&
                    NurseHealthLinePlus.isDisplayed() &&
                    NurseHealthLineContent.getText().equals("Call Nurse HealthLine for 24/7 access to a registered nurse via telephone who will help you make the best health decisions."));
            NurseHealthLinePlus.click();
            waitForSpecificSeconds(1);
            AARPHealthAndWellnessLink.click();
            closeSpecificBrowser(1);
            DisclaimerLink.click();
            waitForSpecificSeconds(1);
            assert (DisclaimerContents.isDisplayed() && (!DisclaimerContents.getText().isEmpty()));
            DisclaimerLink.click();
            waitForSpecificSeconds(1);
            assert (!DisclaimerContents.isDisplayed());
            NurseHealthLinkMinus.click();
            waitForSpecificSeconds(1);
        }
        
        if(app.getSilverSneakers()){
            assert (SilverSneakersContents.isDisplayed() && SilverSneakersPlus.isDisplayed());
            SilverSneakersFitnessLink.click();
            closeSpecificBrowser(1);
            SilverSneakersPlus.click();
            waitForSpecificSeconds(1);
            SilverSneakersPlusLink.click();
            closeSpecificBrowser(1);
            SilverSneakersDisclaimerLink.click();
            waitForSpecificSeconds(1);
            assert (SilverSneakersDisclaimerContents.isDisplayed() && (!SilverSneakersDisclaimerContents.getText().equals("")));
            waitForSpecificSeconds(1);
            SilverSneakersDisclaimerLink.click();
            waitForSpecificSeconds(1);
            assert (SilverSneakersMinus.isDisplayed());
            SilverSneakersMinus.click();
            waitForSpecificSeconds(1);
        }
        
        if(app.getSavingsOnVisionContents()){
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
            assertThat( TechnicalSupport.getText(), equalTo("1-866-388-9919"));
            QuestionsMinus.click();
        }
    }

    public void verifyPlanDocumentsContents(String PlanDocStatus){
                
        if(PlanDocStatus.equals("Request")){
            
            if(!PlanDocumentPlus.isDisplayed()){
                assert(PlanDocumentContents.getText().equals("Your plan documents may not be up to date on this site because they are currently being delivered to you by mail. In order to update your documents online, please change your preference to \"online\" in the profile and preferences page."));
                PlanDocumentMinus.click();
            }
        }else if(PlanDocStatus.equals("In Progress")){

            if(!PlanDocumentMinus.isDisplayed()){
                PlanDocumentPlus.click();
                assert(PlanDocumentContents.getText().equals("Includes your Certificate of Insurance as well as additional important information. Up to 2 of the most recent Plan documents are available. Past documents can be requested by calling the number in \"Questions\"."));
                PlanDocumentMinus.click();
            }
        }
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
    public void verifyPrivacyAuthorizationDocumentsContents(){
        if(!PrivacyAuthorizationMinus.isDisplayed()){
            PrivacyAuthorizationPlus.click();
            assert(PrivacyAuthorizationContents.getText().equals("Information about your health insurance coverage cannot be given out without your permission. If you would like to allow someone of your choice to help you with your health insurance, you can use this form."));
        }
        PrivacyAuthorizationPdf.click();
        closeSpecificBrowser(1);
    }
    public void verifyFileAClaimDocumentsContents(){
        if(!FileAClaimMinus.isDisplayed()){
            FileAClaimPlus.click();
            assert(YourOnlineAccountContent.isDisplayed() &&
                    FileAClaimContents.getText().equals("Claim filing is easier than ever. This provides instructions on how to submit your claim for payment.") &&
                    YourOnlineAccountContent.getText().equals("If you haven't yet, register for myAARPMedicare.com to see information about your claims, plan benefits and premium payments."));
        }
        FileAClaimPdf.click();
        closeSpecificBrowser(1);
    }
    public void isAt() {
        assertThat(YourPlanF.getText(), equalTo("AARP Medicare Supplement Plan F"));
    }

}
