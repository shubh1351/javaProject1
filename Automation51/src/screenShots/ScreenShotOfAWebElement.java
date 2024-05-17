package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfAWebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		WebElement img=driver.findElement(By.xpath("//img[@alt='Google']"));
		File source=img.getScreenshotAs(OutputType.FILE);
		File target=new File("D:\\Eclipse Programs\\Automation51\\ScreenShot\\googleimg.png");
		FileHandler.copy(source, target);
		

	}

}
