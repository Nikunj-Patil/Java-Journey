// display digits of number
import java.util.Scanner;

public class Loops3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int k;

        while(n>0){
            k = n % 10;
            System.out.println(k);
            n = n/10;
        }
        sc.close();
    }
}