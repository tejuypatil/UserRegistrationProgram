package com.brigelabz.userresistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMethods {
    public void checkFirstName(String firstName)
    {
        String regex = "[A-Z]{1}[a-z]{2,}";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(firstName);

        if(matchChecker.matches())
            System.out.println("Valid First Name");
        else
            System.out.println("InValid First Name");
    }

    public void checkLastName(String lastName)
    {
        String regex = "[A-Z]{1}[a-z]{2,}";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(lastName);

        if(matchChecker.matches())
            System.out.println("Valid Last Name");
        else
            System.out.println("InValid Last Name");
    }

    public void checkEmail(String emailId)
    {
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]+)?(@[a-z0-9]+)([.][a-z]{2,4})([.][a-z]{2})?$";
        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(emailId);

        if(matchChecker.matches())
            System.out.println("Valid Email");
        else
            System.out.println("InValid Email");
    }

    public void checkMobile(String mobileNumber)
    {
        String regex = "^[0-9]{2}[ ][0-9]{10}$";
        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(mobileNumber);

        if(matchChecker.matches())
            System.out.println("Valid Mobile Number");
        else
            System.out.println("InValid Mobile Number");
    }
    public void checkPasswordRule(String passWord)
    {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:;<>?/~_+-=|\\]]).{8,}$";
        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(passWord);

        if(matchChecker.matches())
            System.out.println("Valid Password");
        else
            System.out.println("InValid Password");
    }

}
