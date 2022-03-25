import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que_4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek Kumar\\Downloads\\Drivers_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement we=driver.findElement(By.id("autocomplete"));

		we.sendKeys("ind");
		Thread.sleep(1000);
		
		we.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		
		we.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		we.sendKeys(Keys.ENTER);


	}
}
