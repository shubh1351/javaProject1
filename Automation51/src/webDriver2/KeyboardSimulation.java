package webDriver2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardSimulation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		WebElement name=driver.findElement(By.id("name"));
		WebElement email=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("password"));
		name.sendKeys("rammilan");
		Thread.sleep(3000);
		email.sendKeys("rammilan@gamil.com");
		Thread.sleep(3000);
		email.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(3000);
		email.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(3000);
		password.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(3000);
		password.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.xpath("//h1[text()='Login']"));
		String logintext=login.getText();
		System.out.println(logintext);
		
		

	}

}
