package webDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shubh/OneDrive/Desktop/thukrakemerapyar.html");
		WebElement textfield=driver.findElement(By.tagName("a"));
		textfield.click();
	}

}
