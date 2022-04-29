package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Activity7 {
    public void creatNewJobLiksting() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        driver.findElement(By.xpath("//div[@class='main-navigation']//li[3]")).click();
        driver.findElement(By.xpath("//div[@class='field account-sign-in']/a")).click();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.name("pwd")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        driver.findElement(By.id("job_title")).sendKeys("Testing Job");
        driver.switchTo().frame("job_description_ifr");
        driver.findElement(By.id("tinymce")).sendKeys("This is test Job");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@value='Preview']")).click();
        driver.findElement(By.xpath("//input[@value='Submit Listing']")).click();
        driver.findElement(By.xpath("//div[@class='main-navigation']//li[1]")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//div[@class='position']/h3[text()='Testing Job']")).getText());
        driver.close();
    }
}
