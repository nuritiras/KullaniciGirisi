package tr.com.nuritiras.kullanicigirisi;

public class Singleton {
    private String kullaniciAdi;
    private String kulaniciParola;
    private static Singleton singleton;

    public Singleton() {
    }

    //Kullanıcı Adı için getter ve setter
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    // Kullanıcı Parolası için getter ve setter
    public String getKulaniciParola() {
        return kulaniciParola;
    }

    public void setKulaniciParola(String kulaniciParola) {
        this.kulaniciParola = kulaniciParola;
    }

    //Singleton sınıfının nesne oluşturması
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
