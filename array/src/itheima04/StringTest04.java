package itheima04;
//拼接字符串
import java.util.Scanner;
public class StringTest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3};
        String s = arratToString(arr);
        System.out.println("s: "+s);

    }

    public static String arratToString(int[] arr){
        String s = "";
        s += "[";
        for(int i =0; i < arr.length; i++){
            if(i == arr.length -1){
                s += arr[i];
            }else{
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
}
