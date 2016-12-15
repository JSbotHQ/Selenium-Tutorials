import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by user on 14-Dec-16.
 */
public class VerifyWebElement {

    public static void main(String[] args) {

        //Firefox browser configuration.
        FirefoxDriverManager.getInstance().setup();
        WebDriver driver = new FirefoxDriver();

        //Windows maximize.
        driver.manage().window().maximize();

        //Open URL in fire fox browser.
        driver.get("http://www.google.com");

        //Google search button find by xpath.
        WebElement GoogleSearchButton = driver.findElement(By.xpath(".//input[@name='btnK']"));

        //Verify web element is display.
        boolean ButtonDisplay = GoogleSearchButton.isDisplayed();
        System.out.println("Google search button is display? : "+ButtonDisplay);

        //Verify web element is enable.
        boolean ButtonEnabled = GoogleSearchButton.isEnabled();
        System.out.println("Google search button is enable? : "+ButtonEnabled);

        //Verify web element is selected.
        boolean ButtonSelected = GoogleSearchButton.isSelected();
        System.out.println("Google search button selected? : "+ButtonSelected);

        //Quit browser.
        driver.quit();
    }

}
