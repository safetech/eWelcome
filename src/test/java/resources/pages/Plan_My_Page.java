package resources.pages;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by sislam13 on 10/12/16.
 */
public class Plan_My_Page extends Plan_F_Page {
    @Override
    public void isAt(){
        assertThat(YourPlanF.getText(), equalTo("AARP Medicare Supplement 1 Plan MY"));
        
    }
}
