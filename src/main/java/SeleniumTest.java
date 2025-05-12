import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

public class SeleniumTest {
    public static void main(String[] args) {
        // Use WebDriverManager to set up the ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver (Chrome)
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://formy-project.herokuapp.com/keypress");

        // Print the title of the page
        // System.out.println("Page title: " + driver.getTitle());

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Minh");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        // Close the browser
        // driver.quit();
    }
}