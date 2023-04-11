package com.stepdefination;

import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void preCondition() {
        System.out.println("start the process");

    }
    @After
    public void postconditions(){
        System.out.println("ended the process");

    }
}
