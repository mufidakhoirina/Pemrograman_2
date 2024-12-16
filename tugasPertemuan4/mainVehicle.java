package tugasPertemuan4;
public class mainVehicle {
    public static void main(String[] args) {
        // Create a Car object
        Car myFastCar = new Car();
        myFastCar.brand = "Ford"; // Set brand
        myFastCar.model = "Mustang"; // Set model
        myFastCar.tahun = 2020 ; // Set tahun
        myFastCar.jumlahPintu = 2; // Set jumlah pintu

        myFastCar.honk();
        myFastCar.displayCarInfo();

        // menghitung dan menampilkan tahun mobil
        int tahunIni = 2024; 
        int carAge = myFastCar.hitungTahun(tahunIni);
        System.out.println("Mobil ini " + carAge + " tahun.");
        // menampilkan type mobil
        myFastCar.vehicleType();
        System.out.println();
        
        myFastCar.brand = "Toyoti";
        myFastCar.model = "Rush";
        myFastCar.tahun = 2023;
        myFastCar.jumlahPintu = 4;
        
        myFastCar.honk();
        myFastCar.displayCarInfo();
        
        //menghitung tahun mobil
        int TahunIni = 2025;
        int CarAge = myFastCar.hitungTahun(TahunIni);
        System.out.println("Mobil Ini" + CarAge + "Tahun.");
        System.out.println();
        myFastCar.vehicleType();
    }
}