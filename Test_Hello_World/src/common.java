import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class common {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

		File dir = new File("src");
		
		File app = new File(dir,"NDCMFI_3.28.0.583_beta.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel4_emulator");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		/*cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.nordea.nb.onboarding.*");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "fi.nordea.sme.beta");*/
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL ("http://0.0.0.0:4723/wd/hub"), cap );
		
		
		
		return driver;
		
	}
	
	
	
	
}
