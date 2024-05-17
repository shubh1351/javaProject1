package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheFrameByUsingNameAttribute {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/shubh/OneDrive/Desktop/AllData/tootahua.html");
		driver.switchTo().frame("qspider");
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();

	}

}
