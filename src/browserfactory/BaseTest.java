package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        // Object creation
        driver = new ChromeDriver();

        // launch the Url
        driver.get(baseUrl);

        //Maximise window
        driver.manage().window().maximize();

        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));




    }

    public void closerBrowser(){
        driver.quit();
    }



}
