
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/lizabogatyrev/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.se");
        WebElement agree = driver.findElement(By.id("L2AGLb"));
        agree.click();
        driver.findElement(By.name("q")).sendKeys("Software testing");
        WebElement search = driver.findElement(By.name("btnK"));
        search.click();
        
        
        

        


    }
}
