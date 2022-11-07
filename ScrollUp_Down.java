import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\workspace\\Demo\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor a = (JavascriptExecutor) driver;          // Performing Narrowing Type Casting
		
		a.executeScript("window.scroll (0, 3000)");
		Thread.sleep(3000);
		
	
		 a.executeScript("window.scroll(0,-1000)"); 
		 Thread.sleep(3000);
		
		
		WebElement findElement = driver.findElement(By.xpath("//span [contains (text(), 'Steal deals on beauty')]"));

		a.executeScript("arguments[0].scrollIntoView();",findElement);
		 
		
		
			}
}
