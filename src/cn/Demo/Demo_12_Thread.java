package cn.Demo;

import java.io.*;
import java.lang.reflect.Array;

class Run implements Runnable{

    private int length;
    //private int off = 0;
    private byte[] a;
    //private byte[] b;
    private int x = 0;

    public void change_x(int x){this.x = x;}

    @Override
    public void run() {
        /*输入*/
        String fileName1 = "E:" + File.separator + "Passage1.txt";
        File f1 = new File(fileName1);
        InputStream in = null;
        try {
            in = new FileInputStream(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        length = (int)f1.length();      /*文件的大小*/
        //System.out.println(length);

        byte[] b1=new byte[length];

        try {
            in.read(b1, 0, b1.length);    /*储存了文本所有的值*/

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        a=new byte[length/2];

        if(x==0) {
            for (int i = 0; i < length/2; i++) {
                a[i] = b1[i];
            }
        }

        if(x==1) {
            for (int i = 0; i < length/2; i++) {
                a[i] = b1[length/2 + i];
            }
        }



        System.out.println(new String(a));


        /******************************************************************************/

        /*输出*/
        String fileName2 = "E:"+File.separator+"Passage2.txt";
        File f2 = new File(fileName2);
        OutputStream out = null;
        try {
            out = new FileOutputStream(f2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            out.write(b1);                  /*将b1打印到txt文本中*/
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
public class Demo_12_Thread {
    public static void main(String[] args) {
        Run r1 = new Run();
        Thread thread1 = new Thread(r1, "线程一");
        thread1.start();

        Run r2 = new Run();
        r2.change_x(1);
        Thread thread2 = new Thread(r2, "线程二");
        thread2.start();

    }
}

