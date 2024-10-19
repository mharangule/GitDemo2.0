import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class OrangeHRMLogin {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver =new ChromeDriver();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Admin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Job ']")).click();
		driver.findElement(By.xpath("//a[.='Job Titles']")).click();
		Thread.sleep(2000);
		
		List <WebElement> elementlist =driver.findElements(By.xpath("//div[@class='oxd-table-card']/div/div[@style='flex: 2 1 0%;']"));
		List <String> jobTitles1= new ArrayList<String>();
		for(int i=0; i<elementlist.size();i++) {
			jobTitles1.add(i, elementlist.get(i).getText());
		}
		System.out.println(jobTitles1);
		List <String> jobTitles2=jobTitles1.stream().sorted().collect(Collectors.toList());
		System.out.println(jobTitles2);
		Collections.sort(jobTitles2,Collections.reverseOrder());
		System.out.println(jobTitles2);
	
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-sort-alpha-down oxd-icon-button__icon oxd-table-header-sort-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Descending']")).click();
		
		Thread.sleep(5000);
		
		List <WebElement> relementlist =driver.findElements(By.xpath("//div[@class='oxd-table-card']/div/div[@style='flex: 2 1 0%;']"));
		List <String> jobTitles3= new ArrayList<String>();
		for(int i=0; i<relementlist.size();i++) {
			jobTitles3.add(i, relementlist.get(i).getText());
		}
		
		System.out.println(jobTitles3);
		
		if(jobTitles2.equals(jobTitles3))
			System.out.println("Sortings is not working");
		else 
			System.out.println("Sortings is working");  
		Thread.sleep(5000);
		/*
		 * 
		 * 
		 * WebElement scroll =
		 * driver.findElement(By.xpath("//div[@class='social-media-icons']/a[1]"));
		 * Actions actions = new Actions(driver);
		 * actions.moveToElement(scroll).perform();
		 */
		
	//	 /WebDriverWait x= new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='social-media-icons']/a[1]")));
		//driver.findElement(By.xpath("//div[@class='social-media-icons']/a[1]")).click();
		
	/*
	 * Thread.sleep(2000); Set<String> windows=driver.getWindowHandles();
	 * System.out.println(windows);
	 */
		driver.quit();
	}

}
