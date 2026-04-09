import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import org.testng.annotations.Test;

public class iOSApp {

    String userName = "anushamtestmuai"; //Add username here
    String accessKey = "LT_lB8vD3Dh50vYdC6tC3sExOOyvaqAnj8Ot73XsqugmMY7YB1"; //Add accessKey here
    String app_id = "lt://APP10160251981775646233233424";
    //String app_id = "lt://APP1016024601774620720796792";
    // Enter your LambdaTest App ID at the place of lt://proverbial-android
    //String grid_url = System.getenv("LT_GRID_URL") == null ? "mobile-hub.lambdatest.com" : System.getenv("LT_GRID_URL");

    AppiumDriver driver;

    @Test
    @org.testng.annotations.Parameters(value = {"device", "version", "platform"})
    public void iOSApp1(String device, String version, String platform) {

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("build", "Sample test by Anusha");
            capabilities.setCapability("name", platform + " " + device + " " + version);
            capabilities.setCapability("deviceName", device);
            capabilities.setCapability("platformVersion", version);
            capabilities.setCapability("platformName", platform);
            capabilities.setCapability("isRealMobile", true);
            capabilities.setCapability("app", app_id); //Enter your app url
            capabilities.setCapability("network", false);
            capabilities.setCapability("visual", true);
            capabilities.setCapability("devicelog", true);
            //capabilities.setCapability("geoLocation", "HK");

          String hub = "https://anushamtestmuai:LT_lB8vD3Dh50vYdC6tC3sExOOyvaqAnj8Ot73XsqugmMY7YB1@mobile-hub.lambdatest.com/wd/hub";
           // String hub = "https://tyrondemate:LT_AhbT5QoVXFa0cYoGFsLr3ZTzuS54iiOBJyPMf9WWOpSET76@mobile-hub.lambdatest.com/wd/hub";
            driver = new AppiumDriver(new URL(hub), capabilities);

            WebDriverWait Wait = new WebDriverWait(driver, 30);

            //Changes the color of the text

            Thread.sleep(1000);
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
