package örnek5;
import java.util.Scanner;
public class örnek5 {
//BKÝ hesaplama
	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Boyunuzu girin: ");
	    double b = scanner.nextDouble();
	    
	    System.out.print("Kilonuzu girin: ");
	    double k = scanner.nextDouble();
	    
	    
	    
	    double BKÝ  = k/(b*b);
	    
	    System.out.println(b);
	    System.out.println(k);
	    if(BKÝ <18)
	    {
	       System.out.print(String.format("ZAYIF ", BKÝ));
	    }   
	    else if(BKÝ >= 18 && BKÝ <25)
	    {
	        System.out.print(String.format("NORMAL ", BKÝ));
	    }
	    else if(BKÝ >= 25 && BKÝ <30)
	    {
	        System.out.print(String.format("KÝLOLU ", BKÝ));        
	    }
	    else if(BKÝ >= 30 && BKÝ <35)
	    {
	        System.out.print(String.format("OBEZ ", BKÝ));
	    }
	    else
	    {
	        System.out.print(String.format("CÝDDÝ OBEZ ", BKÝ));
	    }

	}

}
