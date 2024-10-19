import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class AmitabhBacchan {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("amitabh bac");
		Thread.sleep(2000);
		List<WebElement> suggestions= driver.findElements(By.xpath("//div[@role='presentation' and @class='wM6W7d']"));
		for(WebElement suggestion:suggestions)
			System.out.println(suggestion.getText());
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
