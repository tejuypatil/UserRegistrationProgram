package com.brigelabz.userresistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        UserRegistrationMethods check = new UserRegistrationMethods();

        System.out.println("Enter First Name:-");
        String FirstName = scanner.nextLine();
        check.checkFirstName(FirstName);

        System.out.println("Enter Last Name:-");
        String LastName = scanner.nextLine();
        check.checkLastName(LastName);

        System.out.println("Enter Email:-");
        String email = scanner.nextLine();
        check.checkEmail(email);

        System.out.println("Enter Mobile Number:-");
        String mobileNumber = scanner.nextLine();
        check.checkMobile(mobileNumber);

        System.out.println("Enter Password :-");
        String passWord =scanner.nextLine();
        check.checkPasswordRule(passWord);
    }
}


