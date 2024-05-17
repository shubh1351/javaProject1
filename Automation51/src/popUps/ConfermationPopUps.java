package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfermationPopUps {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		driver.findElement(By.id("buttonAlert5")).click();
		Thread.sleep(3000);
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		

	}

}
