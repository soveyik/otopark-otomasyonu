import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AracYönetimi aracYönetimi = new AracYönetimi();
        RezervasyonYönetimi rezervasyonYönetimi = new RezervasyonYönetimi( aracYönetimi, null);
 

        // Araç listesini doldur
        aracYönetimi.araclarListesi();

        while (true) {
            System.out.println("Menü:");
            System.out.println("1. Tüm araçları listele");
            System.out.println("2. Yeni araç ekle");
            System.out.println("3. Decorator araçları göster");
            System.out.println("4. Rezervasyon yap");
            System.out.println("5. Tüm rezervasyonları listele");
            System.out.println("6. Müşteri oluştur");
            System.out.println("7. Ödeme yap");
            System.out.println("8. Çıkış");
            System.out.print("Bir seçenek girin: ");

            int secim = Integer.parseInt(scanner.nextLine());

            switch (secim) {
                case 1:
                    aracYönetimi.araclariListele();
                    break;

                case 2:
                    System.out.print("Araç ID'si girin: ");
                    String id = scanner.nextLine();
                    System.out.print("Marka girin: ");
                    String marka = scanner.nextLine();
                    System.out.print("Model girin: ");
                    String model = scanner.nextLine();
                    System.out.print("Vites türü girin: ");
                    String vites = scanner.nextLine();
                    System.out.print("Renk girin: ");
                    String renk = scanner.nextLine();
                    System.out.print("Yakıt türü girin: ");
                    String yakit = scanner.nextLine();
                    System.out.print("Yıl girin: ");
                    int yil = scanner.nextInt();
                    System.out.print("Kilometre girin: ");
                    int kilometre = scanner.nextInt();
                    System.out.print("Müsait mi (true/false): ");
                    boolean musait = scanner.nextBoolean();
                    scanner.nextLine(); // Yeni satırı tüket

                    Arac yeniArac = new Arac(id, marka, model, vites, renk, yakit, yil, kilometre, musait);
                    aracYönetimi.aracEkle(yeniArac);
                    System.out.println("Araç başarıyla eklendi.");
                    break;

                case 3:
                    DecoratorAracInterface klasikArac = new KlasikArac();
                    DecoratorAracInterface lüksArac = new LuksArac(new KlasikArac());
                    DecoratorAracInterface sporArac = new SporArac(new KlasikArac());

                    System.out.println("Decorator Araç Özellikleri:");
                    klasikArac.assemble();
                    lüksArac.assemble();
                    sporArac.assemble();
                    break;

                case 4:
                    System.out.print("Rezervasyon yapmak için araç ID'sini girin: ");
                    String aracID = scanner.nextLine();
                    System.out.print("Rezervasyon tarihi (yyyy-MM-dd): ");
                    String rezerveTarihiStr = scanner.nextLine();
                    System.out.print("İade tarihi (yyyy-MM-dd): ");
                    String iadeTarihiStr = scanner.nextLine();

                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        Date rezerveTarihi = dateFormat.parse(rezerveTarihiStr);
                        Date iadeTarihi = dateFormat.parse(iadeTarihiStr);

                        boolean rezerveBasarili = rezervasyonYönetimi.rezerveArac(null, aracID, rezerveTarihi, iadeTarihi);
                        if (rezerveBasarili) {
                            System.out.println("Rezervasyon başarıyla tamamlandı!");
                        } else {
                            System.out.println("Geçersiz araç ID'si veya araç müsait değil!");
                        }
                    } catch (ParseException e) {
                        System.out.println("Geçersiz tarih formatı!");
                    }
                    break;

                case 5:
                    rezervasyonYönetimi.rezervasyonlariListele();
                    break;

                case 6:
                    System.out.print("Ad girin: ");
                    String ad = scanner.nextLine();
                    System.out.print("Soyad girin: ");
                    String soyad = scanner.nextLine();
                    System.out.print("Araç plaka numarası girin: ");
                    String aracPlaka = scanner.nextLine();
                    System.out.print("Kiralama türü girin: ");
                    String kiralamaTuru = scanner.nextLine();
                    System.out.print("Adres girin: ");
                    String adres = scanner.nextLine();
                    System.out.print("Telefon numarası girin: ");
                    String telefonNo = scanner.nextLine();
                    System.out.print("E-posta girin: ");
                    String email = scanner.nextLine();

                    Musteri musteri = new Musteri.MusteriBuilder(ad, soyad, aracPlaka, kiralamaTuru)
                            .adres(adres)
                            .telefonNo(telefonNo)
                            .email(email)
                            .build();

                    System.out.println("Müşteri başarıyla oluşturuldu.");
                    System.out.println(musteri);
                    break;

                case 7:
                    System.out.println("Ödeme yöntemi seçin:");
                    System.out.println("1. Kredi Kartı");
                    System.out.println("2. Havale");
                    int odemeSecim = scanner.nextInt();
                    scanner.nextLine(); // Yeni satırı tüket

                    if (odemeSecim == 1) {
                        System.out.print("Kart üzerindeki isim: ");
                        String kartIsim = scanner.nextLine();
                        System.out.print("Kart numarası: ");
                        String kartNumara = scanner.nextLine();
                        System.out.print("CVV: ");
                        String cvv = scanner.nextLine();
                        System.out.print("Son kullanma tarihi (AA/YY): ");
                        String sonKullanma = scanner.nextLine();
                        System.out.print("Tutar: ");
                        double tutar = scanner.nextDouble();
                        scanner.nextLine(); // Yeni satırı tüket

                        Odeme krediKartOdeme = new KrediKartStrategy(kartIsim, kartNumara, cvv, sonKullanma, tutar);
                        krediKartOdeme.pay(tutar);
                    } else if (odemeSecim == 2) {
                        System.out.print("Banka adı: ");
                        String bankaAdi = scanner.nextLine();
                        System.out.print("Hesap numarası: ");
                        String hesapNumara = scanner.nextLine();
                        System.out.print("IBAN: ");
                        String iban = scanner.nextLine();
                        System.out.print("Tutar: ");
                        double tutar = scanner.nextDouble();
                        scanner.nextLine(); // Yeni satırı tüket

                        Odeme havaleOdeme = new HavaleStrategy(bankaAdi, hesapNumara, iban, tutar);
                        havaleOdeme.pay(tutar);
                    } else {
                        System.out.println("Geçersiz ödeme yöntemi!");
                    }
                    break;

                case 8:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Geçersiz seçenek! Lütfen tekrar deneyin.");
            }
        }
        
    }
}