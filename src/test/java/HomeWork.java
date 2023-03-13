import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
import java.util.List;

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
        WebElement xPathTagName1 = wd.findElement(By.xpath("//div"));

        WebElement byTagName2 = wd.findElement(By.tagName("h1"));
        WebElement cssByTagName2 = wd.findElement(By.cssSelector("h1"));
        WebElement xPathTagName2 = wd.findElement(By.xpath("//h1"));

        WebElement byTagName3 = wd.findElement(By.tagName("form"));
        WebElement cssByTagName3 = wd.findElement(By.cssSelector("form"));
        WebElement xPathTagName3 = wd.findElement(By.xpath("//form"));

        WebElement byTagName4 = wd.findElement(By.tagName("input"));
        WebElement cssByTagName4 = wd.findElement(By.cssSelector("input"));
        WebElement xPathTagName4 = wd.findElement(By.xpath("//input"));

        WebElement byTagName5 = wd.findElement(By.tagName("button"));
        WebElement cssByTagName5 = wd.findElement(By.cssSelector("button"));
        WebElement xPathTagName5 = wd.findElement(By.xpath("//button"));

        // by class
        WebElement byClassName0 = wd.findElement(By.className("container"));
        WebElement cssByClassName0 = wd.findElement(By.cssSelector(".container"));
        WebElement xPathByClassName0 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement byClassName1 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement cssByClassName1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement xPathByClassName1 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement byClassName2 = wd.findElement(By.className("active"));
        WebElement cssByClassName2 = wd.findElement(By.cssSelector(".active"));
        WebElement xPathByClassName2 = wd.findElement(By.xpath("//*[@class='active']"));

        WebElement byClassName3 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement cssByClassName3 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement xPathByClassName3 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));

        //By id
        WebElement byId0 = wd.findElement(By.id("root"));
        WebElement cssById0 = wd.findElement(By.cssSelector("#root"));
        WebElement xPathById0 = wd.findElement(By.xpath("//*[@id='root']"));

        // by attribute
        WebElement byAttribute0 = wd.findElement(By.name("email"));
        WebElement cssByAttribute0 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement xPathByAttribute0 = wd.findElement(By.xpath("//*[@name='email']"));

        WebElement cssByAttribute1 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement xPathByAttribute1 = wd.findElement(By.xpath("//*[@placeholder='Email']"));

        WebElement cssByAttribute2 = wd.findElement(By.cssSelector("[name='password']"));
        WebElement xPathByAttribute2 = wd.findElement(By.xpath("//*[@name='password']"));

        WebElement cssByAttribute3 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement xPathByAttribute3 = wd.findElement(By.xpath("//*[@href='/login']"));

        WebElement cssByAttribute4 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement xPathByAttribute4 = wd.findElement(By.xpath("//*[@placeholder='Password']"));

        // one of elements find by attribute ==> start & end & contains value
        WebElement cssbyAttribute4 = wd.findElement(By.cssSelector("[name='registration']"));
        WebElement xPathByAttribute5 = wd.findElement(By.xpath("//*[@name='registration']"));
        //Start
        WebElement cssbyAttributeStart = wd.findElement(By.cssSelector("[name^='regist']"));
        WebElement xPathByAttributeStart = wd.findElement(By.xpath("//*[starts-with(@name, 'regist')]"));

        //End
        WebElement cssbyAttributeEnd = wd.findElement(By.cssSelector("[name$='ration']"));
        WebElement xPathByAttributeEnd = wd.findElement(By.xpath("//*[contains(@name, 'ration')]"));
        // contains
        WebElement cssbyAttributeContain = wd.findElement(By.cssSelector("[name*='gistrati']"));
        WebElement xPathByAttributeContain = wd.findElement(By.xpath("//*[contains(@name, 'gistrati')]"));
    }

    public void classwork() {
        //parent
        WebElement el = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el2 = wd.findElement(By.xpath("//h1/../"));

        //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));

        //h1/ancestor-or-self::*

        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //h1/following-sibling::*

        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::*"));

        //a[@href='/login']/preceding-sibling::a[1]

        WebElement el7 = wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling::a[1]"));
    }

    @Test
    public void classwork2() {
        WebElement element = wd.findElement(By.cssSelector("[name='login']"));
        String text = element.getText();
        System.out.println(text);

        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();
        System.out.println(textForm);

        WebElement br = wd.findElement(By.xpath("//br"));
        String brText = br.getText();
        System.out.println("text br = " + brText);


    }

}
