package navigation;

import BaseApi.CommonApi;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by mrahman on 12/28/14.
 */
public class LogIn extends CommonApi {

    @Test
    public void logIn()throws InterruptedException{
        String homeWindow = driver.getWindowHandle();
        clickOnCss(".no-border.no-pad-right>a");
        String popUpWindow1 = driver.getWindowHandle();
        driver.switchTo().window(popUpWindow1);
        clickOnCss(".cnnOvrlyBtn.cnnBtnLogIn");
        String popUpWindow2 = driver.getWindowHandle();
        driver.switchTo().window(popUpWindow2);
        typeByCss("#cnnOverlayEmail1l", "username");
        typeByCss("#cnnOverlayPwd", "password");
        driver.switchTo().window(homeWindow);
        sleep(3);

        Assert.assertEquals("","");

    }
}
