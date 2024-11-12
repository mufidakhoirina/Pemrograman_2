package tugasPertemuan3;
public class Nilai {
   public String hitungNilai(int tugas, int uts, int uas, int absen){
       float nilai = (float) (tugas * 0.25 + uts * 0.3 + uas * 0.4 + absen * 0.1); 
       if (nilai >=90){
       return "A = LULUS";
   } else if (nilai >=75){
       return "B = LULUS";
   } else if (nilai >=60){
       return "C = TIDAK LULUS";
   } else if (nilai >= 50){
       return "D = TIDAK LULUS";
   } else {
       return "E = AMAT TIDAK LULUS";
   }
   }
}