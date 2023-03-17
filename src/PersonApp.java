public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person();

        person1.name = "Andrey";
        person1.address = "Bengkulu";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

    }
}
