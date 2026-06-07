// given string is date or not
import java.util.Scanner;

public class String3 {
    public void isDate(String str){
      if (str.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}")){
        System.out.println("Date!!");
      }  
      else
        System.out.println("Not a Date");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data");
        String str= sc.next();
        String3 n = new String3();
        n.isDate(str);
        sc.close();
    }
}
