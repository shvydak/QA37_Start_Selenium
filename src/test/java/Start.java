
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Start {

    @BeforeClass
    public void setUp(){

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver wd = new ChromeDriver(co);
        wd.get("https://telranedu.web.app/home");
    }
    @Test
    public void start() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver wd = new ChromeDriver(co);


        wd.close(); // close only one tab, if there is just only tab - it closes the browser


//        wd.quit(); // close the browser with all opened tabs
    }

}
