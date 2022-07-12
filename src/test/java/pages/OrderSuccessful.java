package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class OrderSuccessful extends BrowserUtils {
    public OrderSuccessful(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement verifyMesseage;
    public void setVerifyMessage(String String) {

        Assert.assertEquals("Payment successfull!",verifyMesseage.getText());

    }
}