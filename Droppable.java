import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Droppable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\workspace\\Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		
		WebElement fromDrag = driver.findElement(By.id("draggable"));
		WebElement toDrop = driver.findElement(By.id("droppable"));
		
		Actions aa = new Actions(driver);
		
		aa.clickAndHold(fromDrag).moveToElement(fromDrag).release(toDrop).build().perform();
		
//		aa.dragAndDrop(fromDrag, toDrop).perform();
		
		driver.close();
		
	}

}
