package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearTheTextField {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shubh/OneDrive/Desktop/thukrakemerapyar.html");
		Thread.sleep(3000);
		WebElement name=driver.findElement(By.xpath("(//input)[1]"));
		WebElement email=driver.findElement(By.xpath("(//input)[2]"));
		WebElement password=driver.findElement(By.xpath("(//input)[3]"));
		name.sendKeys("rammilan");
		Thread.sleep(3000);
		email.sendKeys("rammilan@gmail.com");
		Thread.sleep(3000);
		password.sendKeys("rammilan");
		Thread.sleep(3000);

	}

}
