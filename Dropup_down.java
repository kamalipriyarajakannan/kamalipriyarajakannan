import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropup_down {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\workspace\\Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		
		WebElement Firstname = driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Kamali");
		
		WebElement Lastname = driver.findElement(By.name("lastname"));
		Lastname.sendKeys("Priya");
		
		WebElement Email = driver.findElement(By.name("reg_email__"));
		Email.sendKeys("kamali@gmail.com");
		
		
		WebElement Confirmpswd = driver.findElement(By.xpath("//input[@type='password']"));
		Confirmpswd.sendKeys("Temple@123");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Day.click();
		Select s = new Select(Day);
		s.selectByVisibleText("27");
		
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Month.click();
		Select a = new Select(Month);
		a.selectByVisibleText("Dec");
		
		WebElement Year = driver.findElement(By.name("birthday_year"));
		Year.click();
		Select b = new Select(Year);
		b.selectByVisibleText("1997");
		
		WebElement Radiobutton = driver.findElement(By.xpath("//label[text()='Female']"));
		Radiobutton.click();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2000)");
		
		WebElement Signup = driver.findElement(By.xpath("//button[@type='submit']"));
		Signup.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
	}

}
