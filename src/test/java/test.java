import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class test {

    @Test
    public void startBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setBrowserVersion("115");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com");
        driver.quit();
    }
}
