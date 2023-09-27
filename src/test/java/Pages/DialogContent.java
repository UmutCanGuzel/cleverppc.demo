package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    //US1 locators


    //US2 locators
    @FindBy(xpath = "//a[@class='login']")
    public WebElement singInButton;
    //US3 locators

    //US4 locators

    //US5 locators

    //US6 locators

    //US7 locators

    @FindBy(name = "email_create")
    public WebElement emailAdress;

    @FindBy(name = "SubmitCreate")
    public WebElement submitCreate;

    @FindBy(id = "id_gender1")
    public WebElement gender_1;

    @FindBy(id = "customer_firstname")
    public WebElement customer_firstname;

    @FindBy(id = "customer_lastname")
    public WebElement customer_lastname;


    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "passwd")
    public WebElement passwd;

    @FindBy(id = "days")
    public WebElement days;

    @FindBy(id = "uniform-days")
    public WebElement daysClick;
    @FindBy(id = "months")
    public WebElement months;

    @FindBy(id = "uniform-months")
    public WebElement monthsClick;

    @FindBy(id = "uniform-years")
    public WebElement yearsClick;

    @FindBy(id = "years")
    public WebElement years;

    @FindBy(id = "submitAccount")
    public WebElement submitAccount;

    @FindBy(name = "SubmitLogin")
    public WebElement submitLogin;

    @FindBy(linkText = "Sign in")
    public WebElement signIn;

    @FindBy(xpath = "//ul[@class='toggle-footer']//li//a[@title='Sitemap']")
    public WebElement siteMap;

    @FindBy(xpath = "//a[@title='View a list of my addresses']")
    public WebElement addresses;
    @FindBy(xpath = "//a[@title='Add an address']")
    public WebElement add_Address;



    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastname;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement address1;
    @FindBy(id = "address2")
    public WebElement address2;
    @FindBy(id = "city")
    public WebElement city;
    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "phone_mobile")
    public WebElement phone_mobile;
    @FindBy(id = "other")
    public WebElement other;
    @FindBy(name = "submitAddress")
    public WebElement submitAddress;
    @FindBy(id = "uniform-id_state")
    public WebElement stateClick;

    @FindBy(id = "id_state")
    public WebElement stateSelect;

    @FindBy(id = "uniform-id_country")
    public WebElement countryClick;

    @FindBy(id = "id_country")
    public WebElement countrySelect;

    @FindBy(id = "alias")
    public WebElement alias;

    @FindBy(xpath = "//a//img[@class='replace-2x img-responsive']")
    public List<WebElement> img_mouseovers;

    @FindBy(xpath = "//a[@title='Add to cart']//span")
    public List<WebElement> addToCards;

    @FindBy(xpath = "//div[@class='button-container']//span[@title='Continue shopping']")
    public WebElement countinueButton;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    public WebElement checkOutButton;

    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    public WebElement dressess;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div[4]/div/div/p/label")
    public WebElement agreeButton;

    @FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
    public WebElement proceedButton;

    @FindBy(name = "processAddress")
    public WebElement proceedButton2;
    @FindBy(name = "processCarrier")
    public WebElement proceedButton3;

    @FindBy(xpath = "(//span[@class='checked'])[2]")
    public WebElement checked;
    //
    @FindBy(id = "paypal-standard-btn")
    public WebElement paypalButton;

    @FindBy(xpath = "//div[@class='content-wrap']//div[@class='message']")
    public WebElement paypalMessage;
    @FindBy(xpath = "(//p[@class='payment_module']//a)[3]")
    public WebElement creditCardButton;

    @FindBy(xpath = "/html/body")
    public WebElement creditCardMsg;

    @FindBy(xpath = "(//p[@class='payment_module']//a)[1]")
    public WebElement bankButton;

    @FindBy(xpath = "//td[@class='cart_total']//span")
    public List<WebElement> totalPriceList;

    @FindBy(xpath = "(//td[@class='price'])[1]")
    public WebElement totalProducs;

    @FindBy(xpath = "(//td[@class='price'])[2]")
    public WebElement totalShipping;

    @FindBy(xpath = "(//td[@class='price'])[3]")
    public WebElement TOTAL;

    @FindBy(xpath = "//span[@id='amount']")
    public WebElement amount;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement confirmButton;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement completeMessage;



    //US8 locators







    public WebElement getWebElement(String strElement){
        switch (strElement) {
            case "emailAdress":
                return this.emailAdress;
            case "submitCreate":
                return this.submitCreate;
            case "gender_1":
                return this.gender_1;
            case "customer_firstname":
                return this.customer_firstname;
            case "customer_lastname":
                return this.customer_lastname;
            case "email":
                return this.email;
            case "passwd":
                return this.passwd;
            case "days":
                return this.days;

            case "months":
                return this.months;

            case "years":
                return this.years;
            case "submitLogin":
                return this.submitLogin;
            case "firstname":
                return this.firstname;
            case "lastname":
                return this.lastname;
            case "company":
                return this.company;
            case "address1":
                return this.address1;
            case "address2":
                return this.address2;
            case "city":
                return this.city;
            case "postcode":
                return this.postcode;
            case "phone":
                return this.phone;
            case "phone_mobile":
                return this.phone_mobile;
            case "other":
                return this.other;
            case "stateClick":
                return this.stateClick;
            case "countryClick":
                return this.countryClick;
            case "alias":
                return this.alias;
            case "agreeButton":
                return this.agreeButton;
            case "proceedButton":
                return this.proceedButton;
            case "paypalButton":
                return this.paypalButton;
            case "paypalMessage":
                return this.paypalMessage;
            case "creditCardButton":
                return this.creditCardButton;
            case "creditCardMsg":
                return this.creditCardMsg;

            case "bankButton":
                return this.bankButton;

            case "proceedButton2":
                return this.proceedButton2;
            case "proceedButton3":
                return this.proceedButton3;
            case "signIn":
                return this.signIn;
            case "siteMap":
                return this.siteMap;
            case "addresses":
                return this.addresses;
            case "add_Address":
                return this.add_Address;

        }


        return null;
    }
}
