//WASTV to fetech the window id.
package webDriver2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FetchTheWindowId {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String windowid=driver.getWindowHandle();
		System.out.println(windowid);
		
		
		// TODO Auto-generated method stub

	}

}
