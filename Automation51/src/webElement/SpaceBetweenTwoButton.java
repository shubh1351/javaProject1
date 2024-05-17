package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpaceBetweenTwoButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(3000);
		WebElement yesbutton=driver.findElement(By.id("btn"));
		WebElement nobutton=driver.findElement(By.id("btn1"));
		Dimension yesbuttondim=yesbutton.getSize();
		int b=yesbuttondim.getWidth();
		Point yesbuttonpos=yesbutton.getLocation();
		Point nobuttonpos=nobutton.getLocation();
		int a=yesbuttonpos.getX();
		int d=nobuttonpos.getX();
		
		int c=a+b;
		int space=d-c;
		System.out.println(space);
		
		
		
		
		

	}

}
