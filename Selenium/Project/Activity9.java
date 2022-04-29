package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Activity9 {
    public void createJobListingUsingBackend() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.name("pwd")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        driver.findElement(By.xpath("//div[@class='wp-menu-name' and text()='Job Listings ']")).click();
        driver.findElement(By.xpath("//a[@class='page-title-action']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("post-title-0")).sendKeys("Automation testing");
        driver.findElement(By.id("_company_twitter")).sendKeys("wipro");
        driver.findElement(By.xpath("//input[@id='_job_location']")).sendKeys("Bangalore");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='components-button editor-post-publish-button editor-post-publish-button__button is-primary']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='View Job']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='ast-single-post-order']/h1")).getText());








    }
}
