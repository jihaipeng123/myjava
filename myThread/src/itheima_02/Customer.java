package itheima_02;

public class Customer implements Runnable{

    private Box b ;

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while(true){
            b.get();
        }
    }
}
