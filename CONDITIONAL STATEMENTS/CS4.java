// menu driven arithetic calculator
import java.util.*;
public class CS4 {
    public void ADD(int a , int b){
        System.out.println("Addition is " + (a + b));
    }
    public void Subtract(int a , int b){
        System.out.println("Substraction is " + (a - b));
    }
    public void Multiply(int a , int b){
        System.out.println("Multiplication is " + (a * b));
    }
    public void Divide(int a , int b){
        System.out.println("Division is " + (a / b));
    }
    public static void main(String[] args) {
        System.out.println("  CALCULATOR  ");
        Scanner sc = new Scanner(System.in);
         CS4 o = new CS4();
        int n;
         do{
        System.out.println("Enter both numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the Desired Operation" + "\n 1.ADD \n 2.Subtract \n 3.Multiply \n 4.Divide \n 5.EXIT");
        n = sc.nextInt();
        switch(n){
            case 1: o.ADD(a, b);
            break;
            case 2: o.Subtract(a, b);
            break;
            case 3: o.Multiply(a, b);
            break;
            case 4: o.Divide(a, b);
            break;
            case 5: System.out.println("Calculator samapt");
            break;
            default: System.out.println("Number wapas padh!!");
            break;
        }
    }while( n !=5);
    sc.close();
    }
}
