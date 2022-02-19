package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class GoogleTest {
    static WebDriver driver;
    @BeforeAll
    public static void before() {
        System.setProperty("webdriver.chrome.driver",  "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("Калькулятор", Keys.ENTER);}

    @Test
    public void test1() {

        driver.findElement(By.cssSelector("div[jsname='j93WEe']")).click();
        driver.findElement(By.cssSelector("div[jsname='N10B9']")).click();
        driver.findElement(By.cssSelector("div[jsname='XSr6wc']")).click();
        driver.findElement(By.cssSelector("div[jsname='lVjWed']")).click();
        driver.findElement(By.cssSelector("div[jsname='qCp9A']")).click();
        driver.findElement(By.cssSelector("div[jsname='YovRWb']")).click();
        driver.findElement(By.cssSelector("div[jsname='KN1kY']")).click();
        driver.findElement(By.cssSelector("div[jsname='pPHzQc']")).click();
        driver.findElement(By.cssSelector("div[jsname='xAP7E']")).click();
        driver.findElement(By.cssSelector("div[jsname='bkEvMb']")).click();
        driver.findElement(By.cssSelector("div[jsname='WxTTNd']")).click();
        driver.findElement(By.cssSelector("div[jsname='Ax5wH']")).click();
        driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();
        assertEquals("(1 + 2) × 3 - 40 ÷ 5 =",driver.findElement(By.cssSelector("span[jsname='ubtiRe']")).getText());
        assertEquals("1",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());

    }

    @Test
    public void test2() {
        driver.findElement(By.cssSelector("div[jsname='abcgof']")).click();
        driver.findElement(By.cssSelector("div[jsname='WxTTNd']")).click();
        driver.findElement(By.cssSelector("div[jsname='bkEvMb']")).click();
        driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();
        assertEquals("6 ÷ 0 =",driver.findElement(By.cssSelector("span[jsname='ubtiRe']")).getText());
        assertEquals("Infinity",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());
    }

    @Test
    public void test3() {
        driver.findElement(By.cssSelector("div[jsname='aN1RFf']")).click();
        driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();
        assertEquals("sin() =",driver.findElement(By.cssSelector("span[jsname='ubtiRe']")).getText());
        assertEquals("Error",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());

    }
    @AfterAll
    public static void after() {driver.quit();}
}
