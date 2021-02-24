package com.userregistration;


import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean isFirstNamevalid(String firstName) throws UserRegistrationException {

         if(Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName))
             return true;
         else
             throw new UserRegistrationException("Invalid First Name");
    }
    public static boolean isLastNameValid(String lastName) throws UserRegistrationException {
        if(Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", lastName))
            return true;
        else
            throw new UserRegistrationException("Invalid Last Name");
    }
    public static boolean isEmailValid(String email) throws UserRegistrationException {
        if(Pattern.matches("^[a-zA-Z0-9]{3,}([\\.\\+\\-]?[a-zA-Z0-9]{3,})?[@][A-Za-z0-9]{1,}[.][A-Za-z]{2,4}[,]?([.][A-Za-z]{2,4}[.]?)?$", email))
            return true;
        else
            throw new UserRegistrationException("Invalid Email");

    }
    public static boolean isMobileNumberValid(String mobile) throws UserRegistrationException {
        if(Pattern.matches("^[9][1][\\s][6-9][0-9]{9}$", mobile))
            return true;
        else
            throw new UserRegistrationException("Invalid Mobile Number");
    }
    public static boolean isPasswordValid(String password) throws UserRegistrationException {
        if(Pattern.matches("^(?=.*[\\@\\#\\$\\%\\&\\_\\,\\.])(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8,}$", password))
            return true;
        else
            throw new UserRegistrationException("Invalid Password");
    }
    public static void main(String[] args) {
        String firstName = "amit";
        String lastName = "Maharana";
        String email = "abc.xyz@gmail.com";
        String mobile = "91 8210029078";
        String password = "Ahjgsd45@fj";
        UserRegistration person = new UserRegistration();
        try {
            isFirstNamevalid(firstName);
        }catch(Exception e) {System.out.println("Exception occured is " + e);}
        try {
            isLastNameValid(lastName);
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
        try {
            isEmailValid(email);
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
        try {
            isMobileNumberValid(mobile);
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
        try {
            isPasswordValid(password);
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
}
