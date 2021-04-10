package com.darksky.stepdefinitions;
import com.darksky.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSD {

    @Given("I am on the Home Page")
    public void iAmOnTheHomePage() {
        Assert.assertEquals("Dark Sky - 1 City Hall, New York, NY", HomePage.verifyTitle());
    }

    @When("I enter correct location in the location field")
    public void iEnterCorrectLocationInTheLocationField(){
        HomePage.enterlocation("11711 Wisteria Pond Way, Manassas, VA");
        //Assert.assertEquals("Dark Sky - 11711 Wisteria Pond Way, Manassas, VA", HomePage.verifyTitle());

    }


    @Then("I see the lowest and highest temp")
    public void iSeeTheLowestAndHighestTemp() {
        System.out.println(HomePage.gethightemp());
        System.out.println(HomePage.getlowtemp());
        Assert.assertEquals("Dark Sky - 11711 Wisteria Pond Way, Manassas, VA", HomePage.verifyTitle());

    }

}
