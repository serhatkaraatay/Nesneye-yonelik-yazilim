public class Test {//Has a ilişkisi

    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);
        Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");
        Anakart anakart = new Anakart("B250-Pro", "ASUS", 10, "Windows 10");
        Bilgisayar bilgisayar = new Bilgisayar(monitor, kasa, anakart);
        bilgisayar.getKasa().bilgisayari_ac();
        bilgisayar.getMonitor().monitoru_kapat();//monitor objesinin referansı üzerinden çağırıldı
        bilgisayar.getAnakart().isletim_sistemi_yukle("Ubuntu 16.04");
    }
}
