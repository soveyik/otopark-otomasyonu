public class AylikKiralama implements Kiralama{
    private static AylikKiralama instance;
    private Arac arac;
    private int ay;
    private double aylikUcret;
    private AylikKiralama(){
    }
    
    public static AylikKiralama getInstance(){
        if(instance == null){
            instance = new AylikKiralama();
        }
        return instance;
    }

    public AylikKiralama(Arac arac,int ay, double aylikUcret){
        this.arac = arac;
        this.ay = ay;
        this.aylikUcret = aylikUcret;
    }
    public void planiYazdir(){
        System.out.println("Aylık Kiralama Planı: ");
        System.out.println("Arac: " + arac.getMarka()+ " "+ arac.getModel() + " " + arac.getYil());
        System.out.println("Ay: " + ay);
        System.out.println("Aylık Fiyatı: "+ aylikUcret+ " TL");
        System.out.println("Toplam tutar: " + (ay* aylikUcret)+ "TL");
        System.out.println('\n');
    }
    @Override
    public Kiralama kiralamaTuru(Musteri musteri) {
        throw new UnsupportedOperationException("Unimplemented method 'kiralamaTuru'");
    }

    public void AylikKiralama(Arac secilenArac, int i, double j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AylikKiralama'");
    }
    
}