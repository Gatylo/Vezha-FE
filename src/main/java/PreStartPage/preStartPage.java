package PreStartPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Properties.properties;

public class preStartPage {

    static WebDriver driver = new ChromeDriver();

    public static void runStartPage(){

        String startingLink = "https://" + properties.VEZHA_AUTH_USER + ":" +
                properties.VEZHA_AUTH_PASSWORD + "@" + properties.VEZHA_ADDRESS;

        driver.get(startingLink);
    }


}
