package functionalAndIntegrationTests.FunctionalTests;


import com.github.javafaker.Faker;
import functionalAndIntegrationTests.CQBaseIntegrationTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Before;
import org.junit.Test;
import resources.Application;
import resources.pages.SignInPage;
import resources.pages.WelcomePage;
import resources.pages.YourPlanPage;

public class ViewPlanDetailsTests extends CQBaseIntegrationTest {

    @Page public WelcomePage welcomePage;
    @Page public SignInPage signInPage;
    @Page public YourPlanPage yourPlanPage;
    public Faker faker;

    @Before
    public void setup(){
        app = new Application();
        faker = new Faker(  );
    }

    @Test
    public void SignInToViewPlans(){
 
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        yourPlanPage.fillAndSubmit(app);


    }
}
 