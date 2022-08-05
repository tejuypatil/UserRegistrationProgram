package com.brigelabz.userresistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationJunitTestCases {
    @Test
    public void TestFirstNameValidThenHAPPY()
    {
        UserRegistrationMethods check = new UserRegistrationMethods();
        String Result = check.checkFirstName("Tejaswini");
        Assert.assertEquals("HAPPY", Result);
    }@Test
    public void TestFirstNameValidThenSAD()
    {
        UserRegistrationMethods check = new UserRegistrationMethods();
        String Result = check.checkFirstName("tejaswini");
        Assert.assertEquals("SAD", Result);
    }
    @Test
    public void TestLastNameValidThenHAPPY()
    {
        UserRegistrationMethods check= new UserRegistrationMethods();
        String Result = check.checkLastName("Patil");
        Assert.assertEquals("HAPPY", Result);
    }
    @Test
    public void TestLastNameValidThenSAD()
    {
        UserRegistrationMethods check = new UserRegistrationMethods();
        String Result = check.checkLastName("gavas");
        Assert.assertEquals("SAD", Result);
    }

    @Test
    public void TestEmailNameValidThenHAPPY()
    {
        UserRegistrationMethods check = new UserRegistrationMethods();
        String Result = check.checkEmail("tejudpatil@gmail.com");
        Assert.assertEquals("HAPPY", Result);
    }
    @Test
    public void TestEmailNameValidThenSAD()
    {
        UserRegistrationMethods check= new UserRegistrationMethods();
        String Result = check.checkEmail("abc.xyzbridgelabz.c");
        Assert.assertEquals("SAD", Result);
    }

    @Test
    public void TestMobileValidThenHAPPY()
    {
        UserRegistrationMethods check= new UserRegistrationMethods();
        String Result = check.checkMobile("91 1234567890");
        Assert.assertEquals("HAPPY", Result);
    }
    @Test
    public void TestMobileValidThenSAD()
    {
        UserRegistrationMethods check= new UserRegistrationMethods();
        String Result = check.checkMobile("9 1234567890");
        Assert.assertEquals("SAD", Result);
    }
    @Test
    public void TestPasswordValidThenHAPPY()
    {
        UserRegistrationMethods check= new UserRegistrationMethods();
        String Result = check.checkPasswordRule("Sonu@123");
        Assert.assertEquals("HAPPY", Result);
    }
    @Test
    public void TestPasswordValidThenSAD()
    {
        UserRegistrationMethods checkObj= new UserRegistrationMethods();
        String Result = checkObj.checkPasswordRule("tejasw@123");
        Assert.assertEquals("SAD", Result);
    }
}
