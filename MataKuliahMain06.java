public class MataKuliahMain06 {

    public static void main(String[] args) {
        MataKuliah06 matkul1 = new MataKuliah06();
        matkul1.nama = "Algoritma dan Struktur Data";
        matkul1.kodeMk = "ASD111";
        matkul1.sks = 2;
        matkul1.jumlahJam = 4;

        matkul1.tampilkanInformasi();
        matkul1.ubahSKS(3);
        matkul1.tambahJam(2);
        matkul1.kurangiJam(0);
        matkul1.tampilkanInformasi();

        MataKuliah06 matkul2 = new MataKuliah06("Praktikum Algoritma dan Struktur Data", "ASD222",4,8 );
        matkul2.tampilkanInformasi();
        matkul2.ubahSKS(3);
        matkul2.tambahJam(0);
        matkul2.kurangiJam(2);
        matkul2.tampilkanInformasi();
    }
}