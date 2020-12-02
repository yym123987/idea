package cn.Demo;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Demo_2 {
    public static void main(String[] args) {
        int[] nums=new int[4];
        int target=10;
        System.out.println("输入一个数组:");
        for (int i = 0; i < nums.length; i++) {
            Scanner a=new Scanner(System.in);
            nums[i]= a.nextInt();
        }
        for (int j = 0; j < nums.length; j++) {
            for (int k = j+1; k < nums.length; k++) {
                if (nums[j]+nums[k]==target){
                    System.out.println("和为10的两个数的下标为:"+j+"，"+k);
                }
            }
        }
    }
}
