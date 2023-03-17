package programmer.zaman.now.data;

public class Product {
    // protected hanya bisa diakses di dalam package yg sama (data)
    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Product name: "+name+ ", price: "+price;
    }
}
