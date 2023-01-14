import java.util.Scanner;
public class str949{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);//канша арп сонша * шыгарад
        String word = sc.next();
        String zvz = "*";
        String c1="";
        int length = word.length();
        for (int i = 1;i<=length;i++) {
        c1=zvz;
        zvz+="*";
       }
        System.out.println(c1+word+c1);
   }
}