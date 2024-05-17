package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		WebElement google=driver.findElement(By.name("q"));
		String googletagname=google.getTagName();
		if(googletagname.equals("textarea")) {
			google.sendKeys("Automation Wizard");
			google.sendKeys(Keys.ENTER);
			System.out.println("The TagName is correct");
			
		}
		else {
			System.out.println("The Tagname is incorrect");
		}
			

	}

}
