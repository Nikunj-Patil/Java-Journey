// fibonacci
import java.util.Scanner;

public class Loops6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print( a+  " " + b+  " " );
        for(int i =3 ; i<=n; i++){
            c = a + b;
          
            System.out.print(c + " ");
            a = b;
            b = c;
            
        }
        s.close();
    }
}
