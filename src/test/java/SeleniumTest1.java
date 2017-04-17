import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by Alex on 4/17/2017.
 */
public class SeleniumTest1 {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new HtmlUnitDriver();
//        driver = new FirefoxDriver();
    }

    @Test
    public void testPage(){
        driver.get("http://www.seleniumhq.org/");
        driver.findElement(By.xpath(".//a[@title='Technical references and guides']")).click();
        Assert.assertTrue("the page title is not as expected", driver.getTitle().contains("Selenium Documentation "));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
