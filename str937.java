import java.util.Scanner;
public class str937{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
        String word = in.nextLine();
        String f = " ";
        String f2 = "";
        int half = word.length()/2;
        for(int i = 0; i < word.length()/2; i++){
            f = f + word.charAt(i);
            f2 = f2 + word.charAt(half+i);
        }
        System.out.println(f2+f);;
    }
}