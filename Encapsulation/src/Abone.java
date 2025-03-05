//Doğalgaz Abonesi
public class Abone {
    public String isim;
    public int bakiye;
    public String sehir;

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

    public void bakiye_ogren() {
        System.out.println("Bakiye: " + bakiye);

    }
}
