package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Activity1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net");
        driver.manage().window().maximize();
        driver.close();


    }
}