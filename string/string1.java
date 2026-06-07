// Check if given MAIL is GMAIL and also give there username and domain
import java.util.*;
public class string1 {
    public void GMAIL(String str){
        if(str.endsWith("gmail.com")){
            System.out.println("Its a GMAIL!! ");
        }
        else
            System.out.println("Not a Gmail!! ");
    }

    public void Info(String str){
        int i = str.indexOf("@");
        String user = str.substring(0,i);
        System.out.println("username "+ user);
        String Domain = str.substring(i+1);
        System.out.println("domain " + Domain );
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you EMAIL: ");
        String str = sc.next();
        string1 n = new string1();
        n.GMAIL(str);
        n.Info(str);
        sc.close();
    }
}