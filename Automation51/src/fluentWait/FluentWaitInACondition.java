package fluentWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class FluentWaitInACondition {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");
		WebElement startbutton=driver.findElement(By.xpath("//button[text()='Start']"));
		WebElement resetbutton=driver.findElement(By.xpath("//button[text()='Reset']"));
		FluentWait wait = new FluentWait(driver);
		Wait.withTimeouts(Duration.ofSeconds(20));
		Wait.pollingEvery(Duration.ofSeconds(5));
		Wait.until(ExpectedCondtions.)
		
		
		
		
	}

}
