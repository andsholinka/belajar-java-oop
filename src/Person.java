public class Person {

    // field/attribute/properties
    String name;
    String address;
    final String country = "Indonesia";

    // menggunakan void karena tidak mengembalikan data apapun (return)
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
