package webDriver2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPath {
	public static void main(String[] args) throws InterruptedException {
		String productname="Google Pixel 8 (Rose, 128 GB)";
		String productprice="75,999";

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone+14&as=on&as-show=on&otracker=AS_Query_PredictiveAutoSuggest_2_0_na_na_na&otracker1=AS_Query_PredictiveAutoSuggest_2_0_na_na_na&as-pos=2&as-type=PREDICTIVE&suggestionId=iphone+14&requestId=640d421a-81c1-463d-a90f-a18f04a9cc2e&as-searchtext=iphone%2014");
		Thread.sleep(3000);
		WebElement pixelprice=driver.findElement(By.xpath("//div[text()='"+productname+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹"+productprice+"']"));
		String price=pixelprice.getText();
		System.out.println(price);
		
		
		
		
	}

}
