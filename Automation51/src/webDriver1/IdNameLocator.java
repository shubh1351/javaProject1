package webDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		WebElement name=driver.findElement(By.id("name"));
		WebElement email=driver.findElement(By.name("email"));
		WebElement password=driver.findElement(By.name("password"));
		name.sendKeys("rammilan");
		Thread.sleep(3000);
		email.sendKeys("rammilan@gmail.com");
		Thread.sleep(3000);
		password.sendKeys("reels");
		Thread.sleep(3000);
		driver.quit();
		
	}

}
