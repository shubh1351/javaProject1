package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledOrNot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.id("email"));
		WebElement continuebutton=driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		email.sendKeys("shubhmaurya73536@gmail.com");
		Thread.sleep(3000);
		continuebutton.click();

	}

}
