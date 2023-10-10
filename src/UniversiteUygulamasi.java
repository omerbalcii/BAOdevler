// UniversiteUygulamasi.java //MAİN
public class UniversiteUygulamasi {
    public static void main(String[] args) {
        // Öğrenci İşleri nesnesi oluşturuluyor ve bilgiler atanıyor
        OgrenciIsleri ogrenciIsleri = new OgrenciIsleri("Düzce Üniversitesi", 10000, "Öğrenci İşleri Bilgileri", "12345678900");

        // Personel nesnesi oluşturuluyor ve bilgiler atanıyor
        Personel personel = new Personel("Düzce Üniversitesi", 2000, "Personel Bilgileri");

        //  Üniversite Bilgileri
        System.out.println("Düzce Üniversitesi Bilgileri:");
        ogrenciIsleri.bilgiGoruntule();
        System.out.println();

        // Öğrenci İşleri Bilgileri
        System.out.println("Öğrenci İşleri Bilgileri:");
        ogrenciIsleri.bilgiGoruntule();
        System.out.println();

        // Personel Bilgileri
        System.out.println("Personel Bilgileri:");
        personel.bilgiGoruntule();
        System.out.println();

        // Bilgileri güncelleme örnekleri
        ogrenciIsleri.setUniversiteAdi("Düzce TEKNİK Üniversitesi");
        ogrenciIsleri.setOgrenciSayisi(12000);
        ogrenciIsleri.setOgrenciBilgileri("Yeni Öğrencilerin Bilgileri şunlardır");
        personel.setCalisanSayisi(2500);
        personel.setPersonelBilgileri("Yeni Personellerin Bilgileri şunlardır");

        // Güncellenmiş bilgileri görüntüleme
        System.out.println("\nGüncellenmiş Bilgiler:");
        ogrenciIsleri.bilgiGoruntule();
        System.out.println();
        personel.bilgiGoruntule();
    }
}
