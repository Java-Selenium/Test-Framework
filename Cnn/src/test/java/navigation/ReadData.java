package navigation;

import BaseApi.CommonApi;
import BaseApi.DataReader;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by mrahman on 1/3/15.
 */
public class ReadData  extends CommonApi{

    DataReader reader = new DataReader();
    String [][] locators;
    @Test
    public void nav()throws IOException{
        String path = "/Users/mrahman/Desktop/cnn-data-reader.xls";
        locators = reader.read(path);
        for(int i=0; i<locators.length; i++){
            for(int j=1; j<2; j++){
                String locator = locators[i][j];
                clickOnCss(locator);
            }
        }
    }
}
