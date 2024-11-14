/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspboparameter;

/**
 *
 * @author USER
 */
public class TUGASPBOPARAMETER {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Donatur donatur1 = new Donatur();
        donatur1.setNama("Ahmad");
        donatur1.setAlamat("Jl. Merdeka No.1");
        donatur1.setJumlahZakat(500000);

        System.out.println("=== Informasi Donatur ===");
        System.out.println("Nama Donatur: " + donatur1.getNama());
        System.out.println("Alamat: " + donatur1.getAlamat());
        System.out.println("Jumlah Zakat: " + donatur1.getJumlahZakat());

        System.out.println("-------------------------");

        Penerima penerima1 = new Penerima();
        penerima1.setNama("Siti");
        penerima1.setAlamat("Jl. Mawar No.3");
        penerima1.setKategori("Fakir");

        System.out.println("=== Informasi Penerima ===");
        System.out.println("Nama Penerima: " + penerima1.getNama());
        System.out.println("Alamat: " + penerima1.getAlamat());
        System.out.println("Kategori Penerima: " + penerima1.getKategori());
    }
}
