public class DosenMain06 {
    public static void main(String[] args) {
        Dosen06 dosen1 = new Dosen06();
        dosen1.idDosen = "123";
        dosen1.nama = "Pak Dika";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2023;
        dosen1.bidangKeahlian = "Teknik Elektro";

        dosen1.tampilkanInformasi();
        dosen1.ubahKeahlian("Teknik Mesin");
        dosen1.hitungMasaKerja(2025);
        dosen1.tampilkanInformasi();

        Dosen06 dosen2 = new Dosen06("222","Ibu Hanifa", false, 2024, "Kedokteran");
        dosen2.tampilkanInformasi();
        dosen2.ubahKeahlian("Kedokteran Hewan");
        dosen2.hitungMasaKerja(2025);
        dosen2.tampilkanInformasi();
    }
}
