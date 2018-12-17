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
public class Logic {

    public static int InitialNumberOfHeads = 3;
    public static int AgeGroupFirst = 200;
    public static int AgeGroupSecond = 300;
    public static int NumberOfHeadsPerYearFirst = 3;
    public static int NumberOfHeadsPerYearSecond = 2;
    public static int NumberOfHeadsPerYearThird = 1;
    public static int NumberOfEyes = 2;

    public static int countAge(int age) {
        int numberOfHeadsResult;

        if (age <= 0) {
            numberOfHeadsResult = 0;
        } else if (age < 200) {
            numberOfHeadsResult = InitialNumberOfHeads + (age * NumberOfHeadsPerYearFirst);
        } else if (age < 300) {
            numberOfHeadsResult = (InitialNumberOfHeads + (AgeGroupFirst * NumberOfHeadsPerYearFirst)
                    + ((age - AgeGroupFirst) * NumberOfHeadsPerYearSecond));
        } else {
            numberOfHeadsResult = ((InitialNumberOfHeads + (AgeGroupFirst * NumberOfHeadsPerYearFirst))
                    + ((AgeGroupSecond - AgeGroupFirst) * NumberOfHeadsPerYearSecond)
                    + ((age - AgeGroupSecond) * NumberOfHeadsPerYearThird));

        }
        return numberOfHeadsResult;

    }

    public static int countEyes(int age) {
        int numberOfEyesResult = 0;
        if (age > 0) {
            numberOfEyesResult = Logic.countAge(age) * NumberOfEyes;
        }
        return numberOfEyesResult;
    }
}
