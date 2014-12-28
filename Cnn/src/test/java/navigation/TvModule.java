package navigation;

import BaseApi.CommonApi;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by mrahman on 12/28/14.
 */
public class TvModule extends CommonApi {

    @Test
    public void tvProgram(){
        WebElement element = getWebElement(".cnn_tsbnav.cnn_pmtvmodddown>form>select");
        List<WebElement> listOfWebElement = getListOfWebElement(".cnn_tsbnav.cnn_pmtvmodddown>form>select option");
        List<String> listOfMenuText = getListOfText(listOfWebElement);
        for(int i=0; i<listOfMenuText.size(); i++) {
            if (i == 1 || i == 3) {
                continue;
            } else {

                selectElementByOption(element, listOfMenuText.get(i));
            }
            navigateBack();
            element = getWebElement(".cnn_tsbnav.cnn_pmtvmodddown>form>select");
        }
    }
}
