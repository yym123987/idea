package cn.Demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 对于给出的长度为N（N<1000）的正整数数组，满足连续3个元素均为合数的区间称为3合数区间，计算该数组中3合数区间的个数
 *输入说明：第一行，数组中元素个数N，第二行，N个正整数，用空格隔开。
 * 输出说明：3合数区间的个数
 * 输入样例：7
 * 6 8 4 9 7 5 8
 * 输出样例：2
 */
public class Demo_8_heShuQuJian {
    public static void main(String[] args) {
        System.out.println("请输入数组的大小N(N<1000):");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        System.out.println("请输入数组中的元素：");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        int count=0;
        for (int j = 0; j < arr.length-2; j++) {
            boolean fag = false;
            for (int k = 0; k < 3; k++) {
                for (int t = 2; t <11 ; t++) {
                    int num = arr[j+k] % t;
                    if (num==0 && arr[j+k]!=t) {
                        fag = true;
                        break;
                    }
                }
                if (fag && k<2) {
                    fag=false;
                }else if (!fag){
                    break;
                }
            }
            if (fag){
                count++;
            }
        }
        System.out.println("3合数区间的个数为："+count);
    }
}
