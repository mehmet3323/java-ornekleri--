package �rnek10;
import java.util.Scanner;

public class �rnek10 {

	public static void main(String[] args) {
		//hesap makinesi
			Scanner scan = new Scanner (System.in);
		    System.out.println("1. say�y� giriniz");
			int a = scan.nextInt();
		    System.out.println("2. say�y� giriniz");
		    int b = scan.nextInt();
		    System.out.println("i�lem �e�");
		    System.out.println("1=topalam");
			System.out.println("2=��karma");
			System.out.println("3=�arpma");
			System.out.println("4=b�lme");
			
			System.out.println("seciminizi giriniz");
			int secim=scan.nextInt();
			
			if(secim==1) {
				System.out.println(a+b);
			}
			else if(secim==2) {
				System.out.println(a-b);
			}
			else if(secim==3){
				System.out.println(a*b);
			}
			else if(secim==4) {
				System.out.println(a/b);
			}
			else {
				System.out.println("yanl�� say� girdiniz");
			}

	}

}
