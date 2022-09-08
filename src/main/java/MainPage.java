import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class MainPage extends AbstractParentPage {
    public MainPage(WebDriver driver) {
        super(driver);
    }
    private WebElement caption;

    private static final String siteUrl = "http://automationpractice.com/index.php";


    public void openSite(){
        driver.get(siteUrl);
    }

    public void openSiteGoogle(){
        driver.get(siteUrl);
    }

    public void openSignInPage(){
        driver.findElement(By.xpath("//a[@class='login']")).click();
    }

    public void getUrl(){
        driver.getCurrentUrl();
    };
}