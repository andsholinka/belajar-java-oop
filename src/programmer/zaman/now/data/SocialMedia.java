package programmer.zaman.now.data;

public class SocialMedia {
    String name;
}

class Facebook extends SocialMedia {
    final void login(String username, String password) {

    }
}

class FakeFacebook extends Facebook{

    // final method - tidak bisa di ovveride oleh turunannya
//    void login(String username, String password) {
//
//    }
}