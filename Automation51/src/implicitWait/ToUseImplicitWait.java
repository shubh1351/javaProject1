package implicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseImplicitWait {

	public static void main(String[] args) {
		//browser is launched
		WebDriver driver=new ChromeDriver();
		//maximize the window size
		driver.manage().window().maximize();
		//intelligent wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("shubhmaurya1351@gmail.com");
		

	}

}
