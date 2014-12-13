package BaseApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/*
* Created with IntelliJ IDEA.
* User: rrt
* Date: 12/13/14
* Time: 1:34 PM
* To change this template use File | Settings | File Templates.
*/
public class CommonApi {
    public WebDriver driver = null;
    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rrt\\java-selenium\\chrome-driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://www.cnn.com");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }

    //Utility methods

    public List<WebElement> getListOfWebElement(String locator){
        List<WebElement> list = driver.findElements(By.cssSelector(locator));

        return list;
    }

    public List<String> getListOfText(List<WebElement> list){
        List<String> text = new ArrayList<String>();
      for(WebElement element:list){
          text.add(element.getText());
      }

      return text;
    }

    public void navigateBack(){
        driver.navigate().back();
    }

}
