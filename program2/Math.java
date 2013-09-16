/*
*****************************************************************************
*                                                                           *
*              Programmer:            Bryan C Deem                          *
*              Program Number         Number Two                            *
*              Class:                 IS251 Introduction to JAVA Programming*
*              Instructor:            David Wilke                           *
*              Start Date             9 September 2013                      *
*              Due Date:              11 September 2013                     *
*                                                                           *
*              This program will calculate the area of a Circle,            *
*              Rectangle, Triangle, Square, or a Parallelogram.             *
*              I will use print line to display the results to the screen.  *
*                                                                           *
*                                                                           *
*                                                                           *
*****************************************************************************
 */
package program2;

/*
        ******************************
        *                            *
        *           Import           *
        *                            *
        ****************************** 
 */
import java.util.*;

public class Math 
{
       /*
        ******************************
        *                            *
        *      Private Members       *
        *                            *
        ****************************** 
        */ 
        private double radius,
                       length ,
                       width ,
                       base  ,
                       height;
        
         /*
        ******************************
        *                            *
        *     Accessors Mutators     *
        *                            *
        ****************************** 
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
        ******************************
        *                            *
        *       Calculate Phase      *
        *                            *
        ****************************** 
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
 *****************************************************************************
 *                                                                           *
 *                          Output Display                                   *
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
        double radiusD = 0.0,
               lengthD = 0.0,
               widthD  = 0.0,
               baseD   = 0.0,
               heightD  = 0.0;
         /*
         *******************************
         *                             *
         *       Keyboard Object       *
         *                             *
         ******************************* 
         */
        Scanner Keyboard = new Scanner (System.in);
         /*
         *******************************
         *                             *
         *        Math Objects         *
         *                             *
         ******************************* 
         */
        Math Circle        = new Math ();
        Math Square        = new Math ();
        Math Rectangle     = new Math ();
        Math Triangel      = new Math ();
        Math Parallelogram = new Math ();
         /*
         *******************************
         *                             *
         *       Output Display        *
         *                             *
         ******************************* 
         */
        //Circle
        System.out.print ("Enter in the Radius of the Circle.");
        radiusD = Keyboard.nextDouble();
        Circle.setRadius (radiusD);
        System.out.println ("The Area of the Circle is " + 
                Circle.getCircleArea() + "\n");
        
        //Square
        System.out.print ("Enter in the Length of the Square.");
        lengthD = Keyboard.nextDouble();
        Square.setLength (lengthD);
        System.out.print ("Enter in the Width of the Square.");
        widthD = Keyboard.nextDouble();
        Square.setWidth(widthD);
        System.out.println ("The Aera of the Square is " + 
                Square.getSquareArea() + "\n");
        
        //Rectangle
        System.out.print ("Enter in the Length of the Rectangle.");
        lengthD = Keyboard.nextDouble();
        Rectangle.setLength (lengthD);
        System.out.print ("Enter in the Width of the Rectangle.");
        widthD = Keyboard.nextDouble();
        Rectangle.setWidth(widthD);
        System.out.println ("The Aera of the Rectangle is " + 
                Rectangle.getRectangleArea() + "\n");
        
        //Triangle
        System.out.print ("Enter in the Base of the Triangle.");
        baseD = Keyboard.nextDouble();
        Triangel.setBase (baseD);
        System.out.print ("Enter in the Height of the Triangle.");
        heightD = Keyboard.nextDouble();
        Triangel.setHeight (heightD);
        System.out.println ("The Area of the Triangle is " + 
                Triangel.getTriangelArea () + "\n");
        
        //Parallelogram
        System.out.print ("Enter in the Base of the Parallelogram.");
        baseD = Keyboard.nextDouble();
        Parallelogram.setBase (baseD);
        System.out.print ("Enter in the Height of the Parallelogram.");
        heightD = Keyboard.nextDouble();
        Parallelogram.setHeight (heightD);
        System.out.println ("The Area of the Triangle is " + 
                Parallelogram.getParallelogramArea () + "\n");
        
        System.exit(0);
        
    }
    
}
