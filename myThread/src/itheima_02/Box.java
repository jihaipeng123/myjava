package itheima_02;//338

public class Box {
    private int milk;
    //表示奶箱状态
    private boolean state= false;

    public synchronized void put(int milk){
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没有就生产牛奶
        this.milk = milk;
        System.out.println("送奶工将"+this.milk+"瓶奶送入奶箱");

        state = true;

        //唤醒其他等待的线程
        notifyAll();
    }

    public synchronized void get(){
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("用户拿到第"+this.milk+"瓶奶");
        state = false;

        //唤醒其他等待的线程
        notifyAll();
    }
}
