class Manager extends Employee {

    Manager(){
        // default constuctor penting agar memudahkan ketika ada class child yg ingin extend parent
        // kalau tidak ada def-cons maka class child wajib memanggil constructor yg ada di parentnya
    }

    Manager(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hi "+ name + ", My Name is Manager "+ this.name);
    }
}