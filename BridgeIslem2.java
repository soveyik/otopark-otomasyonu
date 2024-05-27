abstract class BridgeIslem2 implements BridgeIslem {
    private BridgeIslem islem;
    
    public BridgeIslem2(BridgeIslem islem){
        this.islem = islem;
    }
    
    public void islemYap(Arac arac, String islemTuru){
       islem.islemYap(arac, islemTuru);        
    }

}
