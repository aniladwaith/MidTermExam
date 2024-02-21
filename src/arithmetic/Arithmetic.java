/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import arithmetic.ArithmeticBase.Operations;
import java.util.Scanner;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        ArithmeticBase r= new ArithmeticBase();
        Scanner in= new Scanner(System.in);
        double m= in.nextInt();
        double n= in.nextInt();
        System.out.print("Enter the operation you want to perform(ADD, MINUS, TIMES, DIVIDE): ");
        String value = in.next();
        Operations s = Operations.valueOf(value.toUpperCase());
        double result = r.calculate(m,n,s);
        System.out.println("result :" +result); 
        
         
    
    }
}

