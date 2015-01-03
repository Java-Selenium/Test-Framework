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
        sleep(5);
        clickOnCss(".login_btn");  //login_btn link_button cursor-pointer
        WebElement frame = getWebElement("#surf-xdm iframe:nth-child(1)");
        driver.switchTo().frame(frame);
        sleep(3);
        typeByCss("input#input_username", "test-username");
        typeByCss("input#input_password", "test-password");
        clickOnCss("button#button_submit");
        driver.switchTo().defaultContent();

    }

}
