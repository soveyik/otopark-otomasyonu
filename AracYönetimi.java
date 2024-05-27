import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class AracYönetimi extends Arac {
    List<Arac> araclar;

    public AracYönetimi(){
        araclar = new ArrayList<>();
    }
    
    public void araclar(){
        araclar.add(new Arac("1", "Toyota", "Corolla", "Otomatik", "Beyaz", "Benzin", 2020, 5000, true));
        araclar.add(new Arac("2", "Ford", "Focus", "Manuel", "Gri", "Dizel", 2018, 30000, false));
    }

    public void aracEkle(Arac arac){
        araclar.add(arac);
    }

    public void aracKaldir(Arac kaldirilacakArac){
        Iterator iterator = araclar.iterator();
        while(iterator.hasNext()){
            Arac arac = (Arac) iterator.next(); //çağırılan nesne arac türüne dönüştürüldü
            if(arac.getAracID() == kaldirilacakArac.getAracID()){
                iterator.remove();
                break;
            }
        }
    }
    public void araclariListele() {
        for (Arac arac : araclar) {
            System.out.println("Arac ID: " + arac.getAracID());
            System.out.println("Marka: " + arac.getMarka());
            System.out.println("Model: " + arac.getModel());
            
        }
    }
    public List<Arac> getAraclar() {
        return araclar;
    }

    
}
