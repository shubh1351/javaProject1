//write a Script to verify the title.
package webDriver2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToVerifyTheTitle {

	public static void main(String[] args) {
		//test data
		String exceptedtitle="Google";
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//navigate to url
		driver.get("https://www.google.co.in/");
		//fetch the title
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		System.out.println(exceptedtitle);
		if(actualtitle.equals(exceptedtitle))
		{
			System.out.println("PASS:the Title is verifed");
		}
		else
		{
			System.out.println("FAIL:the Title is not verifed");
		}
		// TODO Auto-generated method stub
	}

}
