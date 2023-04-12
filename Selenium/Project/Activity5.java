package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");

        WebElement navigationBar = driver.findElement(By.id("primary-menu"));
        WebElement menuItem = navigationBar.findElement(By.linkText("Jobs"));
        menuItem.click();

        System.out.println("Page Title is : " +driver.getTitle());
        String pageTitle = driver.getTitle();
        if (pageTitle.equals("Jobs – Alchemy Jobs")) {
            System.out.println("We are on the correct page.");
        } else {
            System.out.println("We are not on the correct page.");
        }

        driver.close();
    }
}