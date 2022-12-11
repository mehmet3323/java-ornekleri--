package örnek6;
import java.util.Scanner;
public class örnek6 {
//faktöryel hesaplama
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int faktöryel=1;
		System.out.println("sayý giriniz");
		int sayi = scan.nextInt();
		
		for( int i=1;i<=sayi;i++) {
			faktöryel=faktöryel*i;
		}
		System.out.println(faktöryel);
		
	}

}
