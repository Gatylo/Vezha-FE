import PreStartPage.preStartPage;
import DriverActions.driverActions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testClass {
    @BeforeTest
    public void Testme()
    {
        preStartPage.runStartPage();
    }

    @Test
    public void Testme1()
    {
        System.out.println("test");
    }

    @AfterTest
    public void closeDriver()
    {
        driverActions.closeDriver();
    }

}

