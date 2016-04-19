package MobileJenkins.Integration;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class testLaunch {
	//Test Script with Parametrized Capabilities

		//@Test

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

		driver.quit();*/

		

		//Jenkins Groovy Script:

		/*if(binding.variables.get('platformName') != null){

		platform=binding.variables.get('platformName')

		if (platform == 'iOS')

		return ['7.0','8.0','8.1']

		else if(platform == 'Android')

		return ['4.2.2','4.5','5.0']*/

		}
	

