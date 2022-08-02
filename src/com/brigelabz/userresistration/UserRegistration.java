package com.brigelabz.userresistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        UserRegistration mobileNo = new UserRegistration();
        System.out.println("Enter Mobile Number : ");
        String mobileNumber = scanner.nextLine();
        mobileNo.checkMobileNumber(mobileNumber);
    }
    public void checkMobileNumber(String mobileNumber){
        String regex = "^[0-9]{2}[ ][0-9]{10}$";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(mobileNumber);

        //checking valid or not
        if(matchChecker.matches()){
            System.out.println("Valid Mobile Number");
        }
        else{
            System.out.println("Invalid Mobile Number");
        }
    }

}
