package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetNonSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(3000);
		WebElement condrop=driver.findElement(By.id("select-multiple-native"));
		Select selcon=new Select(condrop);
		selcon.selectByIndex(1);
		selcon.selectByIndex(5);
		selcon.selectByIndex(3);
		List<WebElement> alloptions=selcon.getOptions();
		List<WebElement> allselected=selcon.getAllSelectedOptions();
		
	}

}
