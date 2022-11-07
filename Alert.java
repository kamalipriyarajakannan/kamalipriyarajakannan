import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Alert {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\workspace\\Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://WWW.google.co.in/");
		driver.manage().window().maximize();

		Robot rb = new Robot();
		
		WebElement findElement = driver.findElement(By.xpath("//input[@title='Search']"));
		findElement.sendKeys("Dhoni images");
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(4000);
		
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(4000);
		
		rb.keyPress(KeyEvent.VK_PAGE_UP);
		rb.keyRelease(KeyEvent.VK_PAGE_UP);
		
		WebElement findElement2 = driver.findElement(By.xpath("//h3[contains(text(),'MS Dhoni ODI photos and editorial')]"));
		findElement2.click();
		Thread.sleep(4000);
		driver.navigate().back();
	//	driver.navigate().forward();
		
	//	Thread.sleep(4000);
	//	driver.switchTo().alert().dismiss();
		
	
		
		
		
		
		
	}

}
