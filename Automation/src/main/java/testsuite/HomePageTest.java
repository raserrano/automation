package testsuite;

import framework.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class HomePageTest extends SeleniumBase{

    @Test(groups = {"Smoke"})
    @Parameters({"url"})
    public void testSearch(String url){
        driver.navigate().to(url);
        String email=driver.findElement(By.cssSelector(".info > li:nth-child(2) > p:nth-child(2)")).getText();
        assertEquals(email,"betoseru23@gmail.com");
    }
}