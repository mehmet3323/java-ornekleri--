package �rnek8;
import java.util.Scanner;
public class �rnek8 {
// negatif pozitif bulma
	public static void main(String[] args) {
		System.out.println("say� girin");
		Scanner scan = new Scanner(System.in);
		
		int sayi = scan.nextInt();
		if(sayi>0) {
			System.out.println("pozitif");
		}
		else  {
			System.out.println("negatif");
		}
	}

}
