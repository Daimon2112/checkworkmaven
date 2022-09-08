import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends AbstractParentPage {
    public NewAccountPage(WebDriver driver) {
        super(driver);
    }


    public void selectTitle(){
        driver.findElement(By.id("uniform-id_gender1"));//uniform-id_gender2
        //if string 1 then id1 if string 2 then id2
    }

    public void enterFirstName(){
        driver.findElement(By.id("customer_firstname"));
    }

    public void enterLastName(){
        driver.findElement(By.id("customer_lastname"));
    }

    public void enterPassword(){
        driver.findElement(By.xpath("div[@class='required password form-group']//input[@type='password']"));//div[@data-validate='isPasswd']
    };
}
