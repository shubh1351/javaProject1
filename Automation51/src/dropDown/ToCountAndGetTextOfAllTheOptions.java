package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToCountAndGetTextOfAllTheOptions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement yeardrop=driver.findElement(By.id("year"));
		
		Select selyear=new Select(yeardrop);
		
		List<WebElement> allyearoptions=selyear.getOptions();
		int noofoptions=allyearoptions.size();
		System.out.println(noofoptions);
		for(WebElement alltext:allyearoptions) {
			String alltextdrop=alltext.getText();
			System.out.print( alltextdrop+" ");
		}
		

	}

}
