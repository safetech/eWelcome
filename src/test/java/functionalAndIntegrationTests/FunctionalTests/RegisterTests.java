package functionalAndIntegrationTests.FunctionalTests;

import com.github.javafaker.Faker;
import functionalAndIntegrationTests.CQBaseIntegrationTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Before;
import org.junit.Test;
import resources.Application;
import resources.pages.RegisterPage;
import resources.pages.WelcomePage;

public class RegisterTests extends CQBaseIntegrationTest {

    @Page public WelcomePage welcomePage;
    @Page public RegisterPage registerPage;
    
    public Faker faker;
   
    @Before
    public void setup(){
        app = new Application();
        faker = new Faker(  );
    }
    
    @Test
    public void eWelcomeRegistrationTest(){
        app.setTechnicalSupport("1-866-388-9919");
        app.setPlanInformation("1-800-523-5800");
        app.setFirstName(faker.firstName());
        
        goTo(welcomePage);
        welcomePage.fillAndSubmit(app);
        
        
        
        
        
    }
}
 