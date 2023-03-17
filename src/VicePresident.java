class VicePresident extends Manager{

    VicePresident(String name){
        super(name);
    }
    // method overriding
    void sayHello(String name){
        System.out.println("Hi "+ name + ", My Name is VP "+ this.name);
    }

}
