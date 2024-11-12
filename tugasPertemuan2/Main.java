package tugasPertemuan2;
public class Main {
    public static void main(String[] args) {
       Dosen d = new Dosen();
       Mahasiswa m = new Mahasiswa();
       MataKuliah mk = new MataKuliah();
        
        System.out.println("Selamat Datang di Sistem KRS Unu Blitar\n");
        System.out.println("Nama            = " + m.nama);
        System.out.println("Nama Dosen PA   = " + d.nama);
        System.out.println("Fakultas        = " + m.fakultas);
        System.out.println("Jurusan         = " + m.prodi);
        System.out.println("Jenis Kelamin   = " + m.JenisKelamin );
        System.out.println("Kur/Smt/SKS     = " + m.Smt );
        
        System.out.println("========================================================================================================\n");
        System.out.println("   Kode       Periode            Matakuliah               Kelas    Sks             Waktu \n" );
        System.out.println( mk.kode1 + mk.periode + mk.matkul1 + mk.kelas + mk.Sks1 + mk.waktu1);
        System.out.println( mk.kode2 + mk.periode + mk.matkul2 + mk.kelas + mk.Sks2 + mk.waktu2);
        System.out.println( mk.kode3 + mk.periode + mk.matkul3 + mk.kelas + mk.Sks3 + mk.waktu3);
        System.out.println( mk.kode4 + mk.periode + mk.matkul4 + mk.kelas + mk.Sks3 + mk.waktu4);
        System.out.println( mk.kode5 + mk.periode + mk.matkul5 + mk.kelas + mk.Sks1 + mk.waktu5);
        System.out.println( mk.kode6 + mk.periode + mk.matkul6 + mk.kelas + mk.Sks2 + mk.waktu6);
    }   
}
