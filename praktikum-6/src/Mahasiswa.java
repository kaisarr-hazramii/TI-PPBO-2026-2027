public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    // Constructor default (tanpa parameter)
    public Mahasiswa(){
        nama = "Belum diisi";
        nim = "_";
        ipk = 0.0;
    }
    public Mahasiswa(String namaAwal,String nimAwal,double ipkAwal) {
        nama = namaAwal;
        nim = nimAwal;
        ipk = ipkAwal;
    }
}
