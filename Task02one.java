/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task02one;

/**
 *
 * @author Алексей-Валерия
 */
public class Task02one {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int age = UserInput.input("Enter Dragon's age: ");
       int resultHeads = Logic.countAge(age);
       int resultEyes = Logic.countEyes(age);
       ConsolePrinter.print("\n Number of heads of entered Dragon is: " + resultHeads + "\n Number of eyes of entered Dragon is: " + resultEyes);
    }
    
}
