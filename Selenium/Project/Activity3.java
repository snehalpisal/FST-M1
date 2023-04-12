package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");

        WebElement headerImageElement = driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-post-image']"));
        String headerImageUrl = headerImageElement.getAttribute("src");
        System.out.println("Header image URL: " + headerImageUrl);
        driver.close();
    }
}
