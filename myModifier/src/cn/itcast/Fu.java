package cn.itcast;

public class Fu {

    private void show(){
        System.out.println("private");
    }
    void show2(){
        System.out.println("默认");
    }
    protected void show3(){
        System.out.println("protected");
    }
    public void show4(){
        System.out.println("public");
    }

    public static void main(String[] args) {
        //创建父类对象，并测试
        Fu f = new Fu();
        f.show();
        f.show2();
        f.show3();
        f.show4();
    }


}
