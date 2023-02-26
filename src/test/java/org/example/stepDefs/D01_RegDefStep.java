package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_RegDefStep {

    P01_Register register = new P01_Register();
@Given("user go to register page")
    public void register()
{
    register.RegisterLink.click();
}


    @When("user click on gender")
    public void userClickOnGender()
    {
register.male.click();
    }


    @And("user type firstName&LastName")
    public void userTypeFirstNameLastName() throws InterruptedException {

        register.name.sendKeys("automation");
        register.lastN.sendKeys("tester");
       // Thread.sleep(2000);
    }

    @And("user choose his birthday")
    public void userChooseHisBirthday() throws InterruptedException {


        Select selectDay= new Select(register.day);
        selectDay.selectByValue("6");

        Select selectMonth = new Select(register.month);
        selectMonth.selectByValue("6");

        Select selectYear = new Select(register.year);
        selectYear.selectByValue("2000");
       // Thread.sleep(2000);

    }

    @And("user enter his email")
    public void userEnterHisEmail() throws InterruptedException {

        Faker faker = new Faker();
        String fakeAddress = faker.internet().safeEmailAddress();
    register.Email.sendKeys(fakeAddress);
        System.out.println(fakeAddress);
    //    Thread.sleep(2000);
    }


    @And("user enter password")
    public void userEnterPassword() throws InterruptedException {

    register.password.sendKeys("\"P@ssw0rd\"");
    //    Thread.sleep(2000);

    }


    @And("user enter confirmPass")
    public void userEnterConfirmPass() {
    register.ConfirmPassword.sendKeys("\"P@ssw0rd\"");
    }

    @And("user click on register button")
    public void userClickOnRegisterButton() throws InterruptedException {

        register.registerButton.click();
   //     Thread.sleep(2000);
    }

  @Then("user assert success register")
    public void userAssertSuccessRegister() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(register.regMass.getText().toLowerCase().contains("registration completed"));
        String actualC = register.regMass.getCssValue("color");
        System.out.println(Color.fromString(actualC).asHex());
        soft.assertEquals(Color.fromString(actualC).asHex(),"#4cb17c");

        soft.assertAll();


    }
}



