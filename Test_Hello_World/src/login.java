import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class login extends common  {

	public static void main(String[] args)throws MalformedURLException  {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement>driver= capabilities();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		/*cap.setCapability("appPackage", "fi.nordea.sme.beta");
		cap.setCapability("appActivity", "com.nordea.nb.onboarding.OnboardingActivity");
		
		/* xpath syntax= //tagname[@attribute='Value']
		 * 
		 *  */
		// driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
		driver.findElementById("fi.nordea.sme.beta:id/ncc_button").click();
		driver.findElementByXPath("//android.widget.Button[@text='Change method']").click();
		driver.findElementByXPath("//android.widget.Button[@text='Code calculator']").click();
		driver.findElementById("fi.nordea.sme.beta:id/input_editfield").click();
		driver.findElementById("fi.nordea.sme.beta:id/input_editfield").sendKeys("402727");
		
		driver.findElementByXPath("//android.widget.Button[@text='Login with Code calculator']").click();
		
		driver.findElementById("fi.nordea.sme.beta:id/textinput_placeholder").click();
		
		driver.findElementById("fi.nordea.sme.beta:id/textinput_placeholder").sendKeys("000000000");
		
		driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		
		
		}
		
		
		

	}


