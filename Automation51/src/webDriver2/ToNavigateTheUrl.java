//write a script to navigate to the url
package webDriver2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToNavigateTheUrl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new  ChromeDriver();
		//navigate the url
		Thread.sleep(2000);
		driver.get("https://www.google.co.in/");
		// TODO Auto-generated method stub

	}

}
