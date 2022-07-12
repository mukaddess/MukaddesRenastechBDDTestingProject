package pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;
import utils.Driver;

public class Payment extends BrowserUtils {
    public Payment(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@name='card_nmuber']")
    private WebElement cCard;
    @FindBy (xpath = "//select[@name='month']")
    private  WebElement eMonth;
    @FindBy (xpath = "//select[@name='year']")
    private WebElement eYear;
    @FindBy (xpath = "//input[@name='cvv_code']")
    private  WebElement cvvCode;
    @FindBy (xpath = "//input[@type='submit']")
    private WebElement payNow;


    public void setCCard(String CCard) {
        cCard.sendKeys(CCard);
        staticWait(1);

    }

    public void setEMonth(String emonth) {
        eMonth.sendKeys(emonth);
        staticWait(1);
    }

    public void setEYear(String eYeaR) {
        eYear.sendKeys(eYeaR);
        staticWait(1);
    }

    public void setCvvCode(String CVVCode) {
        cvvCode.sendKeys(CVVCode);
        staticWait(1);
    }

    public void setPayNow() {
        payNow.click();
    }
}