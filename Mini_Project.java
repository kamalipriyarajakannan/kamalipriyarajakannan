import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.JScrollBar;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.openqa.selenium.support.ui.Select;


public class Mini_Project {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\workspace\\Demo\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://WWW.google.co.in/");
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("kamalipriya");
		
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("Temple@123");
		
		WebElement login  = driver.findElement(By.id("login"));
		login.click();
		
		WebElement Location = driver.findElement(By.id("location"));
		Location.click();
		
		Select l = new Select(Location);
		l.selectByVisibleText("London");
		
		WebElement Hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Hotels.click();
		
		Select h = new Select (Hotels);
		h.selectByVisibleText("Hotel Hervey");
		
		WebElement Room_type = driver.findElement(By.xpath("//select[@name='room_type']"));
		Room_type.click();
		
		Select rt = new Select (Room_type);	
		rt.selectByVisibleText("Super Deluxe");
		
		WebElement Room_nos = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Room_nos.click();
		
		Select rn = new Select (Room_nos);
		rn.selectByVisibleText("7 - Seven");
		
		WebElement Check_inDate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		Check_inDate.click();
	
		
		WebElement Checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		Checkout.click();
		
		
		WebElement AdultRoom = driver.findElement(By.id("adult_room"));
		AdultRoom.click();
		
		Select ar = new Select (AdultRoom);
		ar.selectByVisibleText("4 - Four");
		
		WebElement ChildrenRoom = driver.findElement(By.xpath("//select[@name='child_room']"));
		ChildrenRoom.click();
		
		Select cr = new Select (ChildrenRoom);
		cr.selectByVisibleText("2 - Two");
		
		WebElement Search = driver.findElement(By.xpath("//input[@type='submit']"));
		Search.click();
		
		WebElement Radiobutton = driver.findElement(By.id("radiobutton_0"));
		Radiobutton.click();
		
		WebElement Continue = driver.findElement(By.xpath("//input[@name='continue']"));
		Continue.click();
		
		Thread.sleep(4000);
		
		WebElement First_name = driver.findElement(By.xpath("//input[@name='first_name']"));
		First_name.sendKeys("Kamali");
		
		JavascriptExecutor sd = (JavascriptExecutor) driver;
		sd.executeScript("window.scrollBy(0, 1000)");
		
		WebElement Last_name = driver.findElement(By.xpath("//input[@name='last_name']"));
		Last_name.sendKeys("Priya");
		
		WebElement Billing_Address = driver.findElement(By.id("address"));
		Billing_Address.sendKeys("Chennai");
		
		WebElement Credit_Cardno = driver.findElement(By.id("cc_num"));
		Credit_Cardno.sendKeys("8765432190754367");
		
		WebElement CreditCard_type = driver.findElement(By.xpath("//select[@name='cc_type']"));
		CreditCard_type.click();
		
		Select ct = new Select (CreditCard_type);
		ct.selectByVisibleText("VISA");
		
		WebElement Expire_Month = driver.findElement(By.id("cc_exp_month"));
		Expire_Month.click();
		
		Select em = new Select (Expire_Month);
		em.selectByVisibleText("December");
		
		WebElement Expire_Year = driver.findElement(By.id("cc_exp_year"));
		Expire_Year.click();
		
		Select ey = new Select (Expire_Year);
		ey.selectByVisibleText("2022");
		
		WebElement CVV_Number = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		CVV_Number.sendKeys("777");
		
		WebElement Book_Now = driver.findElement(By.xpath("//input[@name='book_now']"));
		Book_Now.click();
		
		Thread.sleep(4000);
		
		WebElement History = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
		History.click();
		
		WebElement lastbutton = driver.findElement(By.xpath("//input[@name='ids[]']"));
		lastbutton.click();
		
		WebElement Cancelbooking = driver.findElement(By.id("btn_id_760274"));
		Cancelbooking.click();
		
		Thread.sleep(4000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement Logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		Logout.click();
		
		
		
		
		
	}

}
