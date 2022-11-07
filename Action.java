import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\workspace\\Demo\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.ajio.com/");
		driver.get("https://demoqa.com/droppable");
		
		
		driver.manage().window().maximize();
		
		Actions aa = new Actions(driver);
		
//		WebElement findElement = driver.findElement(By.xpath("//a[text() ='WOMEN']"));
		
//		aa.click(findElement).build().perform();
//		aa.contextClick(findElement).build().perform();

//		aa.doubleClick(findElement).build().perform();
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
	
//		aa.clickAndHold(source).moveToElement(source).release(destination).build().perform();
		
		aa.dragAndDrop(source, destination).build().perform();

		
					
		
	}
}
