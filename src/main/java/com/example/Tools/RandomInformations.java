package com.example.Tools;

import com.example.repository.isEXISTE_AccountNumber;

import java.security.SecureRandom;
import java.sql.SQLException;

public class RandomInformations {

    
    public static String RandomPassword(int len) {

        // ASCII range - alphanumeric (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuffer passrowd = new StringBuffer();
        // each iteration of loop choose a character randomly from the given ASCII range
        // and append it to StringBuilder instance
        for (int i = 0; i < len; i++) {
            int randomIndex = random.nextInt(chars.length());
            passrowd.append(chars.charAt(randomIndex));
        }
        return passrowd.toString();
    }


    public static Long[] RandomAccountNumber() throws SQLException {

        // ASCII range - alphanumeric (0-9, a-z, A-Z)
        final String chars = "0123456789";
        SecureRandom random = new SecureRandom();
        StringBuffer accountNumber = new StringBuffer();
        StringBuffer cvc = new StringBuffer();
        // each iteration of loop choose a character randomly from the given ASCII range
        // and append it to StringBuilder instance
        for (int i = 0; i < 16; i++) {
            int randomIndex = random.nextInt(chars.length());
            accountNumber.append(chars.charAt(randomIndex));
            if(i > 12){
                cvc.append(chars.charAt(randomIndex));
            }
        }
        //convert the string result into Long
        Long num = Long.parseLong(accountNumber.toString());
        //check if this number is existe in the DB
        //if it is exist we Recurse this method
        if (isEXISTE_AccountNumber.isExist(num)){
            return RandomInformations.RandomAccountNumber();
        }
        return new Long[]{num,Long.parseLong(cvc.toString()) };
    }
}
