package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {

        connectionDatabase("eko", "password");
        System.out.println("Sukses");
    }

    public static void connectionDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
