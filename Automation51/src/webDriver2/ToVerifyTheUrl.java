//write a script to verify the url.
package webDriver2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToVerifyTheUrl{

	public static void main(String[] args) {
		String expectedurl="apple";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/mobiles/apple~brand/pr?sid=tyy,4io");
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		System.out.println(expectedurl);
		if(actualurl.contains(expectedurl))
		{
			System.out.println("PASS:the URL is verified");
		}
		else
		{
			System.out.println("FAIL:the URL is not verified");
		}
		// TODO Auto-generated method stub
	}

}
