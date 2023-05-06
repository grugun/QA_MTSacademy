package webtests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected String urlPath = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @BeforeSuite
    public void setRunHeadless() {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        //Configuration.headless = true;
        Configuration.timeout = 100000;
    }
}
