package programmer.zaman.now.data;

public class Avanza implements Car{
    // wajib mengimplementasi semua method yg ada di parent nya

    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
