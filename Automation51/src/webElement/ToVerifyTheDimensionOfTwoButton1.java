package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheDimensionOfTwoButton1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(3000);
		WebElement yesbutton=driver.findElement(By.id("btn"));
		WebElement nobutton=driver.findElement(By.id("btn1"));
		Dimension yesdim=yesbutton.getSize();
		Dimension nodim=nobutton.getSize();
		int yesbuttonheight=yesdim.getHeight();
		int yesbuttonwidth=yesdim.getWidth();
		int nobuttonheight=nodim.getHeight();
		int nobuttonwidth=nodim.getWidth();
		if(yesbuttonheight == nobuttonheight && yesbuttonwidth == nobuttonwidth ) {
			System.out.println("pass:the button are verified");
		}
		else {
			System.out.println("Fail:the button are not verified");
		}

	}

}
