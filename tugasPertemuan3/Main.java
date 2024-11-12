package tugasPertemuan3;
public class Main {
   public static void Mahasiswa (String NIM, String Nama){
       System.out.println("Nama     : " + Nama);
       System.out.println("NIM      : " + NIM);
   }     
   public static void main(String[] args) {
       Mahasiswa ("2355201021", "Mufida Khoirina");
        Nilai NM = new Nilai();
        String NilaiPemrograman = NM.hitungNilai(80, 90, 75, 10);
        System.out.println("Nilai Pemrograman = " + NilaiPemrograman );
        
        String NilaiMatematika = NM.hitungNilai(80,90 , 100, 10);
        System.out.println("Nilai Matematika = " + NilaiMatematika);
        
        String NilaiBIndo = NM.hitungNilai(75, 90 , 20, 10);
        System.out.println("Nilai B.Indo = " + NilaiBIndo);
    }
}
