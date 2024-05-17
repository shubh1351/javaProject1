package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheDimensionOfTwoButton2{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(3000);
		WebElement yesbutton=driver.findElement(By.id("btn"));
		WebElement nobutton=driver.findElement(By.id("btn1"));
		Dimension yesdim=yesbutton.getSize();
		Dimension nodim=yesbutton.getSize();
		int yesheight=yesdim.getHeight();
		int yeswidth=yesdim.getWidth();
		int noheight=nodim.getHeight();
		int nowidth=nodim.getWidth();
		System.out.println(yesheight);
		System.out.println(yeswidth);
		System.out.println(noheight);
		System.out.println(nowidth);
		if(yesheight == noheight && yeswidth == nowidth) {
			System.out.println("Pass:the buton are in equal size");
			
		}
		else {
			System.out.println("Pass:the buton are not in equal size");
		}
		
		
		
		
		

	}

}
