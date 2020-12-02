package cn.Demo;

import java.util.Scanner;

public class Demo_5_maoPao {
    public static void main(String[] args) {
        System.out.println("请先输入你要的数组大小：");
        Scanner aa=new Scanner(System.in);
        int a = aa.nextInt();
        int[] array=new int[a];
        System.out.println("再输入你的数组元素：");
        Scanner bb=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            int b = bb.nextInt();
            array[i]=b;
        }
        int[] c=maoPao(array);
        for (int k = 0; k < c.length; k++) {
            System.out.println(c[k]);
        }
    }

    private static int[] maoPao(int[] arr) {
        int temp=0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
