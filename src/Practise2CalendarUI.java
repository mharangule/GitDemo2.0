import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practise2CalendarUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
		String monthNumberSelect = "9";
		String dateSelect = "2";
		String yearSelect = "1994";
		
		String calendarDate[]= {monthNumberSelect,dateSelect,yearSelect};
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		String year = driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).getText();
		
		//Select the desired year
		
		while(!year.equals(calendarDate[2])) {
			int selectYear=Integer.parseInt(calendarDate[2]);
			int currentYear=Integer.parseInt(year);
			if(currentYear<selectYear) {
				driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
				year = driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).getText();
			}
			else {
				driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__prev-button']")).click();
				year = driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).getText();
			}		
		}
		
		//Select the desired Month
		List <WebElement>months=driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']"));
		months.get(Integer.parseInt(calendarDate[0])-1).click();
		
		//Select the desired Date
		List <WebElement> days=driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__month-view__days__day' or @class='react-calendar__tile react-calendar__month-view__days__day react-calendar__month-view__days__day--weekend' ]"));
		days.get(Integer.parseInt(calendarDate[1])-1).click();
		
		//Print the final date
		String finalDate="";
		List <WebElement> Dates=driver.findElements(By.xpath("//input[@inputmode='numeric']"));
		for(int i=0;i<Dates.size();i++) {
			finalDate=finalDate+Dates.get(i).getAttribute("value");
			if(i!=Dates.size()-1)
				finalDate=finalDate+"/";
			Assert.assertEquals(Dates.get(i).getAttribute("value"),calendarDate[i]);
		}
		
		System.out.println(finalDate);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
