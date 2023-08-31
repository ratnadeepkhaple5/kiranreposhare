package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class S1_1 {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities dc=new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"mobile device Name");
		dc.setCapability(MobileCapabilityType.UDID,"UDID Number");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
		dc.setCapability("appPackage","--------");
		dc.setCapability("appActivity","--------");
		
		URL url=new URL("-----------");
		
		AppiumDriver driver=new AppiumDriver(url,dc);
		
		driver.findElement(AppiumBy.id("---")).click();
		driver.findElement(AppiumBy.accessibilityId("----")).click();

	}

}
