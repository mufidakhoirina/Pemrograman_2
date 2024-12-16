package tugasPertemuan4;

public class Car extends Vehicle {
    int jumlahPintu = 4; //set default

    void displayCarInfo() {
        displayInfo(); 
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    void vehicleType() {
        System.out.println("Ini Mobil Guis (Yaudah).");
    }
}
