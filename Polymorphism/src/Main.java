//bir nesnenin birden farklı nesne gibi davranması
//tanımlanan class'ların başında public yazmamalı
class Hayvan {          //SuperClass
    private String isim;

    Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Hayvan Konusuyor";
    }
}

class Kedi extends Hayvan {
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor";
    }
}

class Kopek extends Hayvan {
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor";
    }
}

class At extends Hayvan {
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kişniyor";
    }
}

public class Main {
    public static void konustur(Hayvan hayvan) {
        System.out.println(hayvan.konus());
    }
    public static void main(String[] args) {//1 ana class olacak geri kalanlar alt classlar. Alt classların referanslarını superclass'taki referansa eşitleyebiliyoruz

        Hayvan hayvan1 = new Kedi("Pamuk");
        System.out.println(hayvan1.konus());
        Hayvan hayvan2 = new Kopek("Karabaş");
        System.out.println(hayvan2.konus());
        Hayvan hayvan3 = new At("Batur");
        System.out.println(hayvan3.konus());
        konustur(new Kedi("Tekir"));
        konustur(new Kopek("Duman"));
        konustur(new At("Batur"));
        //tür dönüşümü yapmadan tek fonksiyonda kullanılmış oldu
    }

}
