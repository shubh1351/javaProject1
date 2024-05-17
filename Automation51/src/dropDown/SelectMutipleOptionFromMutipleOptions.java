package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMutipleOptionFromMutipleOptions {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
			Thread.sleep(3000);
			WebElement condrop=driver.findElement(By.id("select-multiple-native"));
			Select selcon=new Select(condrop);
			boolean mutiple=selcon.isMultiple();
			if(mutiple) {	
			selcon.selectByIndex(0);
			Thread.sleep(3000);
			selcon.selectByValue("India");
			Thread.sleep(3000);
			selcon.selectByVisibleText("China");
			Thread.sleep(3000);
			
			}
			else
			{
				System.out.println("it is not MutipleDropDown");
			}

	}

}
