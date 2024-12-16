package tugasPertemuan4;

class Vehicle {
    String brand;
    String model;
    int tahun;

    void honk() {
        System.out.println("Tuut, tuut!");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Tahun: " + tahun);
    }

    // menghitung usia vehicle
    int hitungTahun(int tahunIni) {
        return tahunIni - tahun;
    }
}