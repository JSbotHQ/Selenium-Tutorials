import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 15-Dec-16.
 */
public class SelectValueFromDropDownList {

    public static void main(String[] args) {

        //Firefox browser configuration.
        FirefoxDriverManager.getInstance().setup();
        WebDriver driver = new FirefoxDriver();

        //Windows maximize.
        driver.manage().window().maximize();

        //Open URL in fire fox browser.
        driver.get("http://www.facebook.com");

        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Find Day drop down list using xpath.
        WebElement DayDropDown = driver.findElement(By.xpath(".//select[@id='day']"));
        Select dropDown = new Select(DayDropDown);

        //Drop down list value select by 'Visible Text'.
        dropDown.selectByVisibleText("23");
        System.out.println("Select date by visible text.");

        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Drop down list value select by 'index'.
        dropDown.selectByIndex(2);
        System.out.println("Select date by index.");

        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Drop down list value select by 'Value'.
        dropDown.selectByValue("13");
        System.out.println("Select date by value.");

        //Quit browser
        driver.quit();

    }

}
