package webDriver1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheUrl {

	public static void main(String[] args) throws InterruptedException {
		String exceptedurl="multipleTabs";
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(3000);
		String actualurl=driver.getCurrentUrl();
		if(actualurl.contains(exceptedurl)) {
			System.out.println("PASS:Url is verifed");
		}
		else {
			System.out.println("FAIL:Url is not verifed");
		}
		
		
	}

}
