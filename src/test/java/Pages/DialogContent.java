package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    //US1 locators


    //US2 locators
    @FindBy(xpath = "//a[@class='login']")
    public WebElement singInButton;
    @FindBy(css = "[id='email']")
    public WebElement LoginEmail;

    @FindBy(css = " [id='passwd']")
    public WebElement LoginPasswrd;

    @FindBy(css = "[id='SubmitLogin']")
    public WebElement SubmitLogin;
    @FindBy(css = "[class='account']")
    public WebElement myHomepage;
    @FindBy(css = "[class='alert alert-danger']")
    public WebElement error;
    @FindBy(css = "[id=passwd]")
    public WebElement passwrd;
    @FindBy(className = "header_user_info")
    public WebElement sign_in;


    //US3 locators

    //US4 locators

    //US5 locators

    //US6 locators

    //US7 locators

    //US8 locators


    public WebElement getWebElement(String strElement){
        switch (strElement){
            // case "addButton": return this.addButton;


                    case "SingButton":
                        return this.sign_in;
                    case "AccountButton":
                        case "userPassword":
                        return this.passwrd;
                    case "RegisterButton":
                        return this.SubmitLogin;
                    case "SubmitLogin": return SubmitLogin;

        }
        return null;
    }
}
