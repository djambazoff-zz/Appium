package MobileJenkins.Integration;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class testAndroidTest {
	//Test Script with Parametrized Capabilities

	@Test
	public void testLaunchBrowser() throws Exception{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName","Appium");
		capabilities.setCapability("platformName", System.getProperty("PlatformName"));
		capabilities.setCapability("platformVersion",System.getProperty("PlatformVersion"));
		capabilities.setCapability("deviceName", "0887a9e4");
		//we dont need app path for native apps
		//Chrome driver
		capabilities.setCapability("appPackage","com.android.chrome");
		capabilities.setCapability("appActivity","Main");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://kroger.com");
		
		//*********get the USER AGENT( Consist the information of my mobile device)**********
		//JavascriptExecutor je=(JavascriptExecutor)driver;
		//System.out.println(je.executeScript("return navigator.userAgent;", new Object[0]));
		
		driver.findElement(By.id("signIn")).click();
		driver.findElement(By.id("signin-drawer-email-address")).sendKeys("username");
		driver.findElement(By.id("signin-drawer-password")).sendKeys("password");
		driver.findElement(By.id("signin-drawer-submit")).click();
		Thread.sleep(10000);
		
		driver.quit();
		
	}
	



			/*public void testLaunch() throws MalformedURLException, InterruptedException {

			DesiredCapabilities capabilities=new DesiredCapabilities();

			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, System.getProperty("PlatformName"));//This is called from POM

			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,System.getProperty("PlatformVersion"));//This is called from POM

			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone Simulator");

			capabilities.setCapability("app","/Users/srikanthvejendla/Desktop/UiCatalog.app");

			IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			((WebElement) driver.findElements(By.className("UIAButton")).get(0)).click();

			driver.scrollTo("Date Picker").click();

			((WebElement) driver.findElements(By.className("UIAPickerWheel")).get(0)).sendKeys("Jan 11");

			((WebElement) driver.findElements(By.className("UIAPickerWheel")).get(1)).sendKeys("11");

			((WebElement) driver.findElements(By.className("UIAPickerWheel")).get(2)).sendKeys("30");

			((WebElement) driver.findElements(By.className("UIAPickerWheel")).get(3)).sendKeys("PM");

			Thread.sleep(5000);

			driver.quit();
*/
			

			//Jenkins Groovy Script:

			/*if(binding.variables.get('platformName') != null){

			platform=binding.variables.get('platformName')

			if (platform == 'iOS')

			return ['7.0','8.0','8.1']

			else if(platform == 'Android')

			return ['4.2.2','4.5','5.0']*/

			}
		
		
