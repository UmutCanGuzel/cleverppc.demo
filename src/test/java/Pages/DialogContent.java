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
    //US3 locators

    //US4 locators

    //US5 locators

    //US6 locators

    //US7 locators

    //US8 locators


    public WebElement getWebElement(String strElement){
        switch (strElement){
            // case "addButton": return this.addButton;

        }

        return null;
    }
}
