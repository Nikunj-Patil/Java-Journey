// Remove special char, extra space from string and find number of words in string

import java.util.Scanner;

public class String4 {
    public void Extrachar(String str){
        String s= str.replaceAll("[^a-z A-Z 1-9]", "");
        System.out.println(s);
    }
    public String ExtraSpace(String str){
        String m = str.replaceAll("//s+", " ").trim();
        System.out.println(m);
        return m;
    }
    public void Count(String str){
        String n[] = str.split("\\s");
        System.out.println(n.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the string");
        String str = sc.nextLine();
        String4 a = new String4();
        a.Extrachar(str);
        a.ExtraSpace(str);
        String k = a.ExtraSpace(str);
        a.Count(k);
        sc.close();
    }
}
