package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyRadioButtonIsSelectedOrNot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		Thread.sleep(3000);
		WebElement radioupi=driver.findElement(By.id("attended"));
		radioupi.click();
		boolean upiradiobutton=radioupi.isSelected();
		if(upiradiobutton) {
			System.out.println("Pass:radio button is selected");
		}
		else {
			System.out.println("Fail:radio button is not selected");
			
		}
		
		

	}

}
