package webDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToCloseCurrentWindowTab {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(3000);
		driver.findElement(By.id("browserButton2")).click();
		Thread.sleep(3000);
		String windowid1=driver.getWindowHandle();
		System.out.println(windowid1);
		driver.close();
		Thread.sleep(3000);
		// TODO Auto-generated method stub

	}

}
