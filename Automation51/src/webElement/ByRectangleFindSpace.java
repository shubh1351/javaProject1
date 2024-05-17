package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByRectangleFindSpace {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(3000);
		WebElement yesbutton=driver.findElement(By.id("btn"));
		WebElement nobutton=driver.findElement(By.id("btn1"));
		Rectangle yesbuttonrect=yesbutton.getRect();
		Rectangle nobuttonrect=nobutton.getRect();
		int a=yesbuttonrect.getX();
		int b=yesbuttonrect.getWidth();
		int c=nobuttonrect.getX();
		int d=a+b;
		int space=c-d;
		System.out.println(space);
		

	}

}
