import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

	public static void main(String[] args) {
	System.out.println("1-Taþ");
	System.out.println("2-Kaðýt");
	System.out.println("3-Makas");
	System.out.println("1 ile 3 arasý bir sayý seçiniz : ");
    //Kullanýcý girdi kýsmý
	Scanner sc = new Scanner(System.in);
	int kullanýcý = sc.nextInt();
	//Bilgisayar girdi kýsmý
	Random rnd = new Random();
    int pc = rnd.nextInt(3)+1; //nextInt in içini 3 býrakýrsak bilgisayar 0 dan baþlar o yüzden yanýna +1 yazabiliriz.
    System.out.println("Bilgisayarýn seçimi : " + pc);
    
    //Kullanýcýnýn kaybettiði durumlar tek if ile yazýlýþý isteðe baðlý ayrý yazýlabilir.
    if ((kullanýcý == 1 && pc == 2) || (kullanýcý == 2 && pc == 3) || (kullanýcý == 3 && pc == 1)) {
    	System.out.println("Kaybettiniz");
    }
    //Kullanýcýnýn kazandýðý durumlar tek if ile yazýlýþý isteðe baðlý ayrý yazýlabilir.
    else if ((kullanýcý == 1 && pc == 3) || (kullanýcý == 2 && pc == 1) || (kullanýcý == 3 && pc == 2)) {
    	System.out.println("Kazandýnýz");
    }
    //Kullanýcý ile bilgisayarýn seçiminin ayný olduðu durumlar.
    else if (kullanýcý == pc) {
    	System.out.println("Berabere");
    }
    else {
    	System.out.println("Geçersiz Girdi");
       }
   }

}
