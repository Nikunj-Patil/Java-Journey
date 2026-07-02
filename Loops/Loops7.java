//print n*n in n by n grid

import java.util.Scanner;

public class Loops7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c =0;
        for(int i = 1; i<= n; i++){
            for(int j =1; j<=n; j++){
            System.out.printf("%02d ", ++c);}
                System.out.println(" ");
    }
    }
}
