import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by user on 14-Dec-16.
 */
public class ActionPerformOnWebElement {

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

        //Perform mouse hover action on web element.
        Actions action = new Actions(driver);
        action.moveToElement(GoogleSearchButton).build().perform();
        System.out.println("Perform mouse hover action.");

        //Perform mouse right click action on web element.
        action.contextClick(GoogleSearchButton).build().perform();
        System.out.println("Perform mouse right click on element.");

        //Perform click action.
        GoogleSearchButton.click();
        System.out.println("Perform click action on web element ");

        //Search box find by using 'Xpath'.
        WebElement SearchBox = driver.findElement(By.xpath(".//input[@name='q']"));

        //Perform send keys action on web element.
        SearchBox.sendKeys("Hello Google");

        //Perform web element clear operation.
        SearchBox.clear();

        //Quit browser.
        driver.quit();
    }

}
