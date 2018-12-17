/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task02one;

import java.util.Scanner;

/**
 *
 * @author Алексей-Валерия
 */
public class UserInput {
    private static final Scanner A = new Scanner (System.in);
    public static int input (String msg){
        System.out.println(msg);
       return A.nextInt();
    }
    
}
