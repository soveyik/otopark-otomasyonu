// Araba Fiyatlandırma Stratejisi
public class ArabaFiyatlandirmaStrategy implements Odeme {
    private String aracTuru;
    private double fiyat;

    public ArabaFiyatlandirmaStrategy(String aracTuru, double fiyat) {
        this.aracTuru = aracTuru;
        this.fiyat = fiyat;
    }

    @Override
    public void pay(double amount) {
        System.out.println(aracTuru + " için ödeme miktarı: " + fiyat);
        System.out.println(amount + "TL ödendi");
    }
}