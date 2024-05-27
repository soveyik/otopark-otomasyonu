import java.sql.Date;

public class Rezervasyon {
    private Arac arac;
    private Musteri musteri;
    private Date rezerveTarihi;
    private Date iadeTarihi;
    private String aracID;
    

    public Rezervasyon(Musteri musteri, String aracID,Date rezervetarihi, Date iadeTarihi){
       this.musteri = musteri;
       this.aracID = aracID;
        this.rezerveTarihi = rezerveTarihi;
        this.iadeTarihi = iadeTarihi;
    }

    public Rezervasyon(Musteri musteri2, String aracID2, java.util.Date rezerveTarihi2, java.util.Date iadeTarihi2) {
        //TODO Auto-generated constructor stub
    }

    public Arac getArac(){
        return arac;
    }

    public Musteri getMusteri(){
        return musteri;
    }

    public Date getRezerveTarihi(){
        return rezerveTarihi;
    }

    public Date getIadeTarihi(){
        return iadeTarihi;
    }
    @Override
    public String toString() {
        return "Rezervasyon{" +
                "Araç=" + arac +
                ", Rezerve eden kişi adı=" + musteri +
                ", Rezerve tarihi=" + rezerveTarihi +
                ", iade Tarihi=" + iadeTarihi +
                '}';
    }
}