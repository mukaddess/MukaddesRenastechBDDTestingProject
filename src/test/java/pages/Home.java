package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;
import utils.Driver;

public class Home extends BrowserUtils {
    public Home() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//h2[.='Mother Elephant With Babies Soft Toy']")
    private WebElement ToyHeader;
    @FindBy(xpath = "//h3[.='Price: $20']")
    private WebElement ToyPrice;
    @FindBy(xpath = "//select[@name='quantity']")
    private WebElement quantityDropdown;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNow;
    @FindBy(xpath = "//select[@style='font-size: 1.2em;color:#FFF;']")
    private WebElement quantity;
    @FindBy(xpath = "//input[@class='button special']")
    private WebElement buy;


    public void setToyHeader(String expectedMessage) {

        Assert.assertEquals(ToyHeader.getText(), expectedMessage);
    }

    public void setToyPrice(String expectedMessage) {

        Assert.assertEquals(ToyPrice.getText(), expectedMessage);
    }
    public void verifyURL(String string) {

        boolean isVerified = false;
        if(Driver.getDriver().getCurrentUrl().contains(string))
        {
            isVerified = true;
        }
        Assert.assertTrue(isVerified);
    }


    public void setQuantityDropdown(String str) {
        Select select = new Select(quantityDropdown);
        select.selectByValue(str);
    }

    public void setBuyNow() {
        staticWait(2);
        buyNow.click();
    }

    public void setQuantity(String strr) {
        Select select = new Select(quantity);
        select.selectByValue(strr);
    }

    public void setBuy() {
        staticWait(2);
        buy.click();

    }
}