package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");

        WebElement navigationBar = driver.findElement(By.id("primary-menu"));
        WebElement menuItem = navigationBar.findElement(By.linkText("Jobs"));
        menuItem.click();

        driver.findElement(By.id("search_keywords")).sendKeys(" QA Tester ");

        driver.findElement(By.cssSelector("input[value='Search Jobs']")).click();
        Thread.sleep(500);

        driver.findElement(By.tagName("h3")).click();
        Thread.sleep(500);

        driver.findElement((By.xpath("//input[@class='application_button button']"))).click();
        Thread.sleep(500);

        WebElement emailElement = driver.findElement(By.tagName("a"));
        Thread.sleep(500);

        WebElement email = driver.findElement(By.xpath("//a[@class='job_application_email']"));
        System.out.println("Job application email: " + email.getText());

        driver.close();
    }
}