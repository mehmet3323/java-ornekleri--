package �renk1;

import java.util.Scanner;

public class �rnek1 {
   //fibonacci dizisi yazd�rma
	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
	    System.out.println("dizinin terim say�s�n� giriniz = ");
	    int sayi=klavye.nextInt();
	    int birinci=0;
	    int ikinci=1;
	    int ucuncu=birinci+ikinci;
	    
	    System.out.println("Fibonacci Say�lar� ");  
	    System.out.print(birinci+ " "+ikinci+ " "); 
	    
	        while(sayi>0){
	        System.out.print(ucuncu+ " "); 
	        sayi--;        
	        birinci=ikinci;
	        ikinci=ucuncu;      
	        ucuncu=birinci+ikinci; 
	        
	      }

	}

}
