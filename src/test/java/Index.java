import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("file:///Users/y.shvydak/Downloads/index.html");
    }

    @Test
    public void cssLocators() {
        // by tag name

        WebElement elButton = wd.findElement(By.tagName("button"));
        WebElement elButtonCSSselector = wd.findElement(By.cssSelector("button"));

        WebElement aEl = wd.findElement(By.tagName("a"));
        WebElement aElCSSSelector = wd.findElement(By.cssSelector("a"));

        List<WebElement> list = wd.findElements(By.tagName("a"));
        int i = list.size();
        WebElement el4 = list.get(2);

        // by class

        WebElement divContainer = wd.findElement(By.className("container"));
        WebElement divContainerCSS = wd.findElement(By.cssSelector(".container"));

        List<WebElement> navList = wd.findElements(By.className("nav-item"));
        List<WebElement> navListCSS = wd.findElements(By.cssSelector(".nav-item"));

        // by id

        WebElement nav = wd.findElement(By.id("nav"));
        WebElement navCSS = wd.findElement(By.cssSelector("#nav"));

        // by attribute

        WebElement inputEmail = wd.findElement(By.cssSelector("[class='container']"));
        WebElement item = wd.findElement(By.cssSelector("[href='#item1']"));

        // by name

        WebElement input = wd.findElement(By.name("surename"));

        // by part of text
        WebElement inp = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement inpCSSstart = wd.findElement(By.cssSelector("[placeholder ^='Type you']"));
        WebElement inpCSSend = wd.findElement(By.cssSelector("[placeholder $='r name']"));
        WebElement inpCSScenter = wd.findElement(By.cssSelector("[placeholder *='your']"));

    }

}
