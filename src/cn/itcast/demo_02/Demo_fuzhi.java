package cn.itcast.demo_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_fuzhi {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\1.jpg");
        FileOutputStream fos=new FileOutputStream("D:\\idea\\Project1\\1.jpg");
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
