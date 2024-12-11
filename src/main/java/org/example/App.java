package org.example;

import static org.example.PasswordGenerator.generatePassword;

public class App 
{
    public static void main(String[] args) {
        int passwordLength = 12;
        String generatedPassword = generatePassword(passwordLength);
        System.out.println("Згенерований пароль: " + generatedPassword);
    }
}
