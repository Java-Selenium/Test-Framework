package characterarcade;

import BaseApi.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DriverCommand;
import org.testng.annotations.Test;

/**
 * Created by mrahman on 1/3/15.
 */
public class ArcadeLogIn extends CommonApi {


    @Test
    public void logIn() throws InterruptedException{
        sleep(4);
        clickOnCss(".login_btn");  //login_btn link_button cursor-pointer
        WebElement frame1 = getWebElement("#surf-xdm iframe:nth-child(1)");
        driver.switchTo().frame(frame1);
        WebElement frame2 = getWebElement("#display-frame");
        driver.switchTo().frame(frame2);
        sleep(4);
        typeByCss("#input_username", "test-username");
        typeByCss("input#input_password", "test-password");
        clickOnCss("button#button_submit");
        driver.switchTo().defaultContent();

    }

}
