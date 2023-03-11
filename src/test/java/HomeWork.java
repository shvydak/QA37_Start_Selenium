import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        wd = new ChromeDriver(co);
        //wd= new FirefoxDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators() {
        // by tag name
        WebElement byTagName0 = wd.findElement(By.tagName("body"));
        WebElement byTagName1 = wd.findElement(By.tagName("div"));
        WebElement byTagName2 = wd.findElement(By.tagName("h1"));
        WebElement byTagName3 = wd.findElement(By.tagName("form"));
        WebElement byTagName4 = wd.findElement(By.tagName("input"));
        WebElement byTagName5 = wd.findElement(By.tagName("button"));

        // by class
        WebElement byClassName0 = wd.findElement(By.className("container"));
        WebElement byClassName1 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
//        WebElement byClassName2 = wd.findElement(By.className(""));
        //By id

        // by attribute

        // one of elements find by attribute ==> start & end & contains value

        //Start

        // contains
    }
}
