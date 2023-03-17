public class Person {

    // field/attribute/properties
    String name;
    String address;
    final String country = "Indonesia";

    // contructor adalah method yg akan dipanggil ketika pertama kali object dibuat
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    // contructor overloading

    // contructor memanggil contructor yg lain
    // person(paramName) memanggil person utama
    Person(String paramName){
        this(paramName, null);
    }

    // person memanggil person(paramName)
    Person(){
        this(null);
    }

    // menggunakan void karena tidak mengembalikan data apapun (return)
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
