/*
               Programmer:            Bryan C Deem                          
               Program Number         Number Two                            
               Class:                 IS251 Introduction to JAVA Programming
               Instructor:            David Wilke                           
               Start Date             11 September 2013                      
               Due Date:              23 September 2013                     
                                                                           
              This program will calculate the area of a Circle,            
              Rectangle, Triangle, Square, or a Parallelogram.             
              I will use print line to display the results to 
              the screen. Also included in this development will
              be the use of a Switch with an If for error checking
              of the input of the Switch.Alos GUI boxes are used to 
              display the results of the math calculations.
 */
package program3;

/*
                    Imported librayies 
 */
import java.util.*;
import javax.swing.JOptionPane;

public class Math 
{
       /*
               Private Members  
        */ 
        private double radius,
                       length ,
                       width ,
                       base  ,
                       height;
        
         /*
              Accessors Mutators      
         */ 
        
        public void setRadius (double r)
        {
            radius = r;
        }
        public void setLength (double l)
        {
            length = l;
        }
        public void setWidth (double w)
        {
            width = w;
        }
        public void setBase (double b)
        {
            base = b;
        }
        public void setHeight (double h)
        {
            height = h;
        }
        public double getRadius ()
        {
            return radius;
        }
        public double getLength ()
        {
            return length;
        }
        public double getWidth ()
        {
            return width;
        }
        public double getBase ()
        {
            return base;
        }
        public double getHeight ()
        {
            return height;
        }
        
        /*
               Calculate Phase       
        */
        public double getCircleArea ()
        {
            return 3.14159 * (radius * radius);
        }
        public double getSquareArea ()
        {
            return length * width;
        }
        public double getRectangleArea ()
        {
            return (length * width) * 2;
        }
        public double getTriangelArea ()
        {
            return (base * height) / 2;
        }
        public double getParallelogramArea ()
        {
            return base * height;
        }

        
/*
                            Output Display
 */

    public static void main(String[] args) 
    {
         /*
               Allocating Variables  
         */
        char   choiceC = ' ';
        
        double radiusD = 0.0,
               lengthD = 0.0,
               widthD  = 0.0,
               baseD   = 0.0,
               heightD = 0.0;
        
        String inputS  = " ";
         /*
                Keyboard Object
         */
        Scanner Keyboard = new Scanner (System.in);
         /*
                 Math Objects         
         */
        Math Circle        = new Math ();
        Math Square        = new Math ();
        Math Rectangle     = new Math ();
        Math Triangel      = new Math ();
        Math Parallelogram = new Math ();
         /*
                Output Display         
         */
        
        System.out.println ("\t\t Welcome to the Geometry Calculator\n\n\n");
        
        System.out.println ("\tA.\tCircle\n");
        System.out.println ("\tB.\tSquare\n");
        System.out.println ("\tC.\tRectangle\n");
        System.out.println ("\tD.\tTriangle\n");
        System.out.println ("\tE.\tParallelogram\n\n");
        
        System.out.print ("\tEnter in the Menu Choice ==>");
        inputS  = Keyboard.nextLine();
        choiceC = inputS.charAt(0);
        
        /*
                Error Checking
         */
        if((choiceC < 'a' || choiceC > 'e')&&(choiceC < 'A' || choiceC > 'E'))
        {
           System.out.println("\n\n\tYou have entered in the Wrong Letter");
           System.out.println("\t  Letters that needed to be entered");
           System.out.println("\t     A  a  B  b  C  c  D  d  E  e");
           System.out.println("\t      You entered in the Letter " + choiceC);
            
        }
        switch (choiceC)
        {
            case 'A':
            case 'a':         
                //Circle
                System.out.print ("\n\n\tEnter in the Radius of the Circle.");
                radiusD = Keyboard.nextDouble();
                Circle.setRadius (radiusD);
                System.out.println ("\tThe Area of the Circle is " + 
                            Circle.getCircleArea() + "\n");
                JOptionPane.showMessageDialog (null,"\tThe Area of the Circle"
                        + " is " + Circle.getCircleArea() + "\n");
                break;
                
            case 'B':
            case 'b':    
        
                //Square
                System.out.print ("\n\n\tEnter in the Length of the Square.");
                lengthD = Keyboard.nextDouble();
                Square.setLength (lengthD);
                System.out.print ("\tEnter in the Width of the Square.");
                widthD = Keyboard.nextDouble();
                Square.setWidth(widthD);
                System.out.println ("\tThe Aera of the Square is " + 
                            Square.getSquareArea() + "\n");
                JOptionPane.showMessageDialog (null,"\tThe Aera of the Square"
                        + " is " + Square.getSquareArea() + "\n");
                break;
        
            case 'C':
            case 'c':
                
                //Rectangle
                System.out.print("\n\n\tEnter in the Length of the "
                        + "Rectangle.");
                lengthD = Keyboard.nextDouble();
                Rectangle.setLength (lengthD);
                System.out.print ("\tEnter in the Width of the Rectangle.");
                widthD = Keyboard.nextDouble();
                Rectangle.setWidth(widthD);
                System.out.println ("\tThe Aera of the Rectangle is " + 
                            Rectangle.getRectangleArea() + "\n");
                JOptionPane.showMessageDialog (null,"\tThe Aera of the "
                     + "Rectangle is " + Rectangle.getRectangleArea() + "\n");
                break;
                
            case 'D':
            case 'd':
                
                //Triangle
                System.out.print ("\n\n\tEnter in the Base of the Triangle.");
                baseD = Keyboard.nextDouble();
                Triangel.setBase (baseD);
                System.out.print ("\tEnter in the Height of the Triangle.");
                heightD = Keyboard.nextDouble();
                Triangel.setHeight (heightD);
                System.out.println ("\tThe Area of the Triangle is " + 
                            Triangel.getTriangelArea () + "\n");
                JOptionPane.showMessageDialog (null,"\tThe Area of the "
                       + "Triangle is " + Triangel.getTriangelArea () + "\n");
                break;
                
             case 'E':
             case 'e':
                 
                //Parallelogram
                System.out.print("\n\n\tEnter in the Base of the "
                        + "Parallelogram.");
                baseD = Keyboard.nextDouble();
                Parallelogram.setBase (baseD);
                System.out.print("\tEnter in the Height of the"
                        + " Parallelogram.");
                heightD = Keyboard.nextDouble();
                Parallelogram.setHeight (heightD);
                System.out.println ("\tThe Area of the Parallelogram is " + 
                            Parallelogram.getParallelogramArea () + "\n");
                JOptionPane.showMessageDialog (null,"\tThe Area of the "
                            + "Parallelogram is " 
                            + Parallelogram.getParallelogramArea () + "\n");
                break;
                 
             default:
                 System.out.println ("\n\n\tPlease run program again with "
                         + "the Propper data");
        
        }
        System.exit(0);
        
    }
}
