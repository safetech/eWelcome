package functionalAndIntegrationTests.FunctionalTests;


import com.github.javafaker.Faker;
import functionalAndIntegrationTests.CQBaseIntegrationTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import resources.Application;
import resources.pages.*;

import java.sql.SQLException;

import static resources.queries.InsertionQueries.insertIntoIsPerf;

public class ViewPlanDetailsTests extends CQBaseIntegrationTest {

    @Page public WelcomePage welcomePage;
    @Page public SignInPage signInPage;
    @Page public Plan_F_Page plan_f_page;
    @Page public Plan_UW_Page plan_uw_page;
    @Page public Plan_NW_Page plan_nw_page;
    @Page public Plan_OW_Page plan_ow_page;
    @Page public Plan_TW_Page plan_tw_page;
    @Page public Plan_XW_YW_VW_WW_Page plan_xw_yw_vw_ww_page;
    @Page public Plan_F_Select_Page plan_f_select_page;
    @Page public Plan_K_Page plan_k_page;
    public Faker faker;

    @Before
    public void setup(){
        app = new Application();
        faker = new Faker(  );
    }
    @Test
    public void SignInToVerifyPlan_F_Tests() throws SQLException {
        insertIntoIsPerf("145193952","Y");

        app.setUserName("CA_Plan_F");
//        app.setUserName("Automation12");
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        plan_f_page.clickAndVerify();
        plan_f_page.Logout();
    }
    @Test
    public void SignInToVerifyPlan_NW_OW_Tests(){
        getDriver().manage().deleteAllCookies();
        app.setUserName("WI_BasicCoPayRider1_NW_OW");
//        app.setUserName("Automation13");
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        plan_nw_page.clickAndVerify();
        getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[2]/form/ul/li[2]/a/p[1]")).click();
        plan_ow_page.clickAndVerify();
        plan_ow_page.Logout();
    }
    @Test
    public void SignInToVerifyPlan_UW_Tests(){
//        app.setUserName("Automation14");
        app.setUserName("MN_ExtendedBasicPlan_UW");
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        plan_uw_page.clickAndVerify();
        plan_uw_page.Logout();
    }     
    @Test
    public void SignInToVerifyPlan_TW_XW_YW_Tests(){
        app.setUserName("BasicPlan_Rider2345_3");
//        app.setUserName("Automation16");
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        plan_tw_page.clickAndVerify();
        getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[2]/form/ul/li[2]/a")).click();
        plan_xw_yw_vw_ww_page.isAt();
        plan_xw_yw_vw_ww_page.clickAndVerify();
        getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[2]/form/ul/li[3]/a")).click();
        plan_xw_yw_vw_ww_page.ClickAndVerify_YW();
        plan_xw_yw_vw_ww_page.Logout();
    }    
    @Test
    public void SignInToVerifyPlan_TW_YW_VW_WW_Tests(){
        app.setUserName("MN_BasicPlanRider_234");
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        plan_tw_page.clickAndVerify();
        getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[2]/form/ul/li[2]/a")).click();
        plan_xw_yw_vw_ww_page.ClickAndVerify_YW();
        getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[2]/form/ul/li[3]/a")).click();
        plan_xw_yw_vw_ww_page.ClickAndVerify_VW();
        getDriver().findElement(By.xpath("html/body/div[3]/div[1]/div[5]/div/div/div/div/div[2]/div[2]/form/ul/li[4]/a")).click();
        plan_xw_yw_vw_ww_page.ClickAndVerify_WW();
        plan_xw_yw_vw_ww_page.Logout();
    }
    @Test
    public void SignInToVerifyPlan_F_Select_Tests(){
        app.setUserName("FL_SelectPlan_F");
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        plan_f_select_page.clickAndVerify_F_Select();
        plan_f_select_page.Logout();
    }    
    @Test
    public void SignInToVerifyPlan_K_Tests(){
        app.setUserName("PA_Plan_K");
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        plan_k_page.clickAndVerify();
        plan_k_page.Logout();
    }
}
 