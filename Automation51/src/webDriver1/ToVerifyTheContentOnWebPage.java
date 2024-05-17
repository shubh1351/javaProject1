package webDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheContentOnWebPage {

	public static void main(String[] args) throws InterruptedException {
		String exceptedurl="Whether you are a beginner or a pro gamer, the Dell S2422HG Gaming Monitor lets you enjoy an engrossing gaming experience";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/dell-s-series-24-inch-curved-full-hd-led-backlit-va-panel-gaming-monitor-s2422hg/p/itmd86ea80044854?pid=MONG4A9RYNYEGWZN&lid=LSTMONG4A9RYNYEGWZNTXUNO2&marketplace=FLIPKART");
		Thread.sleep(3000);
		String actualcontent=driver.getPageSource();
		System.out.println(actualcontent);
		if(actualcontent.contains(exceptedurl)) {
			System.err.println("Pass:the content is verifed");
			
		}
		else {
			System.err.println("Fail:the content is not verifed");
		}
	}

}
