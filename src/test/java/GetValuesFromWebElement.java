import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by user on 14-Dec-16.
 */
public class GetValuesFromWebElement {

    public static void main(String[] args) {

        //Firefox browser configuration.
        FirefoxDriverManager.getInstance().setup();
        WebDriver driver = new FirefoxDriver();

        //Windows maximize.
        driver.manage().window().maximize();

        //Open URL in fire fox browser.
        driver.get("http://www.google.com");

        //Search box find by using 'Xpath'.
        WebElement SearchBox = driver.findElement(By.xpath(".//input[@name='q']"));

        //Web element get value using 'getAttribute'.
        String GetAttributeValue = SearchBox.getAttribute("title");
        System.out.println("Get Attribute Value : "+GetAttributeValue);

        //Web Element get tag name using 'getTagName'.
        String GetTagValue = SearchBox.getTagName();
        System.out.println("Get Tag Name : "+GetTagValue);

        //Web Element get text using 'getText'.
        String GetTextValue = SearchBox.getText();
        System.out.println("Get text : "+GetTextValue);

        //Web Element get location using 'getLocation'.
        String GetLocationValue = SearchBox.getLocation().toString();
        System.out.println("Get Location : "+GetLocationValue);

        //Web Element get size using 'getSize'.
        String GetSizeValue = SearchBox.getSize().toString();
        System.out.println("Get Size : "+GetSizeValue);

        //Web Element get rectangle using 'getRect'.
        String GetRectangleValue =SearchBox.getRect().toString();
        System.out.println("Get Rectangle : "+GetRectangleValue);

        //Quit browser.
        driver.quit();
    }
}
