package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Pak";
        first = first + " " + "Eko";
        System.out.println(first);

        String second = "Pak Eko";
        System.out.println(second);

        System.out.println(first == first);
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}
