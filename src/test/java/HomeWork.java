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
        WebElement cssByTagName0 = wd.findElement(By.cssSelector("body"));
        WebElement xPathTagName0 = wd.findElement(By.xpath("//body"));

        WebElement byTagName1 = wd.findElement(By.tagName("div"));
        WebElement cssByTagName1 = wd.findElement(By.cssSelector("div"));

        WebElement byTagName2 = wd.findElement(By.tagName("h1"));
        WebElement cssByTagName2 = wd.findElement(By.cssSelector("h1"));

        WebElement byTagName3 = wd.findElement(By.tagName("form"));
        WebElement cssByTagName3 = wd.findElement(By.cssSelector("form"));

        WebElement byTagName4 = wd.findElement(By.tagName("input"));
        WebElement cssByTagName4 = wd.findElement(By.cssSelector("input"));

        WebElement byTagName5 = wd.findElement(By.tagName("button"));
        WebElement cssByTagName5 = wd.findElement(By.cssSelector("button"));

        // by class
        WebElement byClassName0 = wd.findElement(By.className("container"));
        WebElement cssByClassName0 = wd.findElement(By.cssSelector(".container"));

        WebElement byClassName1 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement cssByClassName1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement byClassName2 = wd.findElement(By.className("active"));
        WebElement cssByClassName2 = wd.findElement(By.cssSelector(".active"));

        WebElement byClassName3 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement cssByClassName3 = wd.findElement(By.cssSelector(".login_login__3EHKB"));

        //By id
        WebElement byId0 = wd.findElement(By.id("root"));
        WebElement cssById0 = wd.findElement(By.cssSelector("#root"));

        // by attribute
        WebElement byAttribute0 = wd.findElement(By.name("email"));
        WebElement cssByAttribute0 = wd.findElement(By.cssSelector("[name='email']"));

        WebElement cssbyAttribute0 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement cssbyAttribute1 = wd.findElement(By.cssSelector("[name='password']"));
        WebElement cssbyAttribute2 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement cssbyAttribute3 = wd.findElement(By.cssSelector("placeholder='Password'"));

        // one of elements find by attribute ==> start & end & contains value
        WebElement cssbyAttribute4 = wd.findElement(By.cssSelector("[name='registration']"));
        //Start
        WebElement cssbyAttributeStart = wd.findElement(By.cssSelector("[name^='regist']"));

        //End
        WebElement cssbyAttributeEnd = wd.findElement(By.cssSelector("[name$='ration']"));
        // contains
        WebElement cssbyAttributeContain = wd.findElement(By.cssSelector("[name*='gistrati']"));
    }
}
