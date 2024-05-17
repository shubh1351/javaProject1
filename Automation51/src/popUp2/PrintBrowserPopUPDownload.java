package popUp2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintBrowserPopUPDownload {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/print?sublist=0");
		driver.findElement(By.xpath("//button[text()='Print this out!']")).click();
		Thread.sleep(2000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Runtime.getRuntime().exec("C:\\Users\\shubh\\OneDrive\\Desktop\\AllData\\Autoitfiles\\ert.exe");
	}

}
