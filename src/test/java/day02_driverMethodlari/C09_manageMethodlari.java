package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amaazon.com");
        /*
        ilerde wait konusunu daha geniş olarak ele alacagız.
        Bir sayfa acılırken ılk basta sayfanın ıcerısınde bulunan elementlere gore
         bır yuklenme suresıne ıhtıyac vardır.
        veya bır web elementının kullanılabılmesı ıcın zamana ıhtıyac olabılır.
        implicitlyWait bize sayfanın yuklenmesi ve sayfadakı elementlere ulasmak için
         beklenecek  maximum sureyı belırleme olanagı tanır
         */

        driver.close();
        driver.quit();
    }
}
