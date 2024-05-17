package webElement2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyCssInformation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonSubmit?sublist=3");
		Thread.sleep(3000);
		WebElement yesbutton=driver.findElement(By.id("sat1"));
		WebElement submit=driver.findElement(By.id("btn40"));
		yesbutton.click();
		String submitcs=submit.getCssValue("background-color");
		System.out.println(submitcs);
		Thread.sleep(3000);
		submit.click();
		String submitcss=submit.getCssValue("background-color");
		System.out.println(submitcss);
		if(submitcs.equals(submitcss)) {
			System.out.println("fail:color is not changing after clicking");
		}
		else {
			System.out.println("Pass:color is changing");
		}
		
		

	}

}
