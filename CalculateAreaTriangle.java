
package calculateareatriangle;

import java.util.Scanner;
public class CalculateAreaTriangle 
{


    public static void main(String[] args) 
    {
     // Import Scanner and assign value to variables using input from user.
     System.out.println("9/13/2017");
     System.out.println("  This project will build a calculator, which whole");
     System.out.println("purpose, is to calculate the area of a triangle."); 
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter the base of a triangle: ");
     double base = keyboard.nextDouble();
     //System.out.print(base);
     System.out.print("Enter the height of a triangle: ");
     double height = keyboard.nextDouble();
     double area = .5 * base * height;
     System.out.print("The area of the triangle is ");
     System.out.print(area);
     System.out.println(".");
     
     
             
        
    }
    
}
