
public class Musteri{
    private final String ad;
    private final String soyad;
    private String TCKno;
    private String adres;
    private String telefonNo;
    private String email;
    private final String aracPlakaNo; 
    private final String kiralamaTuru;
    
   

    public Musteri(String ad, String soyad, String TCKno, String adres, String telefonNo, String email, String aracPlakaNo, boolean odemeYapıldıMı,String kiralamaTuru ){
        this.ad = ad;
        this.soyad = soyad;
        this.TCKno = TCKno;
        this.email = email;
        this.adres = adres;
        this.telefonNo = telefonNo;
        this.aracPlakaNo = aracPlakaNo;
        this.kiralamaTuru = kiralamaTuru;
    }
    public String getAd(){
        return ad;
    }
    public String getSoyad(){
        return soyad;
    }
    public String TCKno(){
        return TCKno;
    }
    public String getAdres(){
        return adres;
    }
    public String getTelefonNo(){
        return telefonNo;
    }
    public String getEmail(){
        return email;
    }
    public String getAracPlakaNo(){
        return aracPlakaNo;
    }
    public String getKiralamaTuru(){
        return kiralamaTuru;
    }
    public void setTCKno(String TCKno){
        this.TCKno = TCKno;
    }
    public void setAdres(String adres){
        this.adres= adres;
    }
    public void setTelefonNo(String telefonNo){
        this.telefonNo = telefonNo;
    }
   
    public void setEmail(String email){
        this.email = email;
    }
    
    
    private Musteri(MusteriBuilder builder){
        this.ad = builder.ad;
        this.soyad = builder.soyad;
        this.TCKno = builder.TCKno;
        this.aracPlakaNo = builder.aracPlakaNo;
        this.adres = builder.adres;
        this.telefonNo = builder.telefonNo;
        this.email = builder.email;
        this.kiralamaTuru = builder.kiralamaTuru;
    }


    public static class MusteriBuilder{
        
        private final String ad;
        private final String soyad;
        private String TCKno;
        private String adres;
        private String telefonNo;
        private String email;
        private final String aracPlakaNo; 
        private final String kiralamaTuru;
       
        public MusteriBuilder(String ad, String soyad, String aracPlakaNo, String kiralamaTuru ){
            this.ad = ad;
            this.soyad= soyad;
            this.aracPlakaNo = aracPlakaNo;
            this.kiralamaTuru = kiralamaTuru;
        }

        public MusteriBuilder TCKno(String TCKno){
            this.TCKno = TCKno;
            return this;
        }
        public MusteriBuilder adres(String adres){
            this.adres = adres;
            return this;
        }
        public MusteriBuilder telefonNo(String telefonNo){
            this.telefonNo = telefonNo;
            return this;
        }
        public MusteriBuilder email(String email){
            this.email = email;
            return this;
        }
        public Musteri build(){
            if(ad == null || soyad == null || aracPlakaNo == null || kiralamaTuru == null){
                throw new IllegalStateException("Ad , soyad, arac plaka no seçimi zorunlu seçim alanıdır. Doldurulmadan kayıt gerçekleştirilemez");

            }else{
                return new Musteri(this);
            }
        }
    }

}