package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        System.out.println(driver.getWindowHandle());//benzersız olarak acılan wındows a aıt hashcode unu verır
        //CDwindow-9EB6797AB53DA910C2E4DB2930C3FE9B

        driver.close();
    }
}
