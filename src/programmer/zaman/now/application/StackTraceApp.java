package programmer.zaman.now.application;

public class StackTraceApp {
    public static void main(String[] args) {

        try {
            String[] names = {
                    "satu", "dua"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable){

            throwable.printStackTrace();
        }
    }

    public static void sampleError(){
        try {
            String[] names = {
                    "satu", "dua"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
