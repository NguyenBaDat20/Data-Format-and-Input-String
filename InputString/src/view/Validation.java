/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validation {

    Scanner in = new Scanner(System.in);

    public boolean find_square_number(int n) {
        boolean check = false;
        int i = 0;
        while (i <= n) {
            if (Math.pow(i, 2) == n) {
                check = true;
                break;
            }
            i++;
        }
        return check;
    }

    public String getValue(String msg) {
        System.out.print(msg);
        return in.nextLine();
    }

    public void getNumberAndCharacter(String inputString) {
        HashMap<String, ArrayList<Integer>> hashMapNumber = new HashMap<>();
        String number = inputString.replaceAll("\\D+", ",");
        if (number.charAt(0) == ',') {
            number = number.substring(1);
        }
        if (number.charAt(number.length() - 1) == ',') {
            number = number.substring(0, number.length() - 1);
        }
        String[] listNumber = number.split(",");
        int lenNumber = listNumber.length;

        ArrayList<Integer> liPerfectSquare = new ArrayList<>();
        ArrayList<Integer> liOdd = new ArrayList<>();
        ArrayList<Integer> liEven = new ArrayList<>();
        ArrayList<Integer> liAll = new ArrayList<>();
        for (int i = 0; i < lenNumber; i++) {
            int numberCheck = Integer.parseInt(listNumber[i]);
            if (numberCheck % 2 == 1) {
                liOdd.add(numberCheck);
            }
            if (numberCheck % 2 == 0) {
                liEven.add(numberCheck);
            }
            if (find_square_number(numberCheck)) {
                liPerfectSquare.add(numberCheck);
            }
            liAll.add(numberCheck);
        }
        hashMapNumber.put("Perfect Square Numbers: ", liPerfectSquare);
        hashMapNumber.put("Odd Numbers: ", liOdd);
        hashMapNumber.put("Even Numbers: ", liEven);
        hashMapNumber.put("All Numbers: ", liAll);

        for (Map.Entry m : hashMapNumber.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        HashMap<String, String> hashMapString = new HashMap<>();
        String uppercase = inputString.replaceAll("\\W|[0-9]|[a-z]", "");
        String lowercase = inputString.replaceAll("\\W|[0-9]|[A-Z]", "");
        String special = inputString.replaceAll("\\w", "");
        String allCharacter = inputString.replaceAll("[0-9]", "");
        hashMapString.put("Uppercase: ", uppercase);
        hashMapString.put("Lowercase: ", lowercase);
        hashMapString.put("Special: ", special);
        hashMapString.put("All Character: ", allCharacter);
        for (Map.Entry m : hashMapString.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
