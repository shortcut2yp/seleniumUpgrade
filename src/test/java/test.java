import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setBrowserVersion("116");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.quit();
    }
}
