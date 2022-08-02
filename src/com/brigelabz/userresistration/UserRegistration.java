package com.brigelabz.userresistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        UserRegistration newName = new UserRegistration();

        System.out.println("Enter Email : ");
        String email = scanner.nextLine();
        newName.checkEmail(email);
    }
    public void checkEmail(String emailId){
        String regex ="^[a-z0-9]{3,}+([_+-.][a-z0-9]+)?(@[a-z0-9]+)([.][a-z]{2,4})([.][a-z]{2})?$";


        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(emailId);

        //checking valid or not
        if(matchChecker.matches()){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid Email");
        }
    }

}
