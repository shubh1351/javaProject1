package popUps1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUps {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		String parentid=driver.getWindowHandle();
		driver.findElement(By.id("browserButton2")).click();
		Set<String> allids=driver.getWindowHandles();
		for(String ids:allids) {
			driver.switchTo().window(ids);
			String currenturl=driver.getCurrentUrl();
			if(currenturl.equals("https://demoapps.qspiders.com/ui/browser/Login")) {
				driver.findElement(By.id("username")).sendKeys("rose");
				driver.findElement(By.id("password")).sendKeys("tumho");
				driver.findElement(By.xpath("//button[text()='Login']")).click();
				break;
			}
			
		}
		String urlrightnow=driver.getCurrentUrl();
		System.out.println(urlrightnow);
		driver.switchTo().window(parentid);
		String parenturl=driver.getCurrentUrl();
		System.out.println(parenturl);
		
	}

}
