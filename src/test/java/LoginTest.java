import io.qameta.allure.*;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Description("check display report")
    @Epic("Some epric")
    @Issue("somelink")
    @Story("some story new or old")
    @Owner("Dimon")
    @Test(priority = 0, description = "check aluure")
    public void createNewAccount(){
        mainPage.openSite();
        mainPage.getUrl();
        System.out.println("uspeshno");
        //mainPage.openSignInPage();
        //String accountemail = RandomStringUtils.
        //signInPage.enterEmailNewAccaount(accountemail + "@gmail.com");

    }
}