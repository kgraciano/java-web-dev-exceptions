package org.launchcode.exercises;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        Divide(0, 4);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        checkFileExtension(studentFiles.get("Brad"));

    }

    public static int Divide(int x, int y) {
        // Write code here!
        if (y == 0) {
            try {
                throw new ArithmeticException("Error! Cannot divide when y is zero.");
            } catch(ArithmeticException e) {
                e.printStackTrace();
            }
        }
        return x/y;
    }

    public static String checkFileExtension(String fileName) {
        int points = 0;
        if (fileName.contains(".java")) {
            points += 1;
        } else if (fileName.equals(null) || fileName.equals("")) {

            try {
                throw new ArithmeticException("Error! Please submit a file.");
            } catch(ArithmeticException e) {
                e.printStackTrace();
            }
            points = points - 1;

        }

        else if (!fileName.contains(".java")) {
            points += 0;
        }


         return "Points after submission: " + points;



    }


}
