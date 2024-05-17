package webDriver2;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToChangeTheBrowserWindow {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Dimension dim=driver.manage().window().getSize();
		int height=dim.getHeight();
		int width=dim.width;
		System.out.println(height);
		System.out.println(width);
		Thread.sleep(5000);
		Dimension newdim=new Dimension(700,600);
		driver.manage().window().setSize(newdim);
		System.out.println(newdim);
		// TODO Auto-generated method stub

	}

}
