import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

	public static void main(String[] args) {
	System.out.println("1-Ta�");
	System.out.println("2-Ka��t");
	System.out.println("3-Makas");
	System.out.println("1 ile 3 aras� bir say� se�iniz : ");
    //Kullan�c� girdi k�sm�
	Scanner sc = new Scanner(System.in);
	int kullan�c� = sc.nextInt();
	//Bilgisayar girdi k�sm�
	Random rnd = new Random();
    int pc = rnd.nextInt(3)+1; //nextInt in i�ini 3 b�rak�rsak bilgisayar 0 dan ba�lar o y�zden yan�na +1 yazabiliriz.
    System.out.println("Bilgisayar�n se�imi : " + pc);
    
    //Kullan�c�n�n kaybetti�i durumlar tek if ile yaz�l��� iste�e ba�l� ayr� yaz�labilir.
    if ((kullan�c� == 1 && pc == 2) || (kullan�c� == 2 && pc == 3) || (kullan�c� == 3 && pc == 1)) {
    	System.out.println("Kaybettiniz");
    }
    //Kullan�c�n�n kazand��� durumlar tek if ile yaz�l��� iste�e ba�l� ayr� yaz�labilir.
    else if ((kullan�c� == 1 && pc == 3) || (kullan�c� == 2 && pc == 1) || (kullan�c� == 3 && pc == 2)) {
    	System.out.println("Kazand�n�z");
    }
    //Kullan�c� ile bilgisayar�n se�iminin ayn� oldu�u durumlar.
    else if (kullan�c� == pc) {
    	System.out.println("Berabere");
    }
    else {
    	System.out.println("Ge�ersiz Girdi");
       }
   }

}
