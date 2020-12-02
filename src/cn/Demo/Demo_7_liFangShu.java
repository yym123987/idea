package cn.Demo;

import java.util.Scanner;

public class Demo_7_liFangShu {
    public static void main(String[] args) {
        /*计算某一段程序消耗的内bai存和时du间*/
        Runtime r = Runtime.getRuntime();
        r.gc();//计算内存前先垃圾回bai收一次
        long startMem = r.freeMemory(); // 开始Memory
        long begin = System.currentTimeMillis();//开始baiTime
        System.out.println("请输入N(N<100000)的值：");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count=0;
        for (int i = 1; i < 47 ; i++) {
            int temp=i*i*i;
            if(temp>N){
                break;
            }
            count++;
        }
        System.out.println("1到N（含）之间的所有立方数的个数为："+count);
        long endMem =r.freeMemory(); // 末尾Memory
        long end=System.currentTimeMillis();
        long time=end-begin;
        System.out.println("消耗的内存："+(startMem-endMem));
        System.out.println("消耗的时间："+time);
    }
}
