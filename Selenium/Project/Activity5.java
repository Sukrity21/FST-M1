package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Activity5 {

    public void NavigateToJobsLink() {

        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        driver.findElement(By.xpath("//div[@class='main-navigation']//li[1]")).click();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Jobs – Alchemy Jobs");
        driver.close();
    }
}
