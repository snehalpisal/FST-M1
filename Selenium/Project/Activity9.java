package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity9 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");

        driver.findElement(By.id("wp-submit")).click();


        driver.findElement(By.id("menu-posts-job_listing")).click();
        driver.findElement((By.xpath("//*/a[@class = 'page-title-action']"))).click();
        driver.findElement(By.id("post-title-0")).sendKeys("Test Specialist - Automation");

        driver.findElement(By.xpath("//*/div[@class = 'edit-post-header__settings']/button[2]")).click();
        driver.findElement(By.xpath("//*/div[@class = 'editor-post-publish-panel']/div/div/button")).click();

        String publishedJob = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div")).getText();
        Thread.sleep(2000);
        System.out.println( "Job is " +publishedJob);
        if(publishedJob.contains("Published"))
            System.out.println("Job is Published");

        else
            System.out.println("Job will be published sooner");


        driver.close();
}}
