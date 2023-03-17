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

        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP "+ employee.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager "+ employee.name);
        } else {
            System.out.println("Hello "+ employee.name);
        }
    }
}
