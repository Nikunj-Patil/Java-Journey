// reverse string and check pallindrome
import java.util.Scanner;
public class Loops5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n ;
        int rev = 0;
        while(n>0){
            int r = n%10;
            rev = rev * 10 + r;
            n = n/10;
        }
        if(k == rev){
            System.out.println("its a pallindrome");
        }
        else{
            System.out.println("not a pallindrome");
        }
        System.out.println("reverse of "+ k +" is "+ rev); 
    sc.close();
    }
}