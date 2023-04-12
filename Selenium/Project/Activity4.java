package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");

        WebElement headingElement = driver.findElement((By.tagName("h2")));
        String heading = headingElement.getText();

        if (heading.equals("Quia quis non")) {
            System.out.println("Heading matches exactly.");
            driver.close();
        } else {
            System.out.println("Heading does not match exactly.");
            driver.close();
        }
    }
}
