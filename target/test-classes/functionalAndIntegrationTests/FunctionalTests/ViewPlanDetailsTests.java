package functionalAndIntegrationTests.FunctionalTests;


import com.github.javafaker.Faker;
import functionalAndIntegrationTests.CQBaseIntegrationTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
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
    @Page public Plan_TW_Page plan_tw_page;
    @Page public Plan_XW_Page plan_xw_page;
    @Page public Plan_YW_Page plan_yw_page;
    
    public Faker faker;

    @Before
    public void setup(){
        app = new Application();
        faker = new Faker(  );
    }

    @Ignore
    public void SignInToVerifyPlan_F_Tests(){
        
        app.setUserName("Automation12");
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        plan_f_page.clickAndVerify();
    }
    @Ignore
    public void SignInToVerifyPlan_NW_OW_Tests(){
        getDriver().manage().deleteAllCookies();
        app.setUserName("Automation16");
//   app.setUserName("BasicPlan_Rider2345_3");
        goTo(welcomePage);
        
        signInPage.fillAndSubmit(app);
        plan_nw_page.clickAndVerify();
        getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[2]/form/ul/li[2]/a/p[1]")).click();
        plan_ow_page.clickAndVerify();
    }
    @Ignore
    public void SignInToVerifyPlan_UW_Tests(){

        app.setUserName("Automation14");
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        plan_uw_page.clickAndVerify();
    }     
    @Test
    public void SignInToVerifyPlan_TW_XW_YW_Tests(){

        app.setUserName("Automation16");
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        plan_tw_page.clickAndVerify();
        getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[2]/form/ul/li[2]/a")).click();
//        plan_xw_page.clickAndVerify();
        getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[2]/form/ul/li[3]/a")).click();
        plan_yw_page.clickAndVerify();
    }    

    
    
}
 