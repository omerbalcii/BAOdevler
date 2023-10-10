// Universite.java

// Soyut bir üst sınıf olan Universite sınıfı
public abstract class Universite {
    protected String universiteAdi; // Üniversite adı

    public Universite(String universiteAdi) {
        this.universiteAdi = universiteAdi;
    }

    // Üniversite adını alma metodu
    public String getUniversiteAdi() {
        return universiteAdi;
    }

    // Üniversite adını ayarlama metodu 
    public void setUniversiteAdi(String universiteAdi) {
        this.universiteAdi = universiteAdi;
    }

    // Soyut bir metot olarak üniversite bilgilerini görüntüleme (alt sınıflar tarafından implemente edilecek)
    public abstract void bilgiGoruntule();
}
