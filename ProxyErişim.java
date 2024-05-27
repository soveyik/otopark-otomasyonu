public class ProxyErişim implements Erişim{
    private Personel kullanici;
    private MudurErişim mudur;
    private IsletmeSahibiErisim isletmeci;

    public ProxyErişim(Personel kullanici){
        this.kullanici = kullanici;
    }

    @Override
    public void erişimeİzinVer(){
        if(getRole(kullanici) == 4){
            mudur = new MudurErişim();
            mudur.erişimeİzinVer();
        }else if(getRole (kullanici) == 5){
            isletmeci = new IsletmeSahibiErisim();
            isletmeci.erişimeİzinVer();
        }else{
            System.out.println( kullanici + " kullanıcısına erişim engellendi.");
        }
    }
    public int getRole(Personel kullanici){
        return 9;
    }
}