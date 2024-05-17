package webDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class MaximizeTheBrowser {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Navigation nav=driver.navigate();
		nav.to("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(3000);
		driver.findElement(By.id("browserButton2")).click();
		Thread.sleep(3000);
		nav.refresh();
		Thread.sleep(3000);
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3333);
		driver.quit();
		// TODO Auto-generated method stub

	}

}
