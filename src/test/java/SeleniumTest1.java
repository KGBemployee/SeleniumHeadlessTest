import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by Alex on 4/17/2017.
 */
public class SeleniumTest1 {

    private WebDriver driver = new HtmlUnitDriver();
//    private WebDriver driver = new FirefoxDriver();

    @Test
    public void testPage(){
        driver.get("http://stirileprotv.ro");
        driver.findElement(By.xpath(".//a[@title='Politic']")).click();
        driver.findElement(By.xpath("(.//a[contains(@title,'Mesajul lui Klaus Iohannis de Paste pentru romanii din tara si din diaspora. Ce urari au publicat pe Facebook politicienii')])[1]")).click();
        Assert.assertTrue("the page title does not equal expected", driver.getTitle().contains("Mesajul lui Klaus Iohannis de Paste "));
        driver.quit();
    }
}
