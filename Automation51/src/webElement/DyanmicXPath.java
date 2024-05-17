package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanmicXPath {

	public static void main(String[] args) throws InterruptedException {
		String productname="Apple iPhone 15 (Blue, 128 GB)";
		String productprice="66,999";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone+15&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_HistoryAutoSuggest_2_6_na_na_na&otracker1=AS_QueryStore_HistoryAutoSuggest_2_6_na_na_na&as-pos=2&as-type=HISTORY&suggestionId=iphone+15%7CMobiles&requestId=872348ca-1ba1-47cb-b53f-ce462469ae9f");
		Thread.sleep(3000);
		WebElement iphoneprice=driver.findElement(By.xpath("//div[text()='"+productname+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹"+productprice+"']"));
		String price=iphoneprice.getText();
		System.out.println(price);
		
		
		
		
	}

}
