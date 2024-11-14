/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspboparameter;

/**
 *
 * @author USER
 */
class Donatur {
    private String nama;
    private String alamat;
    private double jumlahZakat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getJumlahZakat() {
        return jumlahZakat;
    }

    public void setJumlahZakat(double jumlahZakat) {
        this.jumlahZakat = jumlahZakat;
    }

    public void tampilkanInfoDonatur() {
        System.out.println("Nama Donatur: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jumlah Zakat: " + jumlahZakat);
    }
}

class Penerima {
    private String nama;
    private String alamat;
    private String kategori;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void tampilkanInfoPenerima() {
        System.out.println("Nama Penerima: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Kategori Penerima: " + kategori);
    }
}
