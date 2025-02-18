public class MataKuliah06 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah06() {
    }
    public MataKuliah06(String kode, String nama, int sks, int jam) {
        kodeMk = kode;
        this.nama = nama;
        this.sks = sks;
        jumlahJam = jam;
    }
    void tampilkanInformasi(){
        System.out.println("\nNama Mata Kuliah: " + nama);
        System.out.println("Kode Mata Kuliah: " + kodeMk);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    void ubahSKS(int sksBaru) {
        System.out.println("\nSKS Awal: " + sks);
        System.out.println("Perubahan SKS: " + sksBaru);
        sks = sksBaru;
        System.out.println("SKS Terbaru: " + sks);
    }
    void tambahJam(int jam) {
        System.out.println("\nJumlah Jam Awal: " + jumlahJam);
        System.out.println("Penambahan Jumlah Jam: " + jam);
        jumlahJam = jam;
        System.out.println("Jumlah Jam Terbaru: " + jumlahJam);
    }
    void kurangiJam(int jam) {
        if (jumlahJam > jam) {
            System.out.println("\nJumlah Jam Awal: " + jumlahJam);
            System.out.println("Pengurangan Jumlah Jam: " + jam);
            jumlahJam = jam;
            System.out.println("Jumlah Jam Terbaru: " + jumlahJam);
        } else {
            System.out.println("Mohon maaf, jumlah jam tidak dapat dirubah");
        }
    }
}
