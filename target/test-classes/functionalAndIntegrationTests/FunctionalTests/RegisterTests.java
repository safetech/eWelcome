package functionalAndIntegrationTests.FunctionalTests;

import functionalAndIntegrationTests.CQBaseIntegrationTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Before;
import org.junit.Test;
import resources.Application;
import resources.pages.WelcomePage;

public class RegisterTests extends CQBaseIntegrationTest {

    @Page public WelcomePage welcomePage;

   
    @Before
    public void setup(){
        app = new Application();
    }
    
    @Test
    public void eWelcomeRegistrationTest(){
        app.setTechnicalSupport("1-866-388-9919");
        app.setPlanInformation("1-800-523-5800");
        
        
            goTo(welcomePage);
            welcomePage.fillAndSubmit(app);
        
        
    }
}
 