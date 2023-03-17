package programmer.zaman.now.data;

public class Cat extends Animal{
    //bisa juga tanpa membuat method override, cukup jadikan cat sebagai abstract class
    public void run(){
        System.out.println("Cat " +name+ " is run");
    }
}
