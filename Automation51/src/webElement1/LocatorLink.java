package webElement1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
		Thread.sleep(3000);
		WebElement link=driver.findElement(By.linkText("Return Policy"));
		link.click();
		Thread.sleep(3000);
		String actualurl=driver.getCurrentUrl();
		if(actualurl.contains("policy")) {
			System.out.println("Pass:the user is in right page");
		}
		else
		{
			System.out.println("Fail:the user is not in right page");
		}

	}

}
