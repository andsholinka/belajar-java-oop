public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Andrey");
//        manager.name = "Andrey";
        manager.sayHello("Enzo");

        var vp = new VicePresident("Sholinka");
//        vp.name = "Sholinka";
        vp.sayHello("Enzo");
    }
}
