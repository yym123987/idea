package cn.Demo;

import java.util.Scanner;

public class Demo_10_Types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int cha=0,num=0,others=0;
        for (int i = 0; i < line.length(); i++) {
            char charAt = line.charAt(i);
            if (charAt>='a' && charAt<='z'){
                cha++;
            }else if (charAt>='A' && charAt<='Z'){
                cha++;
            }else if (charAt>='0' && charAt<='9'){
                num++;
            }else if (charAt!=' '){
                others++;
            }
        }
        System.out.println("此字符组里面字符包含个数："+cha+" "+"数字包含个数："+num+" "+"其他字符包含个数："+others);
    }
}
