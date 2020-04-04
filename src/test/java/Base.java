import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public static void main(String[] args)
{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:/Users/sonal/Downloads/eclipse-java-luna-SR2-win32-x86_64/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.quit();
}
}
