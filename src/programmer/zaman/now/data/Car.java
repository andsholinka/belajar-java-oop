package programmer.zaman.now.data;

public interface Car extends HasBrand, IsMaintenance{
    // interface mirip dengan abstract class, yg membedakan adalah semua method otomatis abstract
    // buatlah kontrak menggunakan interface

    void drive();

    int getTire();


}
