import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class test {

    @Test
    public void startBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setBrowserVersion("115");
        options.addArguments("--window-size=1920,1080");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-gpu");
		options.addArguments("--disable-crash-reporter");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-in-process-stack-traces");
		options.addArguments("--disable-logging");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--log-level=3");
		options.addArguments("--output=/dev/null");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com");
        driver.quit();
    }
}
