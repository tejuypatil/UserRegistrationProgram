package com.brigelabz.userresistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMethods {
    public String checkFirstName(String firstName)
    {
        String regex = "[A-Z]{1}[a-z]{2,}";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(firstName);

        if(matchChecker.matches()) {
            System.out.println("Valid First Name");
            return "true";
        }
        else
        {
            System.out.println("InValid First Name");
            return "false";
        }
    }
    public String checkLastName(String lastName) {
        String regex = "[A-Z]{1}[a-z]{2,}";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(lastName);

        if (matchChecker.matches())
        {
            System.out.println("Valid Last Name");
            return "true";
        }
        else
        {
            System.out.println("InValid Last Name");
            return "false";
        }
    }
    public String checkEmail(String emailId)
    {
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]+)?(@[a-z0-9]+)([.][a-z]{2,4})([.][a-z]{2})?$";
        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(emailId);

        if(matchChecker.matches())
        {
            System.out.println("Valid Email");
            return "true";
        }
        else
        {
            System.out.println("InValid Email");
            return "false";
        }
    }
    public String checkMobile(String mobileNumber)
    {
        String regex = "^[0-9]{2}[ ][0-9]{10}$";
        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(mobileNumber);

        if(matchChecker.matches()) {
            System.out.println("Valid Mobile Number");
            return "true";
        }
        else {
            System.out.println("InValid Mobile Number");
            return "false";
        }
    }
    public String checkPasswordRule(String passWord) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:;<>?/~_+-=|\\]]).{8,}$";
        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(passWord);

        if (matchChecker.matches()) {
            System.out.println("Valid Password");
            return "true";
        }
        else {
            System.out.println("InValid Password");
            return "false";
        }
    }
    public boolean checkEmailSamples(String email)
    {
        String regex = "^abc[a-zA-Z0-9.+-]*@[a-z0-9]*[.][a-z]{2,5}[.,a-z]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
        {
            System.out.println("Entered Email Sample is Valid");
            return true;
        } else
        {
            System.out.println("Entered Email Sample is Invalid");
            return false;
        }
    }
}
