package DriverActions;

import Properties.properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverActions {

    static WebDriver driver = new ChromeDriver();

    public static void closeDriver(){
        driver.close();
    }


}
