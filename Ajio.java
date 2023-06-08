package week3day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    driver.get("https://www.ajio.com/");
    driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
    driver.findElement(By.xpath("//div[@class='facet-linkhead']/label[contains(text(),'Men')]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
   // Thread.sleep(2000);
    String count = driver.findElement(By.xpath("//div[@class='length']")).getText();
    System.out.println("The number of bags are "+ count);
    
    List<WebElement> find = driver.findElements(By.xpath("//div[@class='items']"));
    
    int size = find.size();
    System.out.println(size);
    
    for(int i =0;i<size;i++)
    {
    String bag = find.get(i).getText();
    System.out.println(bag);
    }
    }
    
    

	}


