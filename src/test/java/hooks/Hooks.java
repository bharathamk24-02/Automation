package hooks;

import base.TestContext;
import io.cucumber.java.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("************ Starting Browser ************");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.close();
        System.out.println("************* Drive closed ****************");
    }

    public static WebDriver getDriver() {

        return driver;
    }
}

