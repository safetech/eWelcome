package resources.pages;

import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;
import resources.Application;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;

import static resources.queries.DeletionQueries.deleteIsPerf;
import static resources.queries.InsertionQueries.insertIntoIsPerf;

public class ProfileAndPreferencePage extends WelcomePage {
    @FindBy(xpath = "html/body/div[3]/header/div/div[3]/section[2]/button") FluentWebElement More; 
    @FindBy(xpath = "html/body/div[3]/header/div/div[3]/section[2]/ul/li[1]/a") FluentWebElement ProfileAndPreferences; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[1]/div[2]/div/div[4]/a") FluentWebElement eMailEditLink; 
    @FindBy(xpath = "html/body/div[3]/header/div/div[3]/section[2]/ul/li[2]/a") FluentWebElement MyPlanInformation; 
    @FindBy(xpath = "html/body/div[3]/header/div/div[3]/section[2]/ul/li[3]/a") FluentWebElement Logout; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div/div[2]/div/section/div[2]/div/div[2]/a") FluentWebElement Login; 
        
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[1]/div[3]/div/form/div[3]/div/button[2]") FluentWebElement eMailSaveButton; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[1]/section/div[1]/p") FluentWebElement PageTitle; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[1]/div[3]/div/form/div[3]/div/button[1]") FluentWebElement eMailCancelButton; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[1]/div[3]/div/form/div[1]/div[1]/input") FluentWebElement eMail; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[1]/div[3]/div/form/div[2]/div[1]/input") FluentWebElement ConfirmEMail; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[1]/div[2]/div/div[3]/span[1]") FluentWebElement eMailAddress;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[1]/div[3]/div/form/div[2]/div[2]/span") FluentWebElement ConfirmEMailErrorMessage;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[1]/div[3]/div/form/div[1]/div[2]/span") FluentWebElement EMailErrorMessage;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[4]/a") FluentWebElement DeliverPreferenceEdit; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[5]/div[1]/label[1]/input") FluentWebElement DeliverOnline; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[5]/div[1]/label[2]/input") FluentWebElement DeliveryUsMail; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[5]/div[2]/div/div/div[1]/span/p[9]/a") FluentWebElement AdobeLink; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[5]/div[2]/div/div/div[1]/label/input") FluentWebElement TermsAndConditionsCheckbox; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[5]/div[2]/div/div/div[3]/div/button[2]") FluentWebElement DeliverySaveButton; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[5]/div[2]/div/div/div[3]/div/button[1]") FluentWebElement DeliveryCancelButton; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div[1]/span[1]") FluentWebElement SuccessMessage; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[5]/div[2]/div/div/div[2]/span/p") FluentWebElement USMailMessage; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[5]/div[2]/div/div/div[1]/p[2]") FluentWebElement DeliveryErrorMessage;
   
    @FindBy(xpath = "html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[3]/div/div/div[3]/div[2]/div[1]/div[4]/p[1]") FluentWebElement PlanDocumentContents;

    @Page public SignInPage signInPage;
    
    
    public void verifyPreferenceChoice(Application app) throws GeneralSecurityException, SQLException, IOException {
        More.click();
        ProfileAndPreferences.click();
        isAt();
        DeliverPreferenceEdit.click();
        assert(DeliveryUsMail.isSelected());
        DeliveryCancelButton.click();
        insertIntoIsPerf("145193952","Y");
        More.click();
        MyPlanInformation.click();
        More.click();
        Logout.click();
        getDriver().switchTo().alert().accept();
        waitForSpecificSeconds(2);
        signInPage.fillAndSubmit(app);
        waitForSpecificSeconds(1);
        assert (PlanDocumentContents.getText().equals("If you would like to request this material, please click the \"request\" button. Your material will be generated within 2-4 days and you will receive an email when you can view your documents."));
        More.click();
        ProfileAndPreferences.click();
        DeliverPreferenceEdit.click();
        waitForSpecificSeconds(2);
        assert(DeliverOnline.isSelected());
        DeliveryCancelButton.click();
        deleteIsPerf("145193952");
        More.click();
        MyPlanInformation.click();
    }
    public void verifyProfileAndPreferences() {
        More.click();
        ProfileAndPreferences.click();
        isAt();
        ProfileAndPreferencesEmail();
        ProfileAndPreferencesDelivery();
        More.click();
        MyPlanInformation.click();
    }
    public void ProfileAndPreferencesEmail() {
        
        assert(!eMail.isDisplayed() && !ConfirmEMail.isDisplayed());        
        eMailEditLink.click();
        waitForSpecificSeconds(2);
        assert(eMailSaveButton.isDisplayed() && eMailCancelButton.isDisplayed());
        eMailCancelButton.click();
        waitForSpecificSeconds(2);
        eMailAddress.getText().contains("@");
    }    
    
    public void ProfileAndPreferencesDelivery() {
        assert(!DeliverOnline.isEnabled());
        assert(!DeliveryUsMail.isEnabled());
        DeliverPreferenceEdit.click();
        waitForSpecificSeconds(2);
        DeliverOnline.click();
        AdobeLink.click();
        getDriver().switchTo().alert().dismiss();
        TermsAndConditionsCheckbox.click();
        DeliverySaveButton.click();
        waitForSpecificSeconds(2);
        assert(SuccessMessage.getText().contains("Success"));
        DeliverPreferenceEdit.click();
        waitForSpecificSeconds(2);
        DeliveryUsMail.click();
        assert (USMailMessage.getText().contains("U.S. Mail"));
        
        
    }
    
    public void functionalTest()
    {
        More.click();
        ProfileAndPreferences.click();
        isAt();
        functionalProfileAndPrefencesEmail();
        functionalProfileAndPreferencesDelivery();
        More.click();
        MyPlanInformation.click();
    }
    
    public void functionalProfileAndPrefencesEmail(){
    String email=eMailAddress.getText();
        assert(!eMail.isDisplayed() && !ConfirmEMail.isDisplayed());
        eMailEditLink.click();
        waitForSpecificSeconds(2);
        eMailSaveButton.click();
        assert(ConfirmEMailErrorMessage.isDisplayed());
        fill(eMail).with("jhdf");
        assert(EMailErrorMessage.getText().contains("Format"));
        fill(eMail).with("");
        assert (EMailErrorMessage.getText().equals("Required"));
        fill(eMail).with(email);
        assert(ConfirmEMailErrorMessage.getText().equals("Required"));
        fill(ConfirmEMail).with("fjhdjh");
        assert(ConfirmEMailErrorMessage.isDisplayed());
        assert(ConfirmEMailErrorMessage.getText().contains("Format"));
        fill(ConfirmEMail).with(email);
        waitForSpecificSeconds(2);
        boolean enterCatch=false;
        try {
            assert(!ConfirmEMailErrorMessage.isDisplayed());
        }
        catch (Exception e)
        {
            enterCatch=true;
        }
        assert(enterCatch); 
        fill(ConfirmEMail).with(eMail.getValue()+"k");
        waitForSpecificSeconds(2);
        assert(ConfirmEMailErrorMessage.getText().equals("Does not match previously provided e-mail address"));
        fill(ConfirmEMail).with(eMail.getValue());
        waitForSpecificSeconds(2);
        enterCatch=false;
        try {
            assert(!ConfirmEMailErrorMessage.isDisplayed());
        }
        catch (Exception e)
        {
            enterCatch=true;
        }
        assert(enterCatch);
        fill(eMail).with(eMail.getValue()+"k");
        assert(ConfirmEMailErrorMessage.getText().equals("Does not match previously provided e-mail address"));
        eMailCancelButton.click();
    }

    public void functionalProfileAndPreferencesDelivery() {
        assert(!DeliverOnline.isEnabled());
        assert(!DeliveryUsMail.isEnabled());
        DeliverPreferenceEdit.click();
        DeliverOnline.click();
        waitForSpecificSeconds(2);
        DeliverySaveButton.click();
        assert(DeliveryErrorMessage.getText().equals("Required"));
        assert(DeliverOnline.isSelected());
        assert(!DeliveryUsMail.isSelected());
        DeliveryCancelButton.click();
    }
    
    public void isAt(){
        assert(PageTitle.getText().equals("Profile and Preferences"));
    }
    
}
