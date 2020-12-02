package cn.Demo;

import java.util.Random;
import java.util.jar.JarOutputStream;

public class Demo_1 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for (int i = 0; i <10 ;i++){
            int random = (new Random().nextInt(101))+200;
            arr[i]=random;
            System.out.println(arr[i]);
        }
        System.out.println("===============");
        int max=0;
        int min=300;
        for (int j = 0; j <10 ; j++) {
            if(max<arr[j]){
                max=arr[j];
            }
            if(min>arr[j]){
                min=arr[j];
            }
        }
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
    }
}
