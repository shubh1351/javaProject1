package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyButtonAreNotOverlapping {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shubh/OneDrive/Desktop/thukrakemerapyar.html");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("(//input)[1]"));
		WebElement password=driver.findElement(By.xpath("(//input)[2]"));
		Rectangle usernamerect=username.getRect();
		Rectangle passwordrect=password.getRect();
		int a1=usernamerect.getY();
		int a2=usernamerect.getHeight();
		int a=a1+a2;
		int b=passwordrect.getY();
		if(b>=a) {
			System.out.println("Pass:textfiled are not overlapping");
		}
		else {
			System.out.println("Fail:textfiled are  overlapping");
			
		}
		
		
	}

}
