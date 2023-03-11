import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {
    WebDriver wd;
@BeforeClass
    public void preConditions(){
    //open browser
    ChromeOptions co = new ChromeOptions();
    co.addArguments("--remote-allow-origins=*");
    WebDriver wd = new ChromeDriver(co);
    //open site
    wd.navigate().to("https://telranedu.web.app/home");
//    wd.get("https://telranedu.web.app/home");
}
@Test
    public void loginSuccess(){
    // open form (find element + click)
    // fill email (find element + click + clear + type)
    // fill password (find element + click + clear + type)
    // submit element (find element + click)
}
@Test
    public void loginWrongEmail(){
    // open form
    // fill form
    // submit form
}
    @Test
    public void loginWrongPassword(){
        // open form
        // fill form
        // submit form
    }
    @AfterClass
    public void postCondition(){
    // close browser
        wd.quit();
    }


}
