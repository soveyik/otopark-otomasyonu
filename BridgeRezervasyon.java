abstract class BridgeRezervasyon implements BridgeIslem{
    public void islemYap(Arac arac, String islemTuru){
        System.out.println(arac.getAracID()+" aracı için rezervasyon işlemi gerçekleştiriliyor...");
    }
}