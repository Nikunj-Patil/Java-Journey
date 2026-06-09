// ODD or EVEN
import java.util.Scanner;
public class CS2{
    public void Odd_Even(int N){
        if (N % 2 == 0){
            System.out.println("EVEN");
        }
        else 
            System.out.println("ODD");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the next number");
        int N = sc.nextInt();
        CS2 o =new CS2();
        o.Odd_Even(N);
        sc.close();
    }
}
