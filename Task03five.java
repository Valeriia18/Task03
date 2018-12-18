/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task03five;

/**
 *
 * @author Алексей-Валерия
 */
public class Task03five {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day = UserInput.print("Enter day: ");
        int month = UserInput.print("Enter month: ");
        int year = UserInput.print("Enter year: ");
        String result = Logic.calculateTomorrow(day, month, year);
        ConsolePrinter.print("Tomorrow date: " + result);
        
        
    }
    
}
