import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractParentPage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmailNewAccaount(String email){
        driver.findElement(By.xpath("//input[@id='email_create']")).click();
        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@value='SubmitCreate']")).click();
    }

    public void enterEmailAlradyRegistered(String email){
        driver.findElement(By.xpath("//form[@id='login_form']/div/div/input[@id = 'email']")).click();
        driver.findElement(By.xpath("//form[@id='login_form']/div/div/input[@id = 'email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='email']")).click();
    }

    public void enterPasswordAlradyRegistered(String password){
        driver.findElement(By.xpath("//input[@id='passwd']")).click();
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='passwd']")).click();
    };
}