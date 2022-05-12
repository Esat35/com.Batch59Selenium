package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    public static void main(String[] args) {

        //amazon sıtesıne gıdıp kaynak kodlarında "Gateway" yazdıgını test edın.
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        String sayfaKaynakKodlari = driver.getPageSource();// sayfa kaynagını verır
        String araranKelime = "Gateway";
        if (sayfaKaynakKodlari.contains(araranKelime)) {
            System.out.println("Kaynak kodu testi PASSED");
        } else {
            System.out.println("Kaynak kodlarında " + araranKelime + " yok, test FAILED");
        }


        driver.close();
    }
}
