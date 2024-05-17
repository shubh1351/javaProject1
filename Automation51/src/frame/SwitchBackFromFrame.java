package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBackFromFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.switchTo().parentFrame();
		String outerframetext=driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		System.out.println(outerframetext);
		

	}

}
