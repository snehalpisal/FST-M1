package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity7 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");

        WebElement navigationBar = driver.findElement(By.id("primary-menu"));
        WebElement menuItem = navigationBar.findElement(By.linkText("Post a Job"));
        menuItem.click();

        driver.findElement(By.id("create_account_email")).sendKeys("snehal.pisal@tcs.com");

        driver.findElement(By.id("job_title")).sendKeys("Selenium Test Engineer");

        WebElement dropdown = driver.findElement(By.id("job_type"));
        Select singleSelect = new Select(dropdown);
        singleSelect.selectByVisibleText("Full Time");

        driver.findElement(By.id("job_description_ifr")).sendKeys(" This is a testing job.");

        driver.findElement(By.id("application")).sendKeys("snehal.pisal@tcs.com");

        driver.findElement(By.id("company_name")).sendKeys("IBM");

        driver.findElement((By.xpath("//input[@class='button']"))).click();
        Thread.sleep(2000);

        driver.findElement(By.id("job_preview_submit_button")).click();
        Thread.sleep(2000);

        driver.close();
    }
}
