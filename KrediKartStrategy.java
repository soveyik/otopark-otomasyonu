public class KrediKartStrategy implements Odeme {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;
    private double tutar;

    public KrediKartStrategy(String nm, String ccNum, String cvv, String expiryDate,double tutar ){
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
        this.tutar = tutar;
    }
    @Override
    public void pay(double amount) {
        System.out.println("İsminizi giriniz: " + name);
        System.out.println("Kart numarası: " + cardNumber);
        System.out.println("Son kullanma tarihi: " + tutar);
        System.out.println("Ödeme işlemi tamamlandı.");
        System.out.println(amount + "TL kredi kartı ile ödendi");
    }

    public boolean isValid(){
        return cardNumber != null && !cardNumber.isEmpty() && dateOfExpiry != null && !dateOfExpiry.isEmpty() && cvv != null && !cvv.isEmpty();
    }

    public void accept(Visitor visitor){
        visitor.visit(this); //ziyaretci nesnesinin visit metodu çağrılıyor ve mevcut nesne this ziyareçiye  geçiyor
    }
    //bu metot desendeki bir ögenin ziyaretçi tarafından ziyaret edilmesini sağlayan bir yöntemdir.
    //bir ziyaretçi tarafından işlenmesi için ziyaretçi nesnesini kabul eder.
    
    public Object getCardNumber() {
       return cardNumber;
    }
    
    public boolean startsWith(String önEk) {
        return cardNumber.startsWith(önEk);
    }//bu metot ön ekin 999 ile baslayıp baslamadıgını kontrol eder dolandırıcılık kontrolünü sağlar
}