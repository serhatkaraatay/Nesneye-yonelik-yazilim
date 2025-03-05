
public class GelismisAbone {
    private String isim;
    private int bakiye = 120;//her objenin ilk bakiye değeri 120
    private String sehir;

    public GelismisAbone(String isim, int bakiye, String sehir) {
        this.isim = isim;
        if (bakiye >= 0 && bakiye <= 120) {
            this.bakiye = bakiye;
        }
        this.sehir = sehir;
    }


    public void bakiye_ogren() {
        System.out.println("Bakiye : " + this.bakiye);
    }

    public void dogalgaz_kullan(int miktar) {
        if (this.bakiye < miktar) {
            System.out.println("Yeterli bakiye yok");
        } else {
            this.bakiye -= miktar;
            if (this.bakiye <= 0) {
                System.out.println("Bakiyeniz bitmiştir yükleme yapmalısınız" + "Kredi limiti = 120TL");
            } else {
                System.out.println("Yeni bakiye : " + bakiye);
            }
        }
    }

    public String getIsim() {
        return isim;
    }

    public int getBakiye() {
        return bakiye;
    }

    public String getSehir() {
        return sehir;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
}
