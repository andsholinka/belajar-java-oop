public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "Andrey";
        manager.sayHello("Enzo");

        var vp = new VicePresident();
        vp.name = "Sholinka";
        vp.sayHello("Enzo");
    }
}
