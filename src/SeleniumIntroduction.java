 
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SeleniumIntroduction {
	public static void main(String[] args) throws InterruptedException {
		// System.out.println("Hello World");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement searchBox=driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		searchBox.sendKeys("mobiles");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String parentWindowId=driver.getWindowHandle();
		System.out.println(parentWindowId);
		List<WebElement> searchResults=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		for(WebElement searchResult:searchResults) {
			String mobileName=searchResult.getText();
			if(mobileName.equals("Apple iPhone 15 (Black, 128 GB)")) {
				searchResult.click();
				break;
			}	
		}
		Set<String>windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		System.out.println(windows);
		while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
		}
	
		Thread.sleep(5000);
		driver.quit();
	}

}