package webDriver2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IdName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/SignUpPage");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.name("email"));
		WebElement pass=driver.findElement(By.name("password"));
		WebElement conpass=driver.findElement(By.name("password"));
		email.sendKeys("shubhmaurya123@gmail.com");
		System.out.println(email);
		

	}

}
