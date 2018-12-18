/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task03four;

/**
 *
 * @author Алексей-Валерия
 */
public class Task03four {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int randomNumber = Logic.generateNumber();
        ConsolePrinter.print("Your mood today is generated: " + Logic.switchEmoji(randomNumber));

    }

}
