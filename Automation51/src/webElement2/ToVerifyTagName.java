package webElement2;

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
		WebElement search=driver.findElement(By.name("q"));
		String searchtag=search.getTagName();
		if(searchtag.equals("textarea")) {
			search.sendKeys("Automation");
			search.sendKeys(Keys.ENTER);
			System.out.println("Pass:tagname is correct");
		}
		else {
			System.out.println("Fail:Tagname is not correct");
		}
			
		
		
		

	}

}
