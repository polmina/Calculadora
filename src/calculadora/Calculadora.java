
package calculadora;

import java.util.Scanner;


public class Calculadora {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("i = ");
        int i= in.nextInt();
        System.out.print("u = ");
        int u = in.nextInt();
        System.out.println(""+i + " + " + u + " = " + suma(i,u));
        System.out.println(""+i + " - " + u + " = " + resta(i,u));
        System.out.println(""+i + " * " + u + " = " + multiplicacio(i,u));
                
    }
    private static int suma(int i, int u)
    {
        return i+u;
    }
    private static int resta(int i, int u)
    {
        return i-u;
    }
    private static int multiplicacio(int i, int u)
    {
        return i*u;
    }
    
}
