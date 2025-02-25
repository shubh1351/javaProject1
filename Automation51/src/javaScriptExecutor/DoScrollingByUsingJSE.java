package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoScrollingByUsingJSE {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		WebElement top=driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		WebElement bottom=driver.findElement(By.xpath("//img[@alt='Avo Automation']"));
		JavascriptExecutor js=(JavascriptExecutor )driver;
		js.executeScript("arguments[0].scrollIntoView(true)", top);
		Thread.sleep(4000);
		js.executeScript("arguments[0].scrollIntoView(false)", bottom);
		

	}

}
