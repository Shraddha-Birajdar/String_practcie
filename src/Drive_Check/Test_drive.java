package Drive_Check;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test_drive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String E_url ="https://www.selenium.dev/";
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();

          driver.get(E_url);
          String A_url=driver.getCurrentUrl();
          if(E_url.equals(A_url) )
          {
        	  System.out.println("Test is pass" + A_url);
          }
          else
          {
        	  System.out.println("Test is fail");
          }
          
	}

}
