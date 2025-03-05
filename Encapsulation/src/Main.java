public class Main {//başka bir sınıftan detayların gizlenmesi

    public static void main(String[] args) {
        /* Abone abone = new Abone();
        abone.isim = "Ahmet Yılmaz";
        abone.bakiye = 200;
        abone.sehir = "İstanbul";
        abone.dogalgaz_kullan(200);
        */

        GelismisAbone abone = new GelismisAbone("Mustafa Demir", 200, "İzmir");
        abone.bakiye_ogren();
    }
}
