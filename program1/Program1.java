/*
*****************************************************************************
*                                                                           *
*              Programmer:            Bryan C Deem                          *
*              Program Number         Number One                            *
*              Class:                 IS251 Introduction to JAVA Programming*
*              Instructor:            David Wilke                           *
*              Start Date             28 August 2013                        *
*              Due Date:              4 September 2013                      *
*                                                                           *
*              This program will display my name, school major ,            *
*              and the cost I paid for the JAVA textbook using a            *
*              decimal point. The lucky number and book cost should become  *
*              constant variables and within the program.                   *
*                                                                           *
*                                                                           *
*****************************************************************************
 */
package program1;
/*
        ******************************
        *                            *
        *           Import           *
        *                            *
        ****************************** 
 */
import java.text.*;
import javax.swing.JOptionPane;

public class Program1 {
/*
 *****************************************************************************
 *                                                                           *
 *                                 Main                                      *
 *                                                                           *
 *****************************************************************************
 */
    
    public static void main(String[] args) 
    {
        /*
         *******************************
         *                             *
         *     Allocating Variables    *
         *                             *
         ******************************* 
         */
        double bookCostD         = 0.0,
               finalCostD        = 0.0,
               totalInterestRate = 0.0;
        
        String studentNameS           = " ",
               studentDegeeS          = " ",
               studentBookCostS       = " ",
               headerStudentNameS     = "Student Name",
               headerDegeeProgramS    = "Degee Program",
               headerBookCostS        = "Book Cost",
               headerFinalCostS       = "Final Cost";
                
        /*
         ******************************
         *                            *
         *       Decimal Format       *
         *                            *
         ****************************** 
         */
        DecimalFormat df = new DecimalFormat ("#.##");
        /*
         ******************************
         *                            *
         *      Constant Variable     *
         *                            *
         ****************************** 
         */
        final double Interest_Rate_FD = 0.07;
        /*
         ******************************
         *                            *
         *      Dialog Input Box      *
         *                            *
         ****************************** 
         */
        
        studentNameS   = JOptionPane.showInputDialog("Enter your full name.");
        
        studentDegeeS  = JOptionPane.showInputDialog("Enter in your Degree.");
        
        studentBookCostS = JOptionPane.showInputDialog("Enter in the cost of "
                + "your JAVA book.");
        
        bookCostD = Double.parseDouble(studentBookCostS);
        
        /*
         ******************************
         *                            *
         *    Show Message Dialog     *
         *                            *
         ****************************** 
         */

        JOptionPane.showMessageDialog(null, "Thank you "+ studentNameS + 
                "\n The printed results are displayed to the Screen");
        /*
         ******************************
         *                            *
         *      Processing Phase      *
         *                            *
         ****************************** 
         */
        totalInterestRate = Interest_Rate_FD * bookCostD;
        
        finalCostD = totalInterestRate + bookCostD;
        
        finalCostD = Math.round(finalCostD * 100);
        
        finalCostD = finalCostD / 100;
        
        /*
         *******************************
         *                             *
         *     Allocating Variables    *
         *                             *
         ******************************* 
         */
        
        String dollarCostSignBookCostS = "$" + bookCostD,
               dollarCostSignFinalCostS= "$" + finalCostD ;
        
        /*
         *******************************
         *                             *
         *       Output Display        *
         *                             *
         ******************************* 
         */
        
        System.out.print("\t\tMy Name is " + studentNameS + " and my Degee"+ 
                "Program\n");
        System.out.print("\tat St. Louis Community College is "+ studentDegeeS 
                + ".\n");
        
         System.out.print("\tIm using the new Java Book at a cost of"+ 
                 bookCostD + ". The\n");
        
        System.out.printf("\ttotal cost of the book with sales tax is %.2f"
                + ".\n\n", finalCostD);
        
        System.out.format("\t\t%15s \t%15s \t%15s \t%15s\n",headerStudentNameS
                ,headerDegeeProgramS,headerBookCostS,headerFinalCostS);
        
        System.out.format("\t\t%15s \t%15s \t%15s \t%15s\n\n\t",studentNameS,
              studentDegeeS,dollarCostSignBookCostS,dollarCostSignFinalCostS);
        
        System.exit(0);
        
        
        
        
        
        
    }
}
