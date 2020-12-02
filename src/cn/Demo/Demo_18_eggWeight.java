package cn.Demo;

import java.util.Scanner;

public class Demo_18_eggWeight {
    public static void main(String[] args) {
        System.out.println("请在第一行输入鸡蛋个数N(N<1000)和每盒个数M(M<N):");
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        float[] weight = new float[N];
        System.out.println("请在第二行输入N个鸡蛋的每个重量:");
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            weight[i]=scanner1.nextFloat();
        }
        float temp=0;
        for (int i = 1; i < weight.length; i++) {
            for (int j = 0; j < weight.length-i; j++) {
                if (weight[j]>weight[j+1]){
                    temp=weight[j];
                    weight[j]=weight[j+1];
                    weight[j+1]=temp;
                }
            }
        }
        float sum=0;
        float max=0;
        for (int i = 0; i < weight.length; i=i+M) {
            for (int j = 0; j < M; j++) {
                sum+=weight[i+j];
            }
            if (sum>max) {
                max=sum;
            }
            sum=0;
        }
        System.out.println("符合条件的最重一盒鸡蛋的总重量为：");
        System.out.printf("%.2f",max);
    }
}
