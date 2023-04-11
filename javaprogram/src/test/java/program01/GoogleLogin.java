package program01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class GoogleLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\programs\\Web drivers\\chromedriver.exe");
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://www.google.com/");
        driver2.findElement(By.name("q")).sendKeys("Learn More Training Institute Madurai");
        driver2.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver2.findElement(By.name("btnK")).submit();
        Scanner value = new Scanner(System.in);
        System.out.println("enter the a value");
        int a = value.nextInt();
        System.out.println(a);
        System.out.println("enter the b value");
        double b = value.nextDouble();
        System.out.println(b);
        System.out.println("enter the opreators");
        String d = value.next();
        System.out.println(d);
        switch ("opreators"){
            case "+ opreators":


        }



    }

}
