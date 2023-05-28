package com.bridgelabz.userRegex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegexUC3 {
    public String FirstName(String name) {
        String regex = "[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return name;
        }
        String fail = "No match found, Please Enter correct validations for name...";
        return fail;
    }
    public String email(String email){
        String regex = "[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            return email;
        }
        String fail = "No match found, Please Enter correct validations for Email...";
        return fail;
    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION PROGRAM USING REGEX");
        Scanner scan = new Scanner(System.in);
        UserRegistration obj = new UserRegistration();

        String firstName;
        System.out.println("Enter the first name, Start with capital letter and has min 3 letter :-");
        firstName = scan.next();
        String res = obj.FirstName("First Name is:-" +firstName);
        System.out.println(res);

        String lastName;
        System.out.println("Enter the last name, Start with capital letter and has min 3 letter :-");
        lastName = scan.next();
        String lastname = obj.FirstName(lastName);
        System.out.println("Last Name is:- "+lastName);

        String emailId;
        System.out.println("Enter your email Id");
        emailId = scan.next();
        String email = obj.email(emailId);
        System.out.println("Email Id is :- "+email);
    }
}
