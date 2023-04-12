package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        System.out.println("Page title is : " + driver.getTitle());

        if (driver.getTitle().equals("Alchemy Jobs – Job Board Application")) {
            System.out.println("Title matches exactly.");
            driver.close();
        } else {
            System.out.println("Title does not match exactly.");

        }
        driver.close();


    }
}
