package reusable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
public class BrowserInvocation {
     public static WebDriver driver;
    public static Properties prob;

    public static  WebDriver launchApplication() throws IOException  {
        String path = System.getProperty("user.dir");
        System.out.println(path);
        FileInputStream fis = new FileInputStream(new File(path +"\\src\\main\\resources\\utility\\Configuration.properties"));
        prob  = new Properties();
        prob.load(fis);
        switch (prob.getProperty("Browser").toLowerCase()){
            case "chrome":
                ChromeOptions co = new ChromeOptions();
                co.addArguments("--remote-allow-orgins=*");
                //System.setProperty("webdriver.chrome.driver" , "D:\\Web drivers\\chromedriver.exe");
                driver = new ChromeDriver(co);
                driver.navigate().to(prob.getProperty("URL"));
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                driver.manage().window().maximize();
                break;
            case  "edge":
                System.setProperty("webdriver.edge.driver","D:\\Web drivers\\msedgedriver.exe");
                driver = new EdgeDriver();
                driver.navigate().to(prob.getProperty("URL"));
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                driver.manage().window().maximize();
                break;
            default:
                throw new IllegalArgumentException();

        }

        return driver;
    }
}
