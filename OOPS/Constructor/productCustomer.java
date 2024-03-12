class Product {
    int item_no;
    String item_name;
    float price;
    int qty;

    Product(int a, String s, float f, int q) {
        item_no = a;
        item_name = s;
        price = f;
        qty = q;

    }

}

class Customer {
    int id;
    String name;
    String address;
    long phno;

    Customer(int i, String str, String add, long ph) {
        id = i;
        name = str;
        address = add;
        phno = ph;
    }
}

public class productCustomer {
    public static void main(String args[]) {
        Product P1 = new Product(1, "Soap", 399, 10);
        System.out.println("Item Number is : " + P1.item_no);
        System.out.println("Item Name is : " + P1.item_name);
        System.out.println("Item Price is : " + P1.price);
        System.out.println("Item Quantity is : " + P1.qty);
        Product P2 = new Product(2, "Detergent", 599, 20);
        System.out.println("Item Number is : " + P2.item_no);
        System.out.println("Item Name is : " + P2.item_name);
        System.out.println("Item Price is : " + P2.price);
        System.out.println("Item Quantity is : " + P2.qty);

    }
}
