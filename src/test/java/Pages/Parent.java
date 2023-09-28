package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Parent {
    public WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
    SoftAssert _softAssert = new SoftAssert();

    public void myClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        js.executeScript("arguments[0].click();", element);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        };
    }

    public void mySendKeys(WebElement element, String yazi){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        scrollToElement(element);
        element.sendKeys(yazi);
    }

    public void VerifyMessage(WebElement element){
        boolean varMi=false;
        wait.until(ExpectedConditions.visibilityOf(element));
        if(element.getText().toLowerCase().contains("success")){
            varMi=true;
            _softAssert.assertTrue(varMi);
            _softAssert.assertAll();

        }

    }

    public  int randomGenerator(int sinir){
        return (int)(Math.random()*sinir);
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void verifyContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        //action la ESC ye basarak açık kutucuk veya mesaj var ise kapat
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void myDoubleClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        new Actions(GWD.getDriver()).moveToElement(element).doubleClick().build().perform();
    }

    public void myJsClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public  void SelectItem(WebElement e , String index){
        Select select = new Select(e);
        select.selectByValue(index);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

}
