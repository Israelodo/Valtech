import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Valatech {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Livingstone\\Desktop\\Biz\\Testing\\SELEQUI\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	
		driver.get("https://www.valtech.com/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1250)", "");
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='container']/div[2]/div[3]/div[1]/header/h2")).isDisplayed());
		Thread.sleep(2000);
		
		
		js.executeScript("window.scrollBy(1250,0)", "");
		
		driver.findElement(By.xpath("//*[@id='navigationMenuWrapper']/div/ul/li[1]/a/span")).click();
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
