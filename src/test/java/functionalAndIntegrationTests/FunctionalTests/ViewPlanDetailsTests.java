package functionalAndIntegrationTests.FunctionalTests;


import com.github.javafaker.Faker;
import functionalAndIntegrationTests.CQBaseIntegrationTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import resources.Application;
import resources.pages.Plan_F_Page;
import resources.pages.SignInPage;
import resources.pages.WelcomePage;
import resources.pages.YourPlanPage;

public class ViewPlanDetailsTests extends CQBaseIntegrationTest {

    @Page public WelcomePage welcomePage;
    @Page public SignInPage signInPage;
    @Page public YourPlanPage yourPlanPage;
    @Page public Plan_F_Page plan_f_page;
    public Faker faker;

    @Before
    public void setup(){
        app = new Application();
        faker = new Faker(  );
    }

    @Test
    public void SignInToVerifyPlanFTests(){
 
        app.setUserName("Automation12");
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        plan_f_page.clickAndVerify(app);
    } 
    @Ignore
    @Test
    public void SignInToVerifyPlanKTests(){
 
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        
    }
    
    
}
 