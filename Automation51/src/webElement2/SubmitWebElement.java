package webElement2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonSubmit?sublist=3");
		Thread.sleep(3000);
		WebElement yesbutton=driver.findElement(By.id("sat1"));
		yesbutton.click();
		boolean yesbuttons=yesbutton.isSelected();
		if(yesbuttons) {
			WebElement submit=driver.findElement(By.id("btn40"));
			submit.click();
			System.out.println("fail:-click on submit button");
		}
		else {
			System.out.println("fail:-not click on submit button ");
		}
		
		
	}

}
