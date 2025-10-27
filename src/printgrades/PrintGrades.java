/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printgrades;

import java.util.Scanner;

/**This class takes String input grade code a+,a,b,c from user 
 * and calls method gradeDetail to print the 
 * grades: Excellent,Very good,Good and Satisfactory.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enum which avoids String input 
 * then print the grade details. 
 * @author srinivsi 
 */

public class PrintGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
      {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the student grade code (A_PLUS_) in string");
    String input = in.next().toUpperCase();

        Grades t = new Grades();
        try {
            Grades.Grade grade = Grades.Grade.valueOf(input);
            t.gradeDetail(grade);
        } catch (IllegalArgumentException e) {
            t.gradeDetail(Grades.Grade.INVALID);
        }
      } 
}
