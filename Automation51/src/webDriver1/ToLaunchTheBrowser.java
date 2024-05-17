package webDriver1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		//to Launch the browser
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.close();
	}

}
