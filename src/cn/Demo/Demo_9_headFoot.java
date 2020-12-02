package cn.Demo;

import java.util.Scanner;

/**
 * 某星球存在两种生物，A种生物有1个头6条腿，B种生物有3个头4条腿。
 * 来自地球的太空船刚刚在该星球降落，
 * 突然发现一大群这两种生物组成的队伍
 * ，由于时间紧，只数了头的数量和腿的数量，
 * 请帮助宇航员分析A、B两种生物各有多少个。
 * 输入说明：头的数量L腿的数量Z，（L，Z<=100000）；
 * 输出说明：A生物的数量B生物的数量（两个整数用一个空格隔开）；
 * 输入样例：10 32输出样例：4 2
 */
public class Demo_9_headFoot {
    public static void main(String[] args) {
        System.out.println("请分别输入所看到的头的个数与脚的个数：");
        Scanner input = new Scanner(System.in);
        int x,y,m,n;
        x = input.nextInt();
        y = input.nextInt();
        //计算A种生物的个数
        m=(3*y-4*x)/14;
        //计算B种生物的个数
        n=(6*x-y)/14;
        System.out.println("A物种的个数："+m+" "+"B物种的个数："+n);
    }
}
