package com.brigelabz.userresistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        UserRegistration password = new UserRegistration();
        System.out.println("Enter Password Minimum 8 characters : ");
        String userPassword= scanner.nextLine();
        password.checkPasswordRuleSecond(userPassword);
    }
    public void checkPasswordRuleSecond(String userPassword){
        String regex = "^(?=.*[A-Z])(?=.*[a-z]).{8,}";
        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(userPassword);

        //checking valid or not
        if(matchChecker.matches()){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }

}
