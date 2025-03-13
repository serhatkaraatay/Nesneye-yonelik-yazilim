
class Hayvan {
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
    public static void konustur(Object object) {
        // System.out.println(object.konus());
        if (object instanceof Kopek) {
            Kopek kopek = (Kopek) object;
            System.out.println(kopek.konus());
        } else if (object instanceof Kedi) {
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());
        } else if (object instanceof At) {
            At at = (At) object;
            System.out.println(at.konus());
        } else if (object instanceof Hayvan) {
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());
        }
    }

    public static void main(String[] args) {
        //instanceof
        /*     Kopek kopek = new Kopek("Karabaş");
        //Tüm classlar Object sınıfından türetilir. ve bu sınıftan belirli metodlar alınır
        if(kopek instanceof Kopek) { //kopek instanceof Hayvan sınıfından yazdığımızda da true döner
            System.out.println("Bu nesne Köpek sınıfındandır..");
        }*/

        Kopek kopek = new Kopek("Köpük");
        Kedi kedi = new Kedi("Boncuk");
        At at = new At("Şahbatur");
        Hayvan hayvan = new Hayvan("Limon");
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
    }


}

