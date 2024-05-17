package webDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
public class ToFetchAllWindowId {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//fetech the url
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		//delay
		Thread.sleep(3000);
		//button
		driver.findElement(By.id("browserButton2")).click();
		//parent id
		String parentwindow=driver.getWindowHandle();
		//print window id 
		System.out.println("parent window Id"+parentwindow);
		//all ids
		Set<String> allIds=driver.getWindowHandles();
		//print all ids
		System.out.println("========================================================");
		System.out.println(allIds);
		
		// TODO Auto-generated method stub

	}

}
