class VicePresident extends Manager{

    // method overriding
    void sayHello(String name){
        System.out.println("Hi "+ name + ", My Name is VP "+ this.name);
    }

}
