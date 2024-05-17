package webDriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseTheChildBrower {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(3000);
		driver.findElement(By.id("browserButton2")).click();
		Thread.sleep(3000);
		Set<String> allwindowids=driver.getWindowHandles();
		for(String id:allwindowids) {
			driver.switchTo().window(id);
			String currenturl=driver.getCurrentUrl();
			System.out.println(currenturl);
			if(currenturl.equals("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3")) {
				driver.close();
			}
			break;
			
		}
	}

}
