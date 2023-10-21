package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckDateFormat {

    Scanner sc = new Scanner(System.in);

    public String getValue(String mes) {
        System.out.print(mes);
        return sc.nextLine();
    }

    public void checkPhone(String input) {

        while (true) {
            String temp = input.trim();

            if (temp.length() != 10) {
                System.out.println("Must Be 10 Digits");
                input = sc.nextLine();
                continue;
            }

            String subStr1 = temp.substring(0, 10);
            boolean isAllDigits = true;

            for (int i = 0; i < subStr1.length(); i++) {
                if (subStr1.charAt(i) < '0' || subStr1.charAt(i) > '9') {
                    isAllDigits = false;
                    break;
                }
            }

            if (!isAllDigits) {
                System.out.println("Must Be Numbers Only");
                input = sc.nextLine();
                continue;
            }
            break;
        }
    }

    public boolean checkRealDay(String input) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            Date date = dateFormat.parse(input);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
//------------------------------------------------------------------------------

    public void checkDay(String input) throws Exception {
        String format = "\\d{2}[/]\\d{2}[/]\\d{4}";
        while (true) {
            boolean check = checkRealDay(input);
            boolean check1 = input.matches(format);
            String temp = input.trim();
            if (temp == null || temp.length() != 10 || check1 == false || check == false) {
                System.out.println("Date To Correct Format(dd/mm/yyyy)");
                input = sc.nextLine();
                continue;
            }
            break;
        }
    }

    public void checkEmail(String input) throws Exception {
        String email = "^[a-zA-Z][\\w]+@gmail\\.com$";
        while (true) {
            boolean valid = input.matches(email);
            if (valid == false) {
                System.out.println("Email Must Is Correct Format");
                input = sc.nextLine();
                continue;
            }
            break;
        }
    }
}
