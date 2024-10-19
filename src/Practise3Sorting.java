import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practise3Sorting {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
		
		List<WebElement> webElements=driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originalList=webElements.stream().map(s->s.getText()).collect(Collectors.toList());	
		
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		if(originalList.equals(sortedList))
			System.out.println("Elements are sorted");
				
		Thread.sleep(5000);
		driver.quit();
	}
}
