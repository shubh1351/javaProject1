package webDriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchAllTheWindowId {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(3333);
		driver.findElement(By.id("browserButton2")).click();
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> allwindowsids=driver.getWindowHandles();
		System.out.println(allwindowsids);
		driver.quit();

	}

}
