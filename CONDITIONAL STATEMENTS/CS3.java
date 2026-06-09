// information about the domain of website
import java.util.Scanner;

public class CS3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Website");
        String str = s.nextLine();
        String domain = str.substring(str.indexOf("."));
        switch(domain){
            case ".com": System.out.println("COmmercial");
            break;
            case ".in" : System.out.println("Indian website");
            break;
            case ".edu" : System.out.println("Educational Website");
            break;
            case ".us" : System.out.println("usa website");
            break;
            default : System.out.println("Other Domain");
            break;
        }
        s.close();
}
}
