import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void start(){
        wd=new ChromeDriver();
//        wd.get("https://www.google.com/");
        wd.navigate().to("https://www.google.com/");

//        wd.close(); // close only one tab, if there is just only tab - it closes the browser
        wd.quit(); // close the browser with all opened tabs
    }

}
