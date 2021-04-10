package com.darksky.stepdefinitions;

import com.darksky.base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setup(){
        BasePage.initializeDriver();
    }

    @After
    public void teardown(){
        BasePage.tearDown();
    }



}
