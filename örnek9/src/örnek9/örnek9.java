package �rnek9;
import java.util.Scanner;
public class �rnek9 {
//�ifre do�rulama
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int �ifre = 1907;
		System.out.println("tahmin giriniz");
		int tahmin = scan.nextInt();
		if(tahmin==�ifre) {
			System.out.println("�ifre do�ru");
		}
		else {
			System.out.println("�fire yanl��");
		}

	}

}
