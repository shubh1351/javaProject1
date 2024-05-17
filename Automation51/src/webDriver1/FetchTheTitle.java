package webDriver1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class FetchTheTitle {

	public static void main(String[] args) throws InterruptedException {
		String exceptedurl="Google";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(3000);
		String currenturl=driver.getTitle();
		if(currenturl.equals(exceptedurl)) {
			System.out.println("PASS:Title is verifed");
		}
		else {
			System.out.println("FAIL:Title is not Verifed");
		}
	}

}
