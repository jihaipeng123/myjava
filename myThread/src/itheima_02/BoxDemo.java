package itheima_02;//338

public class BoxDemo {
    public static void main(String[] args) {
        //创建奶箱对象
        Box b = new Box();
        //创建生产者对象
        Product p = new Product(b);

        Customer c = new Customer(b);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
