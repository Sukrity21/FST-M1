package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Activity6 {
    public void applyJob() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        driver.findElement(By.xpath("//div[@class='main-navigation']//li[1]")).click();
        driver.findElement(By.id("search_keywords")).sendKeys("Banking");
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
        String email=  driver.findElement(By.xpath("//a[@class='job_application_email']")).getText();
        System.out.println(email);

    }
}