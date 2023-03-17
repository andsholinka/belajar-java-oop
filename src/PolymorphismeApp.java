public class PolymorphismeApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Andrey");
        employee.sayHello("Budi");

        employee = new Manager("Andrey");
        employee.sayHello("Budi");

        employee = new VicePresident("Andrey");
        employee.sayHello("Budi");

        sayHello(new Employee("Eko"));
        sayHello(new Manager("Eko"));
        sayHello(new VicePresident("Eko"));
    }

    static void sayHello(Employee employee){
        System.out.println("Hello "+ employee.name);
    }
}
