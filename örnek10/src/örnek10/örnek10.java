package örnek10;
import java.util.Scanner;

public class örnek10 {

	public static void main(String[] args) {
		//hesap makinesi
			Scanner scan = new Scanner (System.in);
		    System.out.println("1. sayýyý giriniz");
			int a = scan.nextInt();
		    System.out.println("2. sayýyý giriniz");
		    int b = scan.nextInt();
		    System.out.println("iþlem þeç");
		    System.out.println("1=topalam");
			System.out.println("2=çýkarma");
			System.out.println("3=çarpma");
			System.out.println("4=bölme");
			
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
				System.out.println("yanlýþ sayý girdiniz");
			}

	}

}
