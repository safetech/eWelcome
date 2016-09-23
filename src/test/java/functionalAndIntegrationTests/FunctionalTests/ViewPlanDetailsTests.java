package functionalAndIntegrationTests.FunctionalTests;


import com.github.javafaker.Faker;
import functionalAndIntegrationTests.CQBaseIntegrationTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Before;
import org.junit.Test;
import resources.Application;
import resources.pages.*;

public class ViewPlanDetailsTests extends CQBaseIntegrationTest {

    @Page public WelcomePage welcomePage;
    @Page public SignInPage signInPage;
    @Page public YourPlanPage yourPlanPage;
    @Page public Plan_F_Page plan_f_page;
    @Page public Plan_UW_Page plan_uw_page;
    @Page public Plan_NW_Page plan_nw_page;
    @Page public Plan_OW_Page plan_ow_page;
    public Faker faker;

    @Before
    public void setup(){
        app = new Application();
        faker = new Faker(  );
    }

    @Test
    public void SignInToVerifyPlan_F_Tests(){
        
        app.setUserName("Automation12");
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        plan_f_page.clickAndVerify();
    }
    @Test
    public void SignInToVerifyPlan_NW_OW_Tests(){
        getDriver().manage().deleteAllCookies();
        app.setUserName("Automation13");
//        app.setUserName("BasicPlan_Rider2345_3");
        goTo(welcomePage);
        
        signInPage.fillAndSubmit(app);
        //plan_nw_page.clickAndVerify();
        plan_ow_page.clickAndVerify();
    }
    @Test
    public void SignInToVerifyPlan_UW_Tests(){

        app.setUserName("Automation14");
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        plan_uw_page.clickAndVerify();
    }    

    
    
}
 