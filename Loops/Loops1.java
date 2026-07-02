//table of number
import java.util.Scanner;

public class Loops1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number whose table needed ");
        int n = sc.nextInt();
        int i;
        for(i = 1; i <= 10; i++){
            System.out.println( i + "*" + n + "=" + (i*n));
        }
        sc.close();

    }
}
