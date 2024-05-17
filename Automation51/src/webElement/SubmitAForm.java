package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitAForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonSubmit?sublist=3");
		Thread.sleep(3000);
		WebElement yesbutton=driver.findElement(By.id("sat1"));
		WebElement submitbutton=driver.findElement(By.id("sat1"));
		yesbutton.click();
		Thread.sleep(3000);
		submitbutton.submit();
		

	}

}
