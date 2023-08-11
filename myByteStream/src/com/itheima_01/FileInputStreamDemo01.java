/*
package com.itheima_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputStreamDemo01 {
    //根据数据源创建字节输入流对象
    FileInputStream fis;

    {
        try {
            fis = new FileInputStream("E:\\itcast");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //根据目的的创建字节输出流对象
    FileOutputStream fos;

    {
        try {
            fos = new FileOutputStream("E:\\itcast");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //读取
    int by;
   // while(by = fis.read()!=-1){
       // fos.write(by);
    }

    //释放资源
  //  fis.close();
   // fos.close();
}
*/
