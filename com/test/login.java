
public class login {
System.setProperties("webdriver.chrome.driver","D:/IEDriverServer_Win32_3.14.0/IEDriverServer.exe");
WebDriver webdriver = new InternetExplorerDriver();
driver.get("https//www.google.com");
String s=driver.getTitle();
System.out.println(s);
}
