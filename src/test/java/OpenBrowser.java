import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by user on 14-Dec-16.
 */
public class OpenBrowser {

    /**
     * First Add 'selenium-java' jar in the project.
     * Then add 'webdrivermanager' jar in the project.
     * Use can use maven project then got 'pom.xml' file and add this two jar 'dependency'.
     * Maven automatically download this jar.
     */


    public static void main(String[] args) {


        WebDriver driver = Opera();

        //Use to windows maximize.
        driver.manage().window().maximize();

        //Open URL in selected browser.
        driver.get("http://www.google.com");

        //Quit browser.
        driver.quit();

    }

    /**
     * Program run with firefox browser.
     */
    public static WebDriver firefox() {
        FirefoxDriverManager.getInstance().setup();
        WebDriver driver = new FirefoxDriver();

        return driver;
    }

    /**
     * Program run with chrome browser.
     */
    public static WebDriver Chrome() {
        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();

        return driver;
    }

    /**
     * Program run with Internet Explorer11 browser.
     *
     */
    public static WebDriver IE11() {

        DesiredCapabilities capability = DesiredCapabilities.internetExplorer();

        InternetExplorerDriverManager.getInstance().setup();

        capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        capability.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        capability.setJavascriptEnabled(true);

        WebDriver driver = new InternetExplorerDriver(capability);

        return driver;
    }

    public static WebDriver Opera()
    {
        DesiredCapabilities capability = DesiredCapabilities.operaBlink();

        OperaDriverManager.getInstance().setup();

        WebDriver driver = new OperaDriver(capability);

        return driver;
    }

}
