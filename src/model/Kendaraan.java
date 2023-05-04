package model;

public class Kendaraan {
    private String id;
    private String model;
    private String jenis;
    private int tahunPembuatan;
    private String noPlat;
    private int kapasitasPenumpang;
    private float dayaAngkut;

    public Kendaraan() {
        this.kapasitasPenumpang = 0;
        this.dayaAngkut = 0;
    }
    public Kendaraan(String id, String model, String jenis, int tahunPembuatan, String noPlat, int kapasitasPenumpang, float dayaAngkut) {
        this.id = id;
        this.model = model;
        this.jenis = jenis;
        this.tahunPembuatan = tahunPembuatan;
        this.noPlat = noPlat;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.dayaAngkut = dayaAngkut;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getJenis() {
        return jenis;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public float getDayaAngkut() {
        return dayaAngkut;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public void setDayaAngkut(float dayaAngkut) {
        this.dayaAngkut = dayaAngkut;
    }
    
    public String showData(){
        return 
                this.id + " | " + 
                this.model + " | " +
                this.jenis + " | " +
                this.tahunPembuatan + " | " +
                this.noPlat + " | " +
                this.kapasitasPenumpang + " | " +
                this.dayaAngkut+ " | ";
                
    }
    
    
}

