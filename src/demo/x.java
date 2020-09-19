package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Infostretch\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}
