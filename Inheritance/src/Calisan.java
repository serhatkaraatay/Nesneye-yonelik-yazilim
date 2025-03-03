public class Calisan {
    //Ana Sınıf (Superclass) BaseClass
    private String isim;
    private int maas;
    private String departman;

    Calisan(String isim, int maas, String departman) {//Constructor
        this.setIsim(isim);
        this.setMaas(maas);
        this.setDepartman(departman);
    }

    public void calis() {
        System.out.println("Çalışan Çalışıyor...");
    }

    public void bilgilerigoster() {
        System.out.println("İsim: " + getIsim());
        System.out.println("Maas: " + getMaas());
        System.out.println("Departman: " + getDepartman());
    }

    public void departman_degistir(String yeni_departman) {
        System.out.println("Departman değiştiriliyor..");
        this.setDepartman(yeni_departman);
        System.out.println("Yeni departman: " + this.getDepartman());
    }

    public int getMaas() {
        return maas;
    }

    public String getDepartman() {
        return departman;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
