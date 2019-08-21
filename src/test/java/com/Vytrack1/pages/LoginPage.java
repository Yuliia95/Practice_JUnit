package com.Vytrack1.pages;

import com.Vytrack1.utilities.Driver;
import com.Vytrack1.utilities.Vytrack1_data;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id = "prependedInput")
    public WebElement username;
    @FindBy(id = "prependedInput2")
    public WebElement password;
    @FindBy(id = "_submit")
    public WebElement submittBottom;

    public void Login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password+ Keys.ENTER);
    }
    public void login(String user){
        if(user.equalsIgnoreCase("driver")){
            this.username.sendKeys(Vytrack1_data.get("username_driver"));
            this.password.sendKeys(Vytrack1_data.get("password")+Keys.ENTER);
        }else if(user.equalsIgnoreCase("salesmanager")){
            this.username.sendKeys(Vytrack1_data.get("username_salesmanager"));
            this.password.sendKeys(Vytrack1_data.get("password")+Keys.ENTER);
        }else if(user.equalsIgnoreCase("storemanager")){
            this.username.sendKeys(Vytrack1_data.get("username_storemanager"));
            this.password.sendKeys(Vytrack1_data.get("password")+Keys.ENTER);
        }else{
            this.username.sendKeys(Vytrack1_data.get("username_driver"));
            this.password.sendKeys(Vytrack1_data.get("password")+Keys.ENTER);
        }
        }
    }

