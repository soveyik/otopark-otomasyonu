import java.util.ArrayList;

public class Arac  {
    private String marka;
    private String model;
    private String vites;
    private String renk;
    private String yakitTuru;
    private int yil;
    private double fiyat;
    protected boolean musaitlik;
    protected String aracID;



    public Arac(){

    }

    public Arac(String aracID,String marka, String model, String vites,String renk,String yakitTuru, int yil, double fiyat, boolean musaitlik) {
        this.aracID = aracID;
        this.marka = marka;
        this.model = model;
        this.vites=vites;
        this.renk=renk;
        this.yakitTuru=yakitTuru;
        this.yil = yil;
        this.fiyat = fiyat;
        this.musaitlik = true;
    }

    ArrayList<Arac> aracListesi = new ArrayList<>();

    public void araclarListesi() {
        Arac a1 = new Arac("1","Volkswagen", "Passat", "OTOMATİK", "MAVİ", "DIZEL", 2015, 1000, true);
        Arac a2 = new Arac("2","BMW", "5.20", "DUZ", "KIRMIZI", "DIZEL", 2001, 1500, false);
        Arac a3 = new Arac("3","Ford", "F-150", "DUZ", "SARI", "BENZIN", 2010, 990, true);
        Arac a4 = new Arac("4","Volkswagen", "Amarok", "OTOMATIK", "SIYAH", "BENZIN", 2020, 1100, true);
        Arac a5 = new Arac("5","Fiat", "Doblo", "OTOMATIK", "BEYAZ", "DIZEL", 2022, 2000, false);
        Arac a6 = new Arac("6","Volkswagen", "Caddy", "DUZ", "BEYAZ", "DIZEL", 2024, 2000, true);
        Arac a7 = new Arac("7","Nissan", "GT-R", "OTOMATIK", "KIRMIZI", "DIZEL", 2024, 5000, true);
        Arac a8 = new Arac("8","Ferrari", "458", "OTOMATIK", "SIYAH", "DIZEL", 2022, 4500, true);

        aracListesi.add(a1);
        aracListesi.add(a2);
        aracListesi.add(a3);
        aracListesi.add(a4);
        aracListesi.add(a5);
        aracListesi.add(a6);
        aracListesi.add(a7);
        aracListesi.add(a8);
    }
        public String getAracID(){
            return this.aracID;
        }
        public void setAracID(String aracID){
            this.aracID = aracID;
        }

        public String getMarka () {
            return this.marka;
        }

        public void setMarka (String marka){
            this.marka = marka;
        }

        public String getModel () {
            return this.model;
        }

        public void setModel (String model){
            this.model = model;
        }

        public String getVites () {
            return vites;
        }

        public void setVites (String vites){
            this.vites = vites;
        }

        public String getRenk () {
            return renk;
        }

        public void setRenk (String renk){
            this.renk = renk;
        }

        public String getYakitTuru () {
            return yakitTuru;
        }

        public void setYakitTuru (String yakitTuru){
            this.yakitTuru = yakitTuru;
        }

        public int getYil () {
            return this.yil;
        }

        public void setYil ( int yil){
            this.yil = yil;
        }

        public double getFiyat () {
            return this.fiyat;
        }

        public void setFiyat ( double fiyat){
            this.fiyat = fiyat;
        }

        public boolean isMusaitlik () {
            return this.musaitlik;
        }

        public void setMusaitlik ( boolean musaitlik){
            this.musaitlik = musaitlik;
        }


    public int getYolcuKapasitesi() {
        return 0;
    }

    public void bilgiYazdir() {

    }
}