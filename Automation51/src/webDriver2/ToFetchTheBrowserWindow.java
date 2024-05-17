package webDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToFetchTheBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Navigation nav=driver.navigate();
		Thread.sleep(3000);
		nav.to("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(3000);
		driver.findElement(By.id("browserButton2")).click();
		String currenturl=driver.getCurrentUrl();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		 Dimension dem=driver.manage().window().getSize();
		 int height=dem.getHeight();
		 int width=dem.getWidth();
		 System.out.println("height of window is: "+height);
		 System.out.println("width of window is: "+width);
		 System.out.println("The current url is: "+currenturl);
		 Thread.sleep(3000);
		 driver.quit();
		// TODO Auto-generated method stub

	}

}

