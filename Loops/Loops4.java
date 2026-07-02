// checking for Armstrong
import java.util.Scanner;

public class Loops4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int og = n;
        int c = 0;
        while(n>0){
             int k = n%10;
             c = c + (k*k*k);
             n = n/10;
        }
        if(og == c){
            System.out.println("Armstrong!!");
        }
        else{
            System.out.println("Noooo");
        }
        sc.close();
    }
    }
