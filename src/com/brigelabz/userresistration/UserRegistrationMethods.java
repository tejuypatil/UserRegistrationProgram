package com.brigelabz.userresistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//---------Functional Interface for lambda--------//
@FunctionalInterface
interface UserAccess{
    boolean matchChecker(String pattern,String name);
}
public class UserRegistrationMethods {
    //-------User Registration Pattern-----------//
    String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    String emailPattern ="^[a-z0-9]{3,}+([_+-.][a-z0-9]+)?(@[a-z0-9]+)([.][a-z]{2,4})([.][a-z]{2})?$";
    String mobilePattern = "^[0-9]{2}[ ][0-9]{10}$";
    String passwordPattern ="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:;<>?/~_+-=|\\]]).{8,}$";

    //-----------Lambda Function--------------------------//
    UserAccess userAccess = Pattern::matches;
   // UserAccess userAccess = (String pattern,String name) -> Pattern.matches(pattern,name)

    public boolean checkFirstName(String firstName)throws UserRegistrationException {
        try {
            if (firstName.isEmpty())
                throw new UserRegistrationException("! Enter Value Is Empty!", UserRegistrationException.ExceptionType.EmptyEnter);
            {
                if (userAccess.matchChecker(firstNamePattern, firstName))
                    System.out.println("*Valid First Name *");
                else
                    System.out.println("* Invalid First Name *");
                return userAccess.matchChecker(firstNamePattern, firstName);
            }

        } catch (NullPointerException exception) {
            throw new UserRegistrationException("! Enter null !",UserRegistrationException.ExceptionType.NullEnter);
        }
    }
    public boolean checkLastName(String lastName)throws UserRegistrationException
    {
        try {
            if (lastName.isEmpty())throw new UserRegistrationException("! Enter Value Is Empty !", UserRegistrationException.ExceptionType.EmptyEnter);
            {
                //-------------Check valid or Not-----
                if (userAccess.matchChecker(lastNamePattern, lastName))
                    System.out.println(" * Valid Last Name * ");
                else
                    System.out.println(" * InValid Last Name * ");
                return userAccess.matchChecker(lastNamePattern, lastName);
            }
        }
        catch (NullPointerException exception)
        {
            throw new UserRegistrationException(" ! Enter null ! ", UserRegistrationException.ExceptionType.NullEnter);
        }
    }

    public boolean checkEmail(String emailId)throws UserRegistrationException
    {

        try {
            if (emailId.isEmpty())throw new UserRegistrationException("! Enter Value Is Empty !", UserRegistrationException.ExceptionType.EmptyEnter);
            {
                //-------------Check valid or Not-----
                if (userAccess.matchChecker(emailPattern,emailId))
                    System.out.println(" * Valid Email Address * ");
                else
                    System.out.println(" * InValid Email Address * ");
                return userAccess.matchChecker(emailPattern,emailId);
            }
        }
        catch (NullPointerException exception)
        {
            throw new UserRegistrationException(" ! Enter null ! ",UserRegistrationException.ExceptionType.NullEnter);
        }
    }

    public boolean checkMobile(String mobileNumber)throws UserRegistrationException
    {
        try {
            if (mobileNumber.isEmpty())throw new UserRegistrationException("! Enter Value Is Empty !",UserRegistrationException.ExceptionType.EmptyEnter);
            {
                //-------------Check valid or Not-----
                if (userAccess.matchChecker(mobilePattern,mobileNumber))
                    System.out.println(" * Valid Mobile Number * ");
                else
                    System.out.println(" * InValid Mobile Number * ");
                return userAccess.matchChecker(mobilePattern,mobileNumber);
            }
        }
        catch (NullPointerException exception)
        {
            throw new UserRegistrationException(" ! Enter null ! ",UserRegistrationException.ExceptionType.NullEnter);
        }
    }

    public boolean checkPasswordRule(String passWord)throws UserRegistrationException
    {

        try {
            if (passWord.isEmpty())throw new UserRegistrationException("! Enter Value Is Empty !", UserRegistrationException.ExceptionType.EmptyEnter);
            {
                //-------------Check valid or Not-----
                if (userAccess.matchChecker(passwordPattern,passWord))
                    System.out.println(" * Valid Mobile Number * ");
                else
                    System.out.println(" * InValid Mobile Number* ");
                return userAccess.matchChecker(passwordPattern,passWord);
            }
        }
        catch (NullPointerException exception)
        {
            throw new UserRegistrationException(" ! Enter null ! ",
                    UserRegistrationException.ExceptionType.NullEnter);
        }
    }
}


