package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class _07_CheckoutSteps {

    DialogContent dc = new DialogContent();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

    @Given("The users navigate to Cleverppc homepage")
    public void theUsersNavigateToCleverppcHomepage() {

        GWD.getDriver().get("https://cleverppc.com/prestashop4/");


    }

    @When("The users click the sign in button")
    public void theUsersClickTheSignInButton() {
        dc.myClick(dc.signIn);


    }

    @And("Enter the current e-mail and password")
    public void enterTheCurrentEMailAndPassword(DataTable dt) {
        List<List<String>> list = dt.asLists(String.class);
        for (int i = 0; i < list.size(); i++) {
            WebElement e = dc.getWebElement(list.get(i).get(0));
            dc.mySendKeys(e, list.get(i).get(1));

        }

    }

    @And("The users click the submit in button")
    public void theUsersClickTheSubmitInButton() {
        dc.myClick(dc.submitLogin);
    }




    @When("The users click the dress button")
    public void theUsersClickTheDressButton() {
        dc.myClick(dc.dressess);
    }


    @Then("The users choose three diffirent clothes in this section")
    public void theUsersChooseThreeDiffirentClothesInThisSection() {

        List<WebElement> listOfCards = dc.addToCards;
        List<WebElement> listOfIMG = dc.img_mouseovers;

        Actions actions = new Actions(GWD.getDriver());

        int a = 0;
        for (int i = 0; i < listOfIMG.size(); i++) {
            int x = dc.randomGenerator(listOfIMG.size());
            actions.moveToElement(listOfIMG.get(x)).build().perform();
            wait.until(ExpectedConditions.elementToBeClickable(listOfCards.get(x)));
            dc.myClick(listOfCards.get(x));
            a++;
            if (a < 3) {

                dc.myClick(dc.countinueButton);
            } else {
                dc.myClick(dc.checkOutButton);

                Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("controller"));
            }

        }

    }

    @When("The users click the buttons")
    public void theUsersClickTheButtons(DataTable dt) {

        List<String> list = dt.asList(String.class);
        for (int i = 0; i < list.size(); i++) {

            dc.myClick(dc.getWebElement(list.get(i)));


        }

        dc.myClick(dc.agreeButton);
        wait.until(ExpectedConditions.visibilityOf(dc.checked));
        dc.myClick(dc.proceedButton3);

    }

    @Then("When  The users click the buttons")
    public void whenTheUsersClickTheButtons(DataTable dt) {

        SoftAssert _softassert = new SoftAssert();
        Double actualTotal = 0.0;
        //hesap islemleri buraya...
        List<WebElement> listOfproducts = dc.totalPriceList;
        for (int i = 0; i < listOfproducts.size(); i++) {
            JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
            js.executeScript("arguments[0].scrollIntoView(true);", listOfproducts.get(i));
            Double product_Fee = Double.parseDouble(listOfproducts.get(i).getText().trim().replace("$", ""));

            actualTotal += (double) product_Fee;
        }

        System.out.println("actualTotal = " + actualTotal);

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", dc.totalProducs);
        wait.until(ExpectedConditions.visibilityOf(dc.totalProducs));
        Double total_payment = Double.parseDouble(dc.totalProducs.getText().trim().replace("$", ""));
        System.out.println("total_payment = " + total_payment);

        js.executeScript("arguments[0].scrollIntoView(true);", dc.totalShipping);
        wait.until(ExpectedConditions.visibilityOf(dc.totalShipping));
        Double total_shipping = Double.parseDouble(dc.totalShipping.getText().trim().replace("$", ""));
        System.out.println("total_shipping = " + total_shipping);

        js.executeScript("arguments[0].scrollIntoView(true);", dc.TOTAL);
        wait.until(ExpectedConditions.visibilityOf(dc.TOTAL));
        Double total_TOTAL = Double.parseDouble(dc.TOTAL.getText().trim().replace("$", ""));
        System.out.println("total_TOTAL = " + total_TOTAL);


        _softassert.assertEquals(total_TOTAL, (total_payment + total_shipping));

        int a = 0;
        List<String> list = dt.asList(String.class);
        for (int i = 0; i < list.size(); i++) {
            dc.myClick(dc.getWebElement(list.get(i)));

            if (a == 0) {

                System.out.println("mp.paypalMessage.getText() = " + dc.paypalMessage.getText());

                _softassert.assertTrue(dc.paypalMessage.getText().contains("try again"));
                GWD.getDriver().navigate().back();
            } else if (a == 1) {

                System.out.println("mp.creditCardMsg.getText() = " + dc.creditCardMsg.getText());
                _softassert.assertTrue(dc.creditCardMsg.getText().contains("Invalid"));
                GWD.getDriver().navigate().back();
            } else {

                System.out.println("mp.amount.getText() = " + dc.amount.getText());
                Double amount_Double = Double.parseDouble(dc.amount.getText().trim().replace("$", ""));
                _softassert.assertEquals(amount_Double, total_TOTAL);
                dc.myClick(dc.confirmButton);

                _softassert.assertTrue(dc.completeMessage.getText().contains("complete"));
            }
            a++;
            _softassert.assertAll();

        }
    }


}
