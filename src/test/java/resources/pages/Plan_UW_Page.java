package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;
import resources.Application;

/**
 * Created by sislam13 on 9/22/16.
 */
public class Plan_UW_Page extends YourPlanPage{
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[5]/div[2]/a")FluentWebElement OutLineOfCoverage;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[2]/a")FluentWebElement GuideToHealth;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[2]/a")FluentWebElement PrivacyAuthorizationForm;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[4]/div[2]/a")FluentWebElement FileAClaim;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[2]/button]")FluentWebElement InProgress;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[1]/img[1]")FluentWebElement PlanDocumentPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[1]/img[2]")FluentWebElement PlanDocumentMinus;
    @FindBy(xpath = ".//*[@id='bodyContent']/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[4]/p[3]")FluentWebElement PlanDocumentContents;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[5]/div[1]/img[1]")FluentWebElement OutLineOfCoveragePlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[5]/div[1]/img[2]")FluentWebElement OutlineOfCoverageMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[5]/div[3]/p")FluentWebElement OutlineOfCoverageContents;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[1]/img[1]")FluentWebElement GuideToHealthPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[1]/img[2]")FluentWebElement GuideToHealthMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[6]/div[3]/p")FluentWebElement GuideToHealthContents;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[1]/img[1]")FluentWebElement PrivacyAuthorizationPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[1]/img[2]")FluentWebElement PrivacyAuthorizationMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[3]/p")FluentWebElement PrivacyAuthorizationContents;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[4]/div[1]/img[1]")FluentWebElement FileAClaimPlus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[4]/div[1]/img[2]")FluentWebElement FileAClaimMinus;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[4]/div[2]/div[4]/div[3]/p")FluentWebElement FileAClaimContents;

    protected int TOTAL_POSSIBLE_QUESTION_COUNT = 2;
    public void clickAndVerify(Application app){
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isAt();
        hasPlanHeaders();

        assert(InProgress.isDisplayed()); 

        OutLineOfCoverage.click();
        closeSpecificBrowser(1);

        GuideToHealth.click();
        closeSpecificBrowser(1);

        PrivacyAuthorizationForm.click();
        closeSpecificBrowser(1);

        FileAClaim.click();
        closeSpecificBrowser(1);

        if(!PlanDocumentPlus.isDisplayed()){
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

    }
}

