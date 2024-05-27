public class MudurErişim implements Erişim{
    private Personel kullanici;

    public void MudurErişim(Personel kullanici){
        this.kullanici = kullanici;
    }

    @Override
    public void erişimeİzinVer(){
        System.out.println("Bu kullanıcı için erişim izni verildi  "+ kullanici);
    }
}