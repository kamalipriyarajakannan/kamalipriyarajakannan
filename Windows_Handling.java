import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Windows_Handling {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\workspace\\Demo\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		// Opening 1st child window
		
		WebElement findElement = driver.findElement(By.xpath("//a[text() = 'Best Sellers']"));
		a.contextClick(findElement).build().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		// Opening 2nd child window
		
		WebElement findElement2 = driver.findElement(By.xpath("//a[text() = ' Electronics ']"));
		a.contextClick(findElement2).build().perform();
		
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		// Opening 3rd child window
		
		WebElement findElement3 = driver.findElement(By.xpath("//a [ text() = 'Customer Service']"));
		a.contextClick(findElement3).build().perform();
		
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		// Opening 4th child window
		
		WebElement findElement4 = driver.findElement(By.xpath("//a[text() = 'Books']"));
		a.contextClick(findElement4).build().perform();
		
		
		// Size of window
		// Parent window ID
		//Title of the window
		
		
		
		// Parent window ID
		String windowHandle = driver.getWindowHandle();
		System.out.println("The id of the parent window is " + windowHandle);
		
		// Size of window
		int size = driver.getWindowHandles().size();
		System.out.println("the size of all the windows is " + size);
		
		// Title of the window
		Set<String> allwindows = driver.getWindowHandles();
		for (String string : allwindows) {
			String title = driver.switchTo().window(windowHandle).getTitle();
			System.out.println("The title of the window are" + title);
			}
			
		}
		
		
		
		
		
		
	}


