package örnek7;
import java.util.Scanner;
public class örnek7 {
//alan bulma
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. kenarý gir");
		int kenar1 = scan.nextInt();
		System.out.println("2. kenarý gir");
		int kenar2 = scan.nextInt();
		
		System.out.println(kenar1*kenar2);
	}

}
