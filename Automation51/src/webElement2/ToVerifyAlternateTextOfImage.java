package webElement2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAlternateTextOfImage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/mobiles/apple~brand/pr?sid=tyy,4io");
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/image/312/312/xif0q/mobile/3/5/l/-original-imaghx9qmgqsk9s4.jpeg?q=70']"));
		String alttextimg=search.getAttribute("alt");
		System.out.println(alttextimg);
		

	}

}
