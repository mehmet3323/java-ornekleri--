package örnek9;
import java.util.Scanner;
public class örnek9 {
//þifre doðrulama
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int þifre = 1907;
		System.out.println("tahmin giriniz");
		int tahmin = scan.nextInt();
		if(tahmin==þifre) {
			System.out.println("þifre doðru");
		}
		else {
			System.out.println("þfire yanlýþ");
		}

	}

}
