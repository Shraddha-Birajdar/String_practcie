package Drive_Check;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrrenshotTest {

	
	public static void main(String args[]) throws IOException
	{
		
		  System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();	
	      driver.get("https://www.Amazon.in");
	       
	      TakesScreenshot src=((TakesScreenshot)driver); 
	      File actual_File=src.getScreenshotAs(OutputType.FILE);
	      String Path="E:\\Software Testing\\ScreenShot\\Am.png";
	      File dest=new File(Path);
	      FileHandler.copy(actual_File, dest);
	      driver.quit();
	}
	
}
