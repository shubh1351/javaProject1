package suggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnSpecificSuggestions {

	public static void main(String[] args) {
		 String specificsug="news";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Virat");
		List<WebElement> allsug=driver.findElements(By.xpath("//span[contains(text(),'irat')]"));
		int noofsug=allsug.size();
		System.out.println("No Of Suggestion Provided By Google Search: "+noofsug);
		for(WebElement sug:allsug) {
			String sugtext=sug.getText();
			
			if(sugtext.contains(specificsug)) {
				sug.click();
			
				break;
			}
			
			
		}
		
		

	}

}
