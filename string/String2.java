// to check whether given string is BINARY,HEXA OR NONE.
import java.util.Scanner;

public class String2 {
    public void isBinaryHexa(String str){
        if (str.matches("[0|1]+")){
            System.out.println("Binary!!");
        }
        else if (str.matches("[0-9 A-F]+")){
            System.out.print("Hexaa!!");
        }
        else
            System.out.print("No Binary No Hexa");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String str = sc.next();
        String2 n = new String2();
        n.isBinaryHexa(str);
        sc.close();
    }   
}
