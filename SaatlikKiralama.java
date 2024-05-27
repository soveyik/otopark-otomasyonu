import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaatlikKiralama implements Kiralama {
    private Arac arac;
    private int saat;
    private double saatlikUcret;
    private Musteri musteri;
    Scanner scanner = new Scanner(System.in);
    private String ad;
    private String soyad;
    private String aracPlakaNo;

    private static SaatlikKiralama instance;
    private SaatlikKiralama(){
    }
    
    
    public static SaatlikKiralama getInstance(){
        if(instance == null){
            synchronized (SaatlikKiralama.class){
                if(instance == null){
                    System.out.println("getInstance oluşturuldu");
                    instance = new SaatlikKiralama();
                }
            }
        }
        return instance;
    }

    public SaatlikKiralama(Arac arac,int saat, double saatlikUcret){
        this.arac = arac;
        this.saat = saat;
        this.saatlikUcret = saatlikUcret;
    }
    public void planiYazdir(){
        System.out.println("Saatlik Kiralama Planı: ");
        System.out.println("Arac: " + arac.getMarka()+ " "+ arac.getModel() + " " + arac.getYil());
        System.out.println("Saat: " + saat);
        System.out.println("Saatlik Fiyatı: "+ saatlikUcret+ " TL");
        System.out.println("Toplam tutar: " + (saat* saatlikUcret)+ "TL");
        System.out.println('\n');
    }


    @Override
    public Kiralama kiralamaTuru(Musteri musteri) {
        throw new UnsupportedOperationException("Unimplemented method 'kiralamaTuru'");
    }


    public void SaatlikKiralama(Arac secilenArac, int saat, double saatlikUcret) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SaatlikKiralama'");
    }
    


}
