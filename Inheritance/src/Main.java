public class Main {
    public static void main(String[] args) {
        //IS-A ilişkisi
        Calisan calisan1=new Calisan("Mehmet",3212,"Sib");
        Yonetici yonetici1=new Yonetici("Ahmet",2300,"IT",3);
        yonetici1.bilgilerigoster();
        calisan1.bilgilerigoster();
        yonetici1.zam_yap(300);
    }
}