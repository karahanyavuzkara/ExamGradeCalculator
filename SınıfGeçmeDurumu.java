package patika;
import java.util.Scanner;
public class SınıfGeçmeDurumu {

public static void main(String[]args) {
	
	int mat,fizik,turkce,toplam;
	
	System.out.print("Matematik notunzu giriniz : ") ; 
	Scanner input = new Scanner(System.in); 
    mat = input.nextInt();
    
    System.out.print("Türkçe notunuzu giriniz : ");
    turkce = input.nextInt();
        
    System.out.print("Fizik notunuzu giriniz : ");
    fizik = input.nextInt();
    
    toplam = mat + fizik + turkce ;
     
    if ( (toplam / 3) < 50 ) {
    	System.out.print("Sınıfta kaldınız. ");
    	
}
    else
        System.out.print("Sınıfı geçtiniz. ");
    }
}
