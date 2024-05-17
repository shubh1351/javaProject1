package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToCountAllTheOptions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement daydrop=driver.findElement(By.id("day"));
		WebElement monthdrop=driver.findElement(By.id("month"));
		WebElement yeardrop=driver.findElement(By.id("year"));
		Select selday=new Select(daydrop);
		Select selmonth=new Select(monthdrop);
		Select selyear=new Select(yeardrop);
		selday.selectByIndex(16);
		selmonth.selectByValue("3");
		selyear.selectByVisibleText("1997");
		List<WebElement> allyearoptions=selyear.getOptions();
		int noofoptions=allyearoptions.size();
		System.out.println(noofoptions);
		
	}

}
