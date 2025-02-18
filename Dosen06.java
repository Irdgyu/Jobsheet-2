public class Dosen06 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen06() {
    }
    public Dosen06(String id, String nama, boolean status, int gabung, String bidang) {
        idDosen = id;
        this.nama = nama;
        statusAktif = status;
        tahunBergabung = gabung;
        bidangKeahlian = bidang;
    }
    void tampilkanInformasi() {
        System.out.println("\nID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status Keaktifan: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    void setStatusAktif(boolean status) {
        if (status) {
            System.out.println("\nStatus: Aktif");
        } else {
            System.out.println("Status: Tidak Aktif");
        }
    }
    int hitungMasaKerja(int tahunSkrg) {
        return tahunSkrg - tahunBergabung;
    }
    void ubahKeahlian(String bidang) {
        System.out.println("\nKeahlian Awal: " + bidangKeahlian);
        System.out.println("Perubahan Keahlian : " + bidang);
        bidangKeahlian = bidang;
        System.out.println("Keahlian Terbaru: " + bidangKeahlian);
    }
}
