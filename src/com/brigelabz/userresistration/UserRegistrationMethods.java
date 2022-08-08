package com.brigelabz.userresistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMethods {
    public boolean checkFirstName(String firstName) throws UserRegistrationException
    {
        try
        {
            if (firstName.isEmpty() )
            {
                throw new UserRegistrationException("! Enter Value Is Empty !" ,
                        UserRegistrationException.ExceptionType.EmptyEnter);
            }
            //------------Regex------------------
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern patternChecker = Pattern.compile(regex);
            Matcher matchChecker = patternChecker.matcher(firstName);

            //-------------Check valid or Not-----
            if(matchChecker.matches())
                System.out.println(" * Valid First Name * ");
            else
                System.out.println(" * InValid First Name * ");
            return matchChecker.matches();
        }
        catch (NullPointerException exception)
        {
            throw new UserRegistrationException(" ! Enter null ! ",
                    UserRegistrationException.ExceptionType.NullEnter);
        }
    }

    public boolean checkLastName(String lastName)throws UserRegistrationException
    {
        try {
            if (lastName.isEmpty())
            {
                throw new UserRegistrationException("! Enter Value Is Empty !",
                        UserRegistrationException.ExceptionType.EmptyEnter);
            }
            //------------Regex------------------
            String regex = "^[A-Z]{1}[a-z]{2,}$";

            Pattern patternChecker = Pattern.compile(regex);
            Matcher matchChecker = patternChecker.matcher(lastName);

            //-------------Check valid or Not-----
            if (matchChecker.matches())
                System.out.println(" * Valid Last Name * ");
            else
                System.out.println(" * InValid Last Name * ");
            return matchChecker.matches();
        }
        catch (NullPointerException exception)
        {
            throw new UserRegistrationException(" ! Enter null ! ",
                    UserRegistrationException.ExceptionType.NullEnter);
        }
    }

    public boolean checkEmail(String emailId)throws UserRegistrationException
    {

        try {
            if (emailId.isEmpty())
            {
                throw new UserRegistrationException("! Enter Value Is Empty !",
                        UserRegistrationException.ExceptionType.EmptyEnter);
            }

            //------------Regex------------------
            String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]+)?(@[a-z0-9]+)([.][a-z]{2,4})([.][a-z]{2})?$";
            Pattern patternChecker = Pattern.compile(regex);
            Matcher matchChecker = patternChecker.matcher(emailId);

            //-------------Check valid or Not-----
            if(matchChecker.matches())
                System.out.println(" * Valid Email * ");
            else
                System.out.println(" * InValid Email * ");
            return matchChecker.matches();
        }
        catch (NullPointerException exception)
        {
            throw new UserRegistrationException(" ! Enter null ! ",
                    UserRegistrationException.ExceptionType.NullEnter);
        }
    }

    public boolean checkMobile(String mobileNumber)throws UserRegistrationException
    {
        try {
            if (mobileNumber.isEmpty())
            {
                throw new UserRegistrationException("! Enter Value Is Empty !",
                        UserRegistrationException.ExceptionType.EmptyEnter);
            }
            //------------Regex------------------
            String regex = "^[0-9]{2}[ ][0-9]{10}$";
            Pattern patternChecker = Pattern.compile(regex);
            Matcher matchChecker = patternChecker.matcher(mobileNumber);

            //-------------Check valid or Not-----
            if(matchChecker.matches())
                System.out.println(" * Valid Mobile Number * ");
            else
                System.out.println(" * InValid Mobile Number * ");
            return matchChecker.matches();
        }
        catch (NullPointerException exception)
        {
            throw new UserRegistrationException(" ! Enter null ! ",
                    UserRegistrationException.ExceptionType.NullEnter);
        }
    }

    public boolean checkPasswordRule(String passWord)throws UserRegistrationException
    {

        try {
            if (passWord.isEmpty())
            {
                throw new UserRegistrationException("! Enter Value Is Empty !",
                        UserRegistrationException.ExceptionType.EmptyEnter);
            }

            //------------Regex------------------
            String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:;<>?/~_+-=|\\]]).{8,}$";
            Pattern patternChecker = Pattern.compile(regex);
            Matcher matchChecker = patternChecker.matcher(passWord);

            //-------------Check valid or Not-----
            if(matchChecker.matches())
                System.out.println(" * Valid Password * ");
            else
                System.out.println(" * InValid Password * ");
            return matchChecker.matches();
        }
        catch (NullPointerException exception)
        {
            throw new UserRegistrationException(" ! Enter null ! ",
                    UserRegistrationException.ExceptionType.NullEnter);
        }
    }
}
