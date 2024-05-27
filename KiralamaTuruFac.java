import java.util.Scanner;

public class KiralamaTuruFac{
    public Kiralama kiralamaTuru(){
        String kiralamaTuru;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiralama türünü seçiniz: (saatlik, günlük, aylık)"); 
        kiralamaTuru = scanner.next();
        
        if(kiralamaTuru.equals("saatlik")){ 
            Kiralama saatlikKiralama = SaatlikKiralama.getInstance();
            return saatlikKiralama;
        }
        else if(kiralamaTuru.equals("günlük")){ 
            Kiralama gunlukKiralama = GunlukKiralama.getInstance();
            return gunlukKiralama;
        }
        else if(kiralamaTuru.equals("aylık")){
            Kiralama aylikKiralama = AylikKiralama.getInstance();
            return aylikKiralama;
        }
        else
            return null;
    }
}