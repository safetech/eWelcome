package resources.pages;

import com.github.javafaker.Faker;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import resources.Application;
import resources.utils.DateUtils;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
public class RegisterPage extends FluentPage {
public Faker faker;
    @FindBy(xpath = "/html/body/div[1]/div[1]/main/div/h1") FluentWebElement pageTitle;
    @FindBy(xpath = "/html/body/div[1]/div[1]/main/div/form/p/a[1]") FluentWebElement TermsOfUse;
    
    FluentWebElement firstNameId_input;
    FluentWebElement lastNameId_input;
    FluentWebElement dob_id_dob;
    FluentWebElement emailAddressId_input;
    FluentWebElement userNameId_input;
    FluentWebElement pwdId_input;
    FluentWebElement confirmPwdId_input;
    FluentWebElement secAnswerOneId_input;
    FluentWebElement secAnswerTwoId_input;
    FluentWebElement secAnswerThreeId_input;
    FluentWebElement agreeButtonId;
    FluentWebElement secQues1Id;

   public void fillAndSubmit(Application app){
       faker = new Faker();
       isAt();
       fill(firstNameId_input).with( app.getFirstName() );
       fill(lastNameId_input).with(faker.lastName()  );
       fill(dob_id_dob).with(DateUtils.getDOBInNormalDateFormat(67));
       fill(emailAddressId_input).with( faker.letterify("????????")+"@uhc.com" );
       fill(userNameId_input).with( faker.bothify("??????????#####") );
       fill(pwdId_input).with( "PAssword123" );
       fill( confirmPwdId_input).with("PAssword123" );
       
       Select dropdown = new Select(getDriver().findElement(By.id("secQues1Id")));
       dropdown.selectByIndex(1);
       fill( secAnswerOneId_input).with("Answer1" );
       
       dropdown=null;
       dropdown= new Select(getDriver().findElement(By.id("secQues2Id")));
       dropdown.selectByIndex(2);
       fill( secAnswerTwoId_input).with("Answer2" );
       
       dropdown=null;
       dropdown= new Select(getDriver().findElement(By.id("secQues3Id")));
       dropdown.selectByIndex(3);
       fill( secAnswerThreeId_input).with("Answer3" );
       

       //dropdown.getOptions();
       //dropdown.selectByVisibleText("What was your first phone number?");
       //dropdown.selectByValue("prog");
       
//       (new Select(secQues1Id.getElement())). 
       
       
//       TermsOfUse.click(); //Get Caitlins clarification
//       getDriver().navigate().back();
       //agreeButtonId.click();
    }
    
    public void isAt() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertThat(pageTitle.getText(), equalTo("Create an Optum ID"));
    }
}
