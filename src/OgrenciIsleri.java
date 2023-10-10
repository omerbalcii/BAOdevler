// OgrenciIsleri.java

// OgrenciIsleri sınıfı, Universite sınıfından türetiliyor
public class OgrenciIsleri extends Universite {
    protected int ogrenciSayisi; // Öğrenci sayısı
    protected String ogrenciBilgileri; // Öğrenci bilgileri
    private String ogrenciTC; // Öğrenci TC Kimlik Numarası

    public OgrenciIsleri(String universiteAdi, int ogrenciSayisi, String ogrenciBilgileri, String ogrenciTC) {
        super(universiteAdi);
        this.ogrenciSayisi = ogrenciSayisi;
        this.ogrenciBilgileri = ogrenciBilgileri;
        this.ogrenciTC = ogrenciTC;
    }

    // Öğrenci sayısını alma metodu 
    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    // Öğrenci sayısını ayarlama metodu 
    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    // Öğrenci bilgilerini alma metodu 
    public String getOgrenciBilgileri() {
        return ogrenciBilgileri;
    }

    // Öğrenci bilgilerini ayarlama metodu 
    public void setOgrenciBilgileri(String ogrenciBilgileri) {
        this.ogrenciBilgileri = ogrenciBilgileri;
    }

    // Öğrenci TC Kimlik Numarasını alma metodu 
    public String getOgrenciTC() {
        return ogrenciTC;
    }

    // Öğrenci TC Kimlik Numarasını ayarlama metodu 
    public void setOgrenciTC(String ogrenciTC) {
        // TC Kimlik Numarası ayarlanamaz (private olarak işaretlendi)
        this.ogrenciTC = ogrenciTC;
    }

    // Bilgileri görüntüleme metodu (Üst sınıfın abstract metodunu implemente ediyor)
    @Override
    public void bilgiGoruntule() {
        System.out.println("Üniversite Adı: " + getUniversiteAdi());
        System.out.println("Öğrenci Sayısı: " + ogrenciSayisi);
        System.out.println("Öğrenci Bilgileri: " + ogrenciBilgileri);
        System.out.println("Öğrenci TC Kimlik Numarası: " + ogrenciTC);
    }
}
