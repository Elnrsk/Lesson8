import java.util.Scanner;
public class str916{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Luiboi soz zhaz");
		String word=in.nextLine();
		char c1=word.charAt(1);
		char c2=word.charAt(3);   //2 и 4 соз уксас true ал если уксас бомаса false

		if(c1==c2){
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");
		}
	}
}