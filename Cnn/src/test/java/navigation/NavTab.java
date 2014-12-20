package navigation;

import BaseApi.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rrt
 * Date: 12/13/14
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class NavTab extends CommonApi {
    @Test
    public void testTab() throws InterruptedException{
        List<WebElement> webElementList = getListOfWebElement("#cnn_hdr-nav li");
        for(int i=0; i<webElementList.size(); i++){
            webElementList.get(i).click();
            Thread.sleep(2000);
            if(i==1){
            navigateBack();
            }
            webElementList = getListOfWebElement("#cnn_hdr-nav li");
        }

    }
}
