import java.util.Scanner;
public class str976{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int q = word.indexOf('e');
        int jnf = word.lastIndexOf('e');
        System.out.println(q+1);
        System.out.println(jnf);
	}
}