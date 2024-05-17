package actionAll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GiveRatingByUsingMouseHovering {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/rating?sublist=2");
		WebElement firststar=driver.findElement(By.xpath("(//*[name()='svg'])"));
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(firststar, 80, 0).perform();
		

	}

}
