package webElement1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTagname {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shubh/OneDrive/Desktop/thukrakemerapyar.html");
		Thread.sleep(3000);
		WebElement link=driver.findElement(By.tagName("a"));
		link.click();
		Thread.sleep(3000);
		driver.quit();

	}

}
