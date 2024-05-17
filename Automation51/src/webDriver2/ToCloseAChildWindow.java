package webDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
public class ToCloseAChildWindow {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(3000);
		driver.findElement(By.id("browserButton2")).click();
		Set<String> allwindowids=driver.getWindowHandles();
		for(String id:allwindowids)
		{
			driver.switchTo().window(id);
			String currenturl=driver.getCurrentUrl();
			if(currenturl.equals("https://demoapps.qspiders.com/ui/browser/SignUp"))
			{
				Thread.sleep(4000);
				driver.close();
				break;
			}
		}
		// TODO Auto-generated method stub

	}

}
