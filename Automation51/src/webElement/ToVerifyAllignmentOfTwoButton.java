package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignmentOfTwoButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(3000);
		WebElement yesbutton=driver.findElement(By.id("btn"));
		WebElement nobutton=driver.findElement(By.id("btn1"));
		Point yespos=yesbutton.getLocation();
		Point nopos=nobutton.getLocation();
		int yesbuttony=yespos.getY();
		int yesbuttonx=yespos.getX();
		int nobuttony=nopos.getY();
		int nobuttonx=nopos.getX();
		System.out.println(yesbuttonx);
		System.out.println(yesbuttony);
		System.out.println(nobuttonx);
		System.out.println(nobuttony);
		WebElement yesbutton2=driver.findElement(By.id("btn2"));
		WebElement nobutton3=driver.findElement(By.id("btn3"));
		Point yespos2=yesbutton2.getLocation();
		Point nopos3=nobutton3.getLocation();
		int yesbuttony2=yespos2.getY();
		int yesbuttonx2=yespos2.getX();
		int nobuttony3=nopos3.getY();
		int nobuttonx3=nopos3.getX();
		System.out.println(yesbuttonx2);
		System.out.println(yesbuttony2);
		System.out.println(nobuttonx3);
		System.out.println(nobuttony3);
		
		
		
		

	}

}
