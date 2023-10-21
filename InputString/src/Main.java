
import view.Validation;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Validation v = new Validation();
        String input =v.getValue("Input String:");
        v.getNumberAndCharacter(input);
 //       v.getNumberAndCharacter("321sdhkjDFGH!@#$%^22fdsf3");

}
}
