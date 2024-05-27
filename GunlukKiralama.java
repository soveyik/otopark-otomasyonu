public class GunlukKiralama implements Kiralama{
    private static GunlukKiralama instance;
    private Arac arac;
    private int gun;
    private double gunlukUcret;
    private GunlukKiralama(){
    }
    
    public static GunlukKiralama getInstance(){
        if(instance == null){
            instance = new GunlukKiralama();
        }
        return instance;
    }

    public  GunlukKiralama(Arac arac,int gun, double gunlukUcret){
        this.arac = arac;
        this.gun = gun;
        this.gunlukUcret = gunlukUcret;
    }
    public void planiYazdir(){
        System.out.println("Günlük Kiralama Planı: ");
        System.out.println("Arac: " + arac.getMarka()+ " "+ arac.getModel() + " " + arac.getYil());
        System.out.println("Gün: " + gun);
        System.out.println("Günlük Fiyatı: "+ gunlukUcret+ " TL");
        System.out.println("Toplam tutar: " + (gun* gunlukUcret)+ "TL");
        System.out.println('\n');
    }
    @Override
    public Kiralama kiralamaTuru(Musteri musteri) {
        throw new UnsupportedOperationException("Unimplemented method 'kiralamaTuru'");
    }

    public void GunlukKiralama(Arac arac, int gun, double gunlukUcret) {
        // TODO Auto-generated methd stub
        throw new UnsupportedOperationException("Unimplemented method 'GunlukKiralama'");
    }
    
}