package navigation;

import BaseApi.CommonApi;
import org.testng.annotations.Test;

import java.beans.IntrospectionException;

/**
 * Created by mrahman on 12/20/14.
 */
public class Search extends CommonApi {

    @Test
    public void searchInput()throws InterruptedException{

      typeByCss(".ftr-search-tfield input#hdr-search-box",  "Politics");
      sleep(3);
    }
}
