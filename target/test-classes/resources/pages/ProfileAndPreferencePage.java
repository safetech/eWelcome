package resources.pages;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileAndPreferencePage extends WelcomePage {
    @FindBy(xpath = "html/body/div[3]/header/div/div[3]/section[2]/button") FluentWebElement More; 
    @FindBy(xpath = "html/body/div[3]/header/div/div[3]/section[2]/ul/li[1]/a") FluentWebElement ProfileAndPreferences; 
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/div/div[2]/div/div/div/div[1]/div[2]/div/div[4]/a") FluentWebElement eMailEditLink; 
    @FindBy(xpath = "html/body/div[3]/header/div/div[3]/section[2]/ul/li[2]/a") FluentWebElement MyPlanInformation; 
        
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
    
    public  void verifyProfileAndPrefences() {
        More.click();
        ProfileAndPreferences.click();
        isAt();
        ProfileAndPrefencesEmail();
        ProfileAndPrefencesDelivery();
        More.click();
        MyPlanInformation.click();
    }
    public void ProfileAndPrefencesEmail() {
        
        assert(!eMail.isDisplayed() && !ConfirmEMail.isDisplayed());        
        eMailEditLink.click();
        waitForSpecificSeconds(2);
        assert(eMailSaveButton.isDisplayed() && eMailCancelButton.isDisplayed());
        eMailCancelButton.click();
        waitForSpecificSeconds(2);
        eMailAddress.getText().contains("@");
    }    
    
    public void ProfileAndPrefencesDelivery() {
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
        functionalProfileAndPrefencesDelivery();
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

    public void functionalProfileAndPrefencesDelivery() {
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
