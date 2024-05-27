
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class RezervasyonYönetimi extends Arac {
    private List<Arac> araclar;
    private List<Rezervasyon> rezervasyonlar;
    private AracYönetimi aracYönetimi;

    public RezervasyonYönetimi(AracYönetimi aracYönetimi, List<Rezervasyon> rezervasyonlar){
        this.araclar = new ArrayList<>();
        this.rezervasyonlar = new ArrayList<>();
    }

    public void aracEkle(Arac arac){
        araclar.add(arac);
    }

    public List<Arac> getKiralanabilir(){
        List<Arac> kiralanabilirArac = new ArrayList<>();
        for(Arac arac : araclar){
            if(arac.isMusaitlik()){
                kiralanabilirArac.add(arac);
            }
        }
        return kiralanabilirArac;

    }
    public boolean rezerveArac(Musteri musteri, String aracID, java.util.Date rezerveTarihi, java.util.Date iadeTarihi){
        for(Arac arac : araclar){
            if(arac.getAracID().equals(aracID) && arac.isMusaitlik()){
                arac.setMusaitlik(false);
                Rezervasyon rezervasyon = new Rezervasyon( musteri,aracID, rezerveTarihi, iadeTarihi);
                rezervasyonlar.add(rezervasyon);
                return true;
            }
        }
        return false;
    }
    public void rezervasyonlariListele(){
        for(Rezervasyon rezervasyon : rezervasyonlar){
            System.out.println(rezervasyon);

        }
    }

   
}