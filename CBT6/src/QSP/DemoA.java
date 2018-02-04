package QSP;

import java.net.MalformedURLException;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoA {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/c.exe");
	}

	public static void main(String[] args) throws MalformedURLException {
	//	URL r=new URL("http://localhost:4444//wd/hub");	
	//DesiredCapabilities d=new DesiredCapabilities();
//d.setBrowserName("chrome");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.gmail.com");
driver.quit();
	}
}
