package resources.pages;

import com.github.javafaker.Faker;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.utils.AnswerUtils;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WizardPage extends FluentPage {
    public Faker faker;
    protected final static String NO = AnswerUtils.NO;
    protected final static String YES = AnswerUtils.YES;
    protected final static String UNSURE = AnswerUtils.UNSURE;
    protected final static String BLANK = AnswerUtils.BLANK;

    @FindBy(css = "section h3:first-of-type") protected FluentWebElement pageTitle;


    public FluentWebElement ZipCode;
    public FluentWebElement DOB;
    public FluentWebElement MPBED;
    public String dtcApplicationId = "";



    public void setCommonCustomerInformation(String commonCustomerInformation) {
        this.commonCustomerInformation = commonCustomerInformation;
    }

    public String commonCustomerInformation = "";

    public void waitForElementPresent(int numOfSeconds, String xpathLocator) {
        WebElement element = (new WebDriverWait(getDriver(), numOfSeconds))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator)));
    }
    
    public String getDtcApplicationId() {
        return this.dtcApplicationId;
    }    


    public void setDtcApplicationId(String dtcApplicationId) {
        this.dtcApplicationId = dtcApplicationId;
    }


    @FindBy(css = "a.action_next")
    public FluentWebElement nextButton;
    public FluentWebElement resume;
    public void blur(String selector){
        executeScript("$('"+selector+"').blur()");
    }
    
    private String TEXT_SUB_SELECTOR = "span[data-textsub-id='%s']";
    public String WIZARD_PAGE_NEXT_BTN_SELECTOR = "a.action_next";

    protected void waitForSpinnerToFinish() {
        waitForSpinnerToFinish(10);
    }

    protected void waitForSpinnerToFinish(int seconds) {
        await().atMost(seconds, TimeUnit.SECONDS).until("#loading_fader").areNotDisplayed();
    }

    protected void fillYesNoQuestion(FluentWebElement yesRadio, FluentWebElement noRadio, String answer) {
        if(answer.equals(YES)) {
            yesRadio.click();
        }
        if(answer.equals(NO)) {
            noRadio.click();
        }
    }

    protected void fillYesNoUnsureQuestion(FluentWebElement yesRadio, FluentWebElement noRadio, FluentWebElement unsureRadio, String answer) {
        if(answer.equals(YES)) {
            yesRadio.click();
        }
        if(answer.equals(NO)) {
            noRadio.click();
        }
        if(answer.equals(UNSURE)) {
            unsureRadio.click();
        }
    }

    public void closeSpecificBrowser(int Brow){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ArrayList<String> windows = new ArrayList<String> (getDriver().getWindowHandles());
        String baseWindowHdl = getDriver().getWindowHandle();
        getDriver().switchTo().window(windows.get(Brow));
        getDriver().close();
        getDriver().switchTo().window(baseWindowHdl);
    }
    
    protected void assertYesNoQuestion(FluentWebElement yesRadio, FluentWebElement noRadio, String answer) {
        switch (answer) {
            case YES:
                assertThat(String.format("Testing selectedness of radio with id = %s", yesRadio.getId()), yesRadio.isSelected(), equalTo(true));
                break;
            case NO:
                assertThat(String.format("Testing selectedness of radio with id = %s", noRadio.getId()), noRadio.isSelected(), equalTo(true));
                break;
            default:
                assertThat(String.format("Testing selectedness of radio with id = %s", yesRadio.getId()), yesRadio.isSelected(), equalTo(false));
                assertThat(String.format("Testing selectedness of radio with id = %s", noRadio.getId()), noRadio.isSelected(), equalTo(false));
        }
    }

    protected void assertYesNoUnsureQuestion(FluentWebElement yesRadio, FluentWebElement noRadio, FluentWebElement unsureRadio, String answer) {
        switch (answer) {
            case YES:
                assertThat(String.format("Testing selectedness of radio with id = %s", yesRadio.getId()), yesRadio.isSelected(), equalTo(true));
                break;
            case NO:
                assertThat(String.format("Testing selectedness of radio with id = %s", noRadio.getId()), noRadio.isSelected(), equalTo(true));
                break;
            case UNSURE:
                assertThat(String.format("Testing selectedness of radio with id = %s", unsureRadio.getId()), unsureRadio.isSelected(), equalTo(true));
                break;
            default:
                assertThat(String.format("Testing selectedness of radio with id = %s", yesRadio.getId()), yesRadio.isSelected(), equalTo(false));
                assertThat(String.format("Testing selectedness of radio with id = %s", noRadio.getId()), noRadio.isSelected(), equalTo(false));
                assertThat(String.format("Testing selectedness of radio with id = %s", unsureRadio.getId()), unsureRadio.isSelected(), equalTo(false));
        }
    }

    protected void assertVisibleBasedUpon(boolean shouldBeVisible, FluentWebElement... elements) {
        for(FluentWebElement element : elements) {
            assertThat(String.format("Testing visibility of %s", element.getId()), element.isDisplayed(), equalTo(shouldBeVisible));
        }
    }

    protected void assertVisible(FluentWebElement... elements) {
        assertVisibleBasedUpon(true, elements);
    }

    protected void assertHidden(FluentWebElement... elements) {
        assertVisibleBasedUpon(false, elements);
    }

    protected void fillCheckboxQuestion(FluentWebElement checkbox, String answer) {
        if(answer.equals("yes")) {
            checkbox.click();
        }
    }


    public void clickNextAndWaitForSpinnerToFinish() {
        clickNextAndWaitForSpinnerToFinish(10);
    }

    protected void clickNextAndWaitForSpinnerToFinish(int seconds) {
        nextButton.click();
        waitForSpinnerToFinish(seconds);
    }

    protected void assertHidden(FluentWebElement element) {
        assertThat(element.isDisplayed(), equalTo(false));
    }


    protected void assertQuestionCount(int expectedCount) {
        assertThat(find("input[type='text'], input[type='checkbox'], input[type='radio'], select").size(), equalTo(expectedCount));
    }    


    public int getVisibleElementCount() {
        return Integer.parseInt(getScriptResult("$('input:visible, select:visible').length"));
    }

    public String getScriptResult(String script) {
        if (find("body > #output").size() == 0) {
            executeScript("$('body').append('<div id=\"output\" style=\"\"/>');");
            await().atMost(10, TimeUnit.SECONDS).until("body > #output").isPresent();
        }
        executeScript("$('#output').text('');");
        executeScript("$('#output').text(" + script + ");");
        return find("body > #output").getText();
    }
    
    public void isAt() {
        assertThat(pageTitle.getText(), equalTo("What You Need"));

    }
    public void checkMarketabilityCode(String marketCode){
        isAt();
        String marketibilityError = getScriptResult("controller.model.getQuestionValue('marketabilityCode')");
        assertThat(marketibilityError, equalTo(marketCode));
    }


    
}
