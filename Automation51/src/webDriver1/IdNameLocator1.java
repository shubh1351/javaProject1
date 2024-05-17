package webDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdNameLocator1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shubh/OneDrive/Desktop/thukrakemerapyar.html");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//input[@type='name']"));
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		username.sendKeys("rammilan");
		Thread.sleep(3000);
		password.sendKeys("reels");
		Thread.sleep(3000);
		checkbox.click();
		Thread.sleep(3000);
		WebElement textfield=driver.findElement(By.tagName("a"));
		Thread.sleep(3000);
		textfield.click();
		
		
	}

}
