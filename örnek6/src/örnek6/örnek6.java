package �rnek6;
import java.util.Scanner;
public class �rnek6 {
//fakt�ryel hesaplama
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fakt�ryel=1;
		System.out.println("say� giriniz");
		int sayi = scan.nextInt();
		
		for( int i=1;i<=sayi;i++) {
			fakt�ryel=fakt�ryel*i;
		}
		System.out.println(fakt�ryel);
		
	}

}
