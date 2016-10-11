package resources.pages;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by vbabu109 on 10/10/2016.
 */
public class Plan_MY_Page extends Plan_F_Page {
    @Override
    public void isAt(){
        assertThat(YourPlanF.getText(), equalTo("AARP Medicare Supplement 1 Plan MY"));
    }
}
