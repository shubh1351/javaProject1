package webDriver2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		 Navigation nav=driver.navigate();
		nav.to("https://www.instagram.com/?hl=en");
		Thread.sleep(3000);
		nav.to("https://www.facebook.com/");
		Thread.sleep(3000);
		nav.back();
		Thread.sleep(3000);
		nav.refresh();
		Thread.sleep(3000);
		nav.forward();
		driver.quit();
		// TODO Auto-generated method stub

	}

}
