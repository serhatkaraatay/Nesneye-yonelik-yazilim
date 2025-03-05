public class Monitor {
    //
    private String model;
    private String uretici;
    private String boyut;
    private Resolution resolution;//resolution sınıfından bir nesne koyuldu

    Monitor(String model, String uretici, String boyut, Resolution resolution) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolution = resolution;
    }

    public void monitoru_kapat() {
        System.out.println("Monitor kapatılıyor...");
    }

    public String getUretici() {
        return uretici;
    }

    public String getModel() {
        return model;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
