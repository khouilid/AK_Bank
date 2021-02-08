package com.example.Tools;

import java.security.SecureRandom;

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
}
