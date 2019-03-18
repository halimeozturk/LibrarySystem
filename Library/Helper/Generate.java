package com.company.example.Library.Helper;

import java.util.Random;

public class Generate {

    private static String [] letter = new String [] {"a", "b", "c", "d", "e", "f", "g"};
    public static String generateId() {
        String body = "";
        Random rand1 = new Random();
        body = String.valueOf(rand1.nextInt(1000));

        try { body += letter[rand1.nextInt(7)];
        } catch (IndexOutOfBoundsException e) { System.err.println(e.getMessage());}

        body += String.valueOf(rand1.nextInt(1000));
        return body;
    }
}
