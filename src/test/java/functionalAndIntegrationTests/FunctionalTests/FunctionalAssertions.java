package functionalAndIntegrationTests.FunctionalTests;


import com.github.javafaker.Faker;
import functionalAndIntegrationTests.CQBaseIntegrationTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Before;
import org.junit.Test;
import resources.Application;
import resources.pages.ProfileAndPreferencePage;
import resources.pages.SignInPage;
import resources.pages.WelcomePage;

public class FunctionalAssertions extends CQBaseIntegrationTest {

    @Page public WelcomePage welcomePage;
    @Page public SignInPage signInPage;
    @Page public ProfileAndPreferencePage profileAndPreferencePage;

    public Faker faker;
    
    @Before
    public void setup(){
        app = new Application();
        faker = new Faker(  );
    }
    @Test
    public void functionalTest(){
        app.setSilverSneakers(true);
        app.setNurseHealthLine(true);
        app.setSavingsOnVisionContents(true);

        app.setUserName("CA_Plan_F");
        goTo(welcomePage);
        signInPage.fillAndSubmit(app);
        profileAndPreferencePage.functionalTest();
    }


}
