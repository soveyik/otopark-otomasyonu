import java.util.HashMap;
import java.util.Map;

public class Personel {
    private Map<String , String> kullanicilar;
    private Map<String , String> kullaniciRolleri;
    private String kullaniciAdi;
    private String parola;

    public Personel(){
        kullanicilar = new HashMap<>();
        kullaniciRolleri = new HashMap<>();
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;

        kullanicilar.put("sevvalovyk", "1234");
        kullanicilar.put("root", "0000");
        kullanicilar.put("mert", "0001");
        kullanicilar.put("emirhan", "0002");
        kullanicilar.put("eslem", "5678");

        kullaniciRolleri.put("sevvalovyk", "admin");
        kullaniciRolleri.put("root", "müdür");
        kullaniciRolleri.put("mert", "müdür yardımcısı");
        kullaniciRolleri.put("emirhan", "işletme sahibi");
        kullaniciRolleri.put("eslem", "admin");
    } 
    
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

   
    public boolean girisYap(String kullaniciAdi, String parola){
    
        if(kullanicilar.containsKey(kullaniciAdi) && kullanicilar.get(kullaniciAdi).equals(parola)){
            System.out.println("Giriş başarılı.");
            return true;
        }else{
            System.out.println("Kullanıcı adı veya parolanız yanlış lütfen tekrar deneyin.");
            return false;
        }
    }

    public boolean yetkiKontrol(String kullaniciAdi, String işlem){
        String rol = kullaniciRolleri.get(kullaniciAdi);

        if("admin".equals(rol) && "özel işlem".equals(işlem)){
            System.out.println(kullaniciAdi +" kullanıcısına yetki verildi.");
            return true;
        }else{
            System.out.println(kullaniciAdi +" kullanıcısının işlemi yapma yetkisi bulunmuyor.");
            return false;
        }
    }
}