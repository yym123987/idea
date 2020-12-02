package cn.Demo;

import java.io.*;

/**
 * 将一个五子棋棋谱转换一个二维数组
 * 再存储此局之前先将二维数组转换为稀疏数组来存储，可以减小很多内存空间
 *
 */
public class Demo_6_xiShuArray {
    public static void main(String[] args) {
        //创建一个原始数组
        int[][] arr=new int[11][11];
        arr[5][3]=4;
        arr[6][4]=2;
        //遍历输出二维数组
        System.out.println("原始数组为：");
        for (int[] row:arr){
            for (int data:row){
                System.out.print(data+" ");
            }
            System.out.println();
        }
        //获取原始数组中有的有效数的个数
        int sum=0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (arr[i][j]!=0){
                    sum++;
                }
            }
        }
        //创建稀疏数组
        int[][] xiShu_arr=new int[sum+1][3];
        xiShu_arr[0][0]=11;
        xiShu_arr[0][1]=11;
        xiShu_arr[0][2]=sum;
        //获取原始数组的有效数并且赋值给稀疏数组
        int count=0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (arr[i][j]!=0){
                    count++;
                    xiShu_arr[count][0]=i;
                    xiShu_arr[count][1]=j;
                    xiShu_arr[count][2]=arr[i][j];
                }
            }
        }
        //输出稀疏数组
        System.out.println("稀疏数组为：");
        for (int[] row1:xiShu_arr){
            for (int data1:row1){
                System.out.print(data1+" ");
            }
            System.out.println();
        }
        //将稀疏数组写出到文件
        File file=new File("E:\\array.txt");
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream(file);
            for (int i = 0; i < sum+1; i++) {
                for (int j = 0; j < 3; j++) {
                    fos.write(xiShu_arr[i][j]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //从文件中读取出稀疏数组
        System.out.println("====================");
        File file1=new File("E:\\array.txt");
        FileInputStream fis=null;
        byte[] bytes=new byte[4];
        int len=0;
        int temp=-1;
        while (true){
            try {
                fis=new FileInputStream(file1);
                if ((len=fis.read(bytes))!=-1){
                    for (int i = 0; i < sum +1; i++) {
                            temp++;
                            xiShu_arr[i][0] = bytes[temp] & 0xff;
                            xiShu_arr[i][1] = bytes[temp] & 0xff;
                            xiShu_arr[i][2] = bytes[temp] & 0xff;
                    }
                }else {
                    //输出稀疏数组
                    System.out.println("稀疏数组为：");
                    for (int[] row2:xiShu_arr){
                        for (int data2:row2){
                            System.out.print(data2+" ");
                        }
                        System.out.println();
                    }
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (fis!=null){
                        fis.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
