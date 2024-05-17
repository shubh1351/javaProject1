package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignmentOfTwoButton2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(3000);
		WebElement yesbutton=driver.findElement(By.id("btn"));
		WebElement nobutton=driver.findElement(By.id("btn1"));
		Point yesbuttonpos=yesbutton.getLocation();
		Point nobuttonpos=yesbutton.getLocation();
		int yesbuttony=yesbuttonpos.getY();
		int nobuttony=nobuttonpos.getY();
		System.out.println(yesbuttony);
		System.out.println(nobuttony);
		if(yesbuttony == nobuttony) {
			System.out.println("Pass:button are allined");
		}
		else {
		System.out.println("Fail:button are not allined");
		}
		
		

	}

}
