package örenk1;

import java.util.Scanner;

public class örnek1 {
   //fibonacci dizisi yazdýrma
	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
	    System.out.println("dizinin terim sayýsýný giriniz = ");
	    int sayi=klavye.nextInt();
	    int birinci=0;
	    int ikinci=1;
	    int ucuncu=birinci+ikinci;
	    
	    System.out.println("Fibonacci Sayýlarý ");  
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
