import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by user on 14-Dec-16.
 */
public class LocatingWebElement {

    public static void main(String[] args) {

        //Firefox browser configuration.
        FirefoxDriverManager.getInstance().setup();
        WebDriver driver = new FirefoxDriver();

        //Windows maximize.
        driver.manage().window().maximize();

        //Open URL in fire fox browser.
        driver.get("http://www.google.com");

        //Search box web element find by using the class name.
        WebElement SearchBox_ClassName = driver.findElement(By.className("sbib_b"));
        System.out.println("Element find by the class name.");

        //Search box web element find by using 'tagName'.
        WebElement SearchBox_TagName = driver.findElement(By.tagName("input"));
        System.out.println("Element find by the tag name.");

        //Search box find by using 'name'.
        WebElement SearchBox_Name = driver.findElement(By.name("q"));
        System.out.println("Element find by the name.");

        //Search box web element find by using 'ID'.
        WebElement SearchBox_ID = driver.findElement(By.id("sb_ifc0"));
        System.out.println("Element find by the id.");

        //Search box find by using 'Xpath'.
        WebElement SearchBox_Xpath = driver.findElement(By.xpath(".//input[@title='Search']"));
        System.out.println("Element find by the xpath.");

        //Quit browser
        driver.quit();
    }
}
