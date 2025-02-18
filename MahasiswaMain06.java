public class MahasiswaMain06 {
    public static void main(String[] args) {
        Mahasiswa06 mhs1 = new Mahasiswa06();
        mhs1.nama = "Gilang Bayu Irwana";
        mhs1.nim = "244107020194";
        mhs1.kelas = "TI 1F SEM1";
        mhs1.ipk = 3.50;
        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1F SEM2");
        mhs1.updateIpk(3.56);
        mhs1.tampilkanInformasi();

        Mahasiswa06 mhs2 = new Mahasiswa06("Annisa Nabila","2141720160",3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();;
    }  
}
