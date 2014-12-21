import BaseApi.CommonApi;
import org.testng.annotations.Test;

import javax.smartcardio.CommandAPDU;

/**
 * Created by mrahman on 12/21/14.
 */
public class Home extends CommonApi {

    @Test
    public void homePage(){
        System.out.println(driver.getCurrentUrl());
    }
}
