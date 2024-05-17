package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheFrameByUsingWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		WebElement loginframe=driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(loginframe);
		driver.findElement(By.id("username")).sendKeys("youandme");
		driver.findElement(By.id("password")).sendKeys("1234qwe");
		Thread.sleep(3000);
		driver.findElement(By.id("submitButton")).click();
		

	}
}
