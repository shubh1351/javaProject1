package popUp2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUps {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		String parentid=driver.getWindowHandle();
		driver.findElement(By.id("browserButton2")).click();
		Set<String> allids=driver.getWindowHandles();
		for(String id:allids) {
			driver.switchTo().window(id);
			String currenturl=driver.getCurrentUrl();
			if(currenturl.equals("https://demoapps.qspiders.com/ui/browser/Login")) {
				Thread.sleep(3000);
				driver.findElement(By.id("username")).sendKeys("Demokarle@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.id("password")).sendKeys("Demokarle1");
				Thread.sleep(3000);
				
				System.out.println(currenturl);
				break;
			}
		
			
			
		}
		Thread.sleep(3000);
		driver.switchTo().window(parentid);
		String parenturl=driver.getCurrentUrl();
		System.out.println(parenturl);
		

	}

}
