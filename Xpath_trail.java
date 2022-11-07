import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_trail {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\workspace\\Demo\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("//input[@name ='username']");
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//input[@name ='username']"));
		a.sendKeys("Riya");
		
		driver.close();
	}

}
