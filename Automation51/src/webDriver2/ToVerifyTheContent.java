//WASTV content on WebPage;
package webDriver2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToVerifyTheContent {

	public static void main(String[] args) {
		String exceptedcontent="Known for its innovative technology and elegant designs";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/mobiles/apple~brand/pr?sid=tyy,4io");
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
		if(sourcecode.contains(exceptedcontent))
		{
			System.out.println("PASS:the content is verifed");
		}
		else
		{
			System.out.println("FAIL:the content is not verifed");
		}
		// TODO Auto-generated method stub

	}

}
