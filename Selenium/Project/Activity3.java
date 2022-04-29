package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Activity3 {

    public void pictureURL(){
        System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        driver.findElement(By.xpath("//div[@class='post-thumb-img-content post-thumb']/img")).getAttribute("src");
        System.out.println(driver.findElement(By.xpath("//div[@class='post-thumb-img-content post-thumb']/img")).getAttribute("src"));
        driver.close();
    }


}
