public class HavaleStrategy implements Odeme {
    private String bankaAdi;
    private String hesapNo;
    private String IBAN;
    private double tutar;

    public HavaleStrategy(String bankaAdi, String hesapNo,String IBAN, double tutar){
        this.bankaAdi = bankaAdi;
        this.hesapNo = hesapNo;
        this.IBAN = IBAN;
        this.tutar = tutar;
    }

    @Override
    public void pay(double amount){
        
       System.out.println("Havale yapılan banka: " + bankaAdi);
        System.out.println("Hesap numarası: " + hesapNo);
        System.out.println("Ödeme miktarı: " + tutar);
        System.out.println("Havale işlemi tamamlandı.");
        System.out.println(amount + "TL havale ile ödendi");
    }
    public boolean isValid(){
        return IBAN != null && !IBAN.isEmpty() && bankaAdi != null && !bankaAdi.isEmpty() && hesapNo != null && !hesapNo.isEmpty();
    }

}