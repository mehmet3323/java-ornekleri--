package �rnek5;
import java.util.Scanner;
public class �rnek5 {
//BK� hesaplama
	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Boyunuzu girin: ");
	    double b = scanner.nextDouble();
	    
	    System.out.print("Kilonuzu girin: ");
	    double k = scanner.nextDouble();
	    
	    
	    
	    double BK�  = k/(b*b);
	    
	    System.out.println(b);
	    System.out.println(k);
	    if(BK� <18)
	    {
	       System.out.print(String.format("ZAYIF ", BK�));
	    }   
	    else if(BK� >= 18 && BK� <25)
	    {
	        System.out.print(String.format("NORMAL ", BK�));
	    }
	    else if(BK� >= 25 && BK� <30)
	    {
	        System.out.print(String.format("K�LOLU ", BK�));        
	    }
	    else if(BK� >= 30 && BK� <35)
	    {
	        System.out.print(String.format("OBEZ ", BK�));
	    }
	    else
	    {
	        System.out.print(String.format("C�DD� OBEZ ", BK�));
	    }

	}

}
