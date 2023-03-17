public class Person {

    // field/attribute/properties
    String name;
    String address;
    final String country = "Indonesia";

    // contructor adalah method yg akan dipanggil ketika pertama kali object dibuat

    // penggunaan this merujuk ke attribute
    Person(String name, String address){
        this.name = name;
        this.address = name;
    }

    // contructor overloading

    // contructor memanggil contructor yg lain
    // person(paramName) memanggil person utama
    Person(String name){
        this(name, null);
    }

    // person memanggil person(paramName)
    Person(){
        this(null);
    }

    // menggunakan void karena tidak mengembalikan data apapun (return)
    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}
