import java.awt.Window;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\workspace\\Demo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		
		WebElement findElement = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		findElement.click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	
		WebElement findElement2 = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		findElement2.click();
		Thread.sleep(5000);
		Alert alert2 = driver.switchTo().alert();
		alert.dismiss();
		
		WebElement findElement3 = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		findElement3.click();
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(5000);
		alert.sendKeys("Kamali");
		Thread.sleep(4000);
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();
		
		
		
		
	}

}
