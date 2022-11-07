import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\workspace\\Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot a = (TakesScreenshot) driver;
		File screenshotAs = a.getScreenshotAs(OutputType.FILE);
		File dest = new File ("C:\\Users\\DELL\\workspace\\Demo\\ScreenShot\\kamali.png");
		
		
	
		
		
		
	}

}
