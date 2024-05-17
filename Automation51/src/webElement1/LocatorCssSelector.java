package webElement1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		WebElement name=driver.findElement(By.cssSelector("h1[class='text-[18px] font-bold leading-tight tracking-tight text-[rgb(242,87,53)]']"));
		String text=name.getText();
		System.out.println(text);
		
	}

}
