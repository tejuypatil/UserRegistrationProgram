package com.brigelabz.userresistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterisedUserRegistrationTest {
    private  String email;
    private boolean expectedResult;
    private UserRegistrationMethods parameterUserRegistration;

public ParameterisedUserRegistrationTest(String email,boolean expectedResult){
    super();
    this.email = email;
    this.expectedResult = expectedResult;
}
@Before
    public void initialize(){
    parameterUserRegistration=new UserRegistrationMethods();
}
@Parameters
public static Collection input(){
    return Arrays.asList(new Object[][]{
            { "abc@yahoo.com.fbdf.cvb", false },
            { "abc-100@yahoo.com" ,false},
            { "abc.100@yahoo.com" , true },
            { "abc111@abc.net" , true },
            { "abc-100@abc.net" , true },
            { "abc.100@abc.com.au" , true },
            { "abc@1.com" , true },
            { "abc@gmail.com.com" , true },
            { "abc+100@gmail.com" , true },
    });

    }
    @Test
    public void checkEmailIsValidOrNot(){
        System.out.println("Email:" +this.expectedResult);
        Assert.assertEquals(this.expectedResult,parameterUserRegistration.checkEmailSamples(this.email));
    }
}

