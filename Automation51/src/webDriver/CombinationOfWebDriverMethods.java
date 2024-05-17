package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CombinationOfWebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(3000);
		WebElement button=driver.findElement(By.id("browserButton2"));
		button.click();
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.close();
		
		
		

	}

}
