public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Person", "Bengkulu");

//        person1.name = "Andrey";
//        person1.address = "Bengkulu";

//        System.out.println(person1.name);
//        System.out.println(person1.address);
//        System.out.println(person1.country);

        person1.sayHello("Enzo");

        var person2 = new Person("Person2");
        var person3 = new Person();

        person2.sayHello("Enzo");
        person3.sayHello("Enzo");

    }
}
