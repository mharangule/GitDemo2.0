import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class ScreenShot {
	public static void main(String args[]) throws IOException {
		takescreenshot();
	}
	
	public static void takescreenshot() throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		File File = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(File, new File("C:\\Users\\Prime\\Desktop\\sample\\Google.jpg"));
		//FileUtils.copyFile(File, new File("C:\\Users\\Prime\\Desktop\\sample\\Google.jpg"));
		//FileHandler.copy(File, new File("C:\\Users\\Prime\\Desktop"+"Google.jpg"));
		
		driver.quit();
	}
}
