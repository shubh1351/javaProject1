package popUp2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAllTypePopUps {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(2000);
		//This is alert Pop up with ok button and not inspectale we Have to use alert interface
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert5")).click();
		Thread.sleep(2000);
		String textcon=driver.switchTo().alert().getText();
		System.out.println(textcon);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("yes");
		String textprmp=driver.switchTo().alert().getText();
		System.out.println(textprmp);
		driver.switchTo().alert().dismiss();

	}

}
