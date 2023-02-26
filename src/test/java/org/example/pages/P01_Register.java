package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class P01_Register {

public P01_Register()
{
    PageFactory.initElements(Hooks.driver,this);

}
@FindBy(className = "ico-register")
    public WebElement RegisterLink;

@FindBy(id = "gender-male")
    public WebElement male;
@FindBy(id = "FirstName")
    public WebElement name;
@FindBy(id = "LastName")
    public WebElement lastN;
@FindBy(name = "DateOfBirthDay")
    public WebElement day;
@FindBy(name = "DateOfBirthMonth")
    public WebElement month;
@FindBy(name = "DateOfBirthYear")
    public WebElement year;
@FindBy(id = "Email")
    public WebElement Email;
@FindBy(id = "Password")
    public WebElement password;
@FindAll({
        @FindBy(id = "ConfirmPassword"),
        @FindBy(name = "ConfirmPassword")
})
    public WebElement ConfirmPassword;
@FindBy(how = How.ID, using = "register-button")
    public WebElement registerButton;
@FindBy(className = "result")
   public WebElement regMass;





}
