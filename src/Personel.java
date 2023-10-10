// Personel.java

// Personel sınıfı, Universite sınıfından türetiliyor
public class Personel extends Universite {
    protected int calisanSayisi; // Çalışan sayısı
    protected String personelBilgileri; // Personel bilgileri

    public Personel(String universiteAdi, int calisanSayisi, String personelBilgileri) {
        super(universiteAdi);
        this.calisanSayisi = calisanSayisi;
        this.personelBilgileri = personelBilgileri;
    }

    // Çalışan sayısını alma metodu 
    public int getCalisanSayisi() {
        return calisanSayisi;
    }

    // Çalışan sayısını ayarlama metodu 
    public void setCalisanSayisi(int calisanSayisi) {
        this.calisanSayisi = calisanSayisi;
    }

    // Personel bilgilerini alma metodu 
    public String getPersonelBilgileri() {
        return personelBilgileri;
    }

    // Personel bilgilerini ayarlama metodu (setter)
    public void setPersonelBilgileri(String personelBilgileri) {
        this.personelBilgileri = personelBilgileri;
    }

    // Bilgileri görüntüleme metodu (Üst sınıfın abstract metodunu implemente ediyor)
    @Override
    public void bilgiGoruntule() {
        System.out.println("Üniversite Adı: " + getUniversiteAdi());
        System.out.println("Çalışan Sayısı: " + calisanSayisi);
        System.out.println("Personel Bilgileri: " + personelBilgileri);
    }
}
