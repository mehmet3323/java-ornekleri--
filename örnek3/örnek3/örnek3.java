package örnek3;
import java.util.Scanner;
public class örnek3 {
//tek çift bulma
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sayý giriniz");
		int x = scan.nextInt();
		if(x%2==0) {
			System.out.println("çift");
		}
		else {
			System.out.println("tek");
		}
	
	
	}

}
