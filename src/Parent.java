class Parent {
    String name;
    void doIt(){
        System.out.println("do it from parent");
    }
}

class Child extends Parent{
    String name;
    void doIt(){
        System.out.println("do it from child");
        System.out.println("parent name is "+ super.name);
    }
}
