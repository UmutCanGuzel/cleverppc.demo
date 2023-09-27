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
    @FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    public WebElement signIN;
    @FindBy(id="email")
    public WebElement username;

    @FindBy(id="passwd")
    public WebElement password;

    @FindBy(xpath="//*[@id='SubmitLogin']/span")
    public WebElement loginButton;

    @FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]")
    public WebElement dresses;

    @FindBy(xpath="//*[@id='center_column']//*[contains(text(), 'Showing 1 - 5 of 5 items')]")
    public WebElement containText;
    @FindBy(xpath="//span[@class='heading-counter']")
    public WebElement fiveProduct;
    @FindBy(xpath="//*[@id='product_list']//img")
    public List<WebElement> items;

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
