import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Alex on 4/17/2017.
 */
public class SeleniumHeadlessTest2 {
    private PhantomJSDriver driver;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                "src/main/resources/phantomjs-2.1.1-windows/phantomjs-2.1.1-windows/bin/phantomjs.exe"
        );
        driver = new PhantomJSDriver(caps);
    }

    @Test
    public void testPhantomJSDriver(){
        driver.get("http://www.seleniumhq.org/");
        driver.findElement(By.xpath(".//a[@title='Technical references and guides']")).click();
        Assert.assertTrue("the page title is not as expected", driver.getTitle().contains("Selenium Documentation "));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}

