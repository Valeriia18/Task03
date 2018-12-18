/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task03two;

/**
 *
 * @author Алексей-Валерия
 */
public class Task03two {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x1 = UserInput.input("Enter x1: ");
        int x2 = UserInput.input("Enter x2: ");
        int x3 = UserInput.input("Enter x3: ");
        int y1 = UserInput.input("Enter y1: ");
        int y2 = UserInput.input("Enter y2: ");
        int y3 = UserInput.input("Enter y3: ");

        boolean result1 = Logic.isTrinagle(x1, y1, x2, y2, x3, y3);
        boolean result2 = Logic.isRectangularTriangle(x1, y1, x2, y2, x3, y3);

        if (result1 == false) {
            ConsolePrinter.print("This is not a triangle");
            return;
        } else if (result1 == true & result2 == true) {
            ConsolePrinter.print("This is a rectangular triangle");
        } else if (result1 == true & result2 == false) {
            ConsolePrinter.print("This is not a rectangular triangle");

        }
    }

}


