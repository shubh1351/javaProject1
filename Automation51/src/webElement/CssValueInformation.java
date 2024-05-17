package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValueInformation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(3000);
		WebElement yesbutton=driver.findElement(By.id("btn"));
		String yesbuttoncolorbfr=yesbutton.getCssValue("background-color");
		System.out.println(yesbuttoncolorbfr);
		yesbutton.click();
		String yesbuttoncoloraftr=yesbutton.getCssValue("background-color");
		System.out.println(yesbuttoncoloraftr);
		if(!(yesbuttoncolorbfr.equals(yesbuttoncoloraftr))) {
			System.out.println("pass:the color is change after clicking");
		}
		else {
			System.out.println("Fail:the color is not change after clicking");
		}
		
		

	}

}
