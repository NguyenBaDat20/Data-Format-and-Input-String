
import common.CheckDateFormat;

public class Main {

    public static void main(String[] args) throws Exception {
        CheckDateFormat check = new CheckDateFormat();
        System.out.println("================== Validate Program ==================");
        check.checkPhone(check.getValue("Phone Number: "));
        check.checkEmail(check.getValue("Email: "));
        check.checkDay(check.getValue("Date: "));
    }
}
