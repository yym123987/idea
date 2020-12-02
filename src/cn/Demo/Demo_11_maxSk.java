package cn.Demo;

import java.util.Scanner;

public class Demo_11_maxSk {
    public static void main(String[] args) {
        System.out.println("请输入数组的大小N和子区间K：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int k = scanner.nextInt();
        System.out.println("请输入数组中的元素：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum=0,max=0;
        boolean fag=false;
        for (int j = 0; j < arr.length-k; j++) {
            for (int t = 0; t < k; t++) {
                for (int r = 2; r < 11; r++) {
                    int temp = arr[j + t] % r;
                    if (temp==0 && arr[j+t]!=r){
                        fag=true;
                        break;
                    }
                }
                if (!fag){
                    sum=sum+arr[j+t];
                }else {
                    fag=false;
                }
            }
            if (sum>max){
                max=sum;
            }
            sum=0;
        }
        System.out.println("所有"+k+"区间中最大素数和Sk值为"+max);
    }
}
