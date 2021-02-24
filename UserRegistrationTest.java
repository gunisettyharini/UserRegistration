package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    static UserRegistration person = new UserRegistration();
    @Test
    public void checkGivenFirstNameIsValidSouldRetuenTrue() { // Check if the pattern works for valid name
        try {
            Assert.assertEquals(true, person.isFirstNamevalid("Amit"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenFirstNameIsInvalidForlessThan3Characters() { // Checkif the pattern does not works for invalid name with less than 3 characters
        try {
            Assert.assertEquals(false, person.isFirstNamevalid("Ab"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenFirstNameisInvalidForFirstLetterLowerCase() { // Checks if there is no upper case in first Character
        try {
            Assert.assertEquals(false, person.isFirstNamevalid("amit"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenFirstNameisInvalidForNumericVAlues() { //Checks if there is Numeric Digits in Name
        try {
            Assert.assertEquals(false, person.isFirstNamevalid("Amit123"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenLastNameIsValid() { // Same as first name
        try {
            Assert.assertEquals(true, person.isLastNameValid("Amit"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenLastNameIsInvalidForlessThan3Characters() {
        try {
            Assert.assertEquals(false, person.isLastNameValid("Ab"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenLastNameisInvalidForFirstLetterLowerCase() {
        try {
            Assert.assertEquals(false, person.isLastNameValid("amit"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenLastNameisInvalidForNumericVAlues() {
        try {
            Assert.assertEquals(false, person.isLastNameValid("Amit123"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenEmailisValid() { // Checks for valid email
        try {
            Assert.assertEquals(true, person.isEmailValid("abc.xyz@gmail.com"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenEmailisInvalid() { // Checks for invalid email
        try {
            Assert.assertEquals(false, person.isEmailValid("abc..xyz@gmail.com"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenMobileNumberisValid() { // Checks For valid number
        try {
            Assert.assertEquals(true, person.isMobileNumberValid("91 8210029078"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenMobileNumberisInvalidWithoutSpace() { // Checks the space between country code and the number
        try {
            Assert.assertEquals(false, person.isMobileNumberValid("918210029078"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenMobileNumberisInvalidWithLessThan10Digits() { // Checks for less than 10 digits in number after country code
        try {
            Assert.assertEquals(false, person.isMobileNumberValid("91 8210078"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenMobileNumberisInvalidWithNot91InFirsttwoPlaces() { // checks for country code other than 91
        try {
            Assert.assertEquals(false, person.isMobileNumberValid("52 8210029078"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenMobileNumberisInvalidWithFirstCharacterAfterSpaceIsLessThan() { // checks for first number after country code is more than 6
        try {
            Assert.assertEquals(false, person.isMobileNumberValid("91 4210029078"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenPasswordIsValid() { // checks for valid password
        try {
            Assert.assertEquals(true, person.isPasswordValid("Asad@12Sad"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenPasswordISInvalidforLessThan8Characters() { //checks for password less than 8 characters
        try {
            Assert.assertEquals(false, person.isPasswordValid("Ad@12S"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenPasswordISInvalidforNoUpperCaseCharacter() { // checks for password  with no upper case
        try {
            Assert.assertEquals(false, person.isPasswordValid("asd@12dffgd"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenPasswordISInvalidforNoLowercaseCaracters() { // checks for password  with no lower case
        try {
            Assert.assertEquals(false, person.isPasswordValid("ASFG@2512S"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenPasswordISInvalidforNoSpecialCharacters() { //checks for password with no special characters
        try {
            Assert.assertEquals(false, person.isPasswordValid("AdjgdsS512S"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
}
