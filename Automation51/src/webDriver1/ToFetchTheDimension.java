package webDriver1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchTheDimension {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Dimension dim=driver.manage().window().getSize();
		int  height=dim.height;
		int width=dim.width;
		System.out.println(height);
		System.out.println(width);
	}

}
