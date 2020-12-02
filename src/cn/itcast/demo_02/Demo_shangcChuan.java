package cn.itcast.demo_02;

import java.io.*;
import java.util.Scanner;

/*
    需求:模拟用户上传头像的功能，假设所有用户头像都应该上传到项目下的libs文件夹中
 */
public class Demo_shangcChuan {
    public static void main(String[] args) throws IOException {
        File path = getPath();
        System.out.println("你所输入的头像的路径:"+path);
        boolean b = isExists(path.getName());//此处的getName()方法获取到最后的图片的名称
        if(b){
            System.out.println("该用户上传的头像已存在，上传失败！");
        }else {
            //判断为不存在，则就开始进行上传工作了
            upFile(path);
        }
    }

    //定义一个upFile()方法进行上传工作
    public static void upFile(File path) throws IOException {
        //BufferedInputStream是高效字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("libs/" + path.getName()));
        int len=0;
        byte[] bytes = new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
        System.out.println("上传成功！");
    }

    //定义一个getPath方法用来获取要上传的用户头像的路径
    public static File getPath() {
        Scanner sca = new Scanner(System.in);
        while(true){
            System.out.println("请输入你要上传的头像的路径:");
            String s = sca.nextLine();
            //判断是否为图片
            if(!s.endsWith(".jpg") && !s.endsWith(".png") && !s.endsWith(".bmp")){
                System.out.println("你输入的不是图片，请重新输入:");
                continue;
            }
            File file = new File(s);
            if(file.exists() && file.isFile()){
                return file;
            }else {
                System.out.println("你输入的路径不合法，请重新输入:");
            }
        }
    }
    //判断libs文件夹中是否已经存在用户所上传的头像
    public static boolean isExists(String s_path){
        File lb = new File("libs");
        //获取libs文件夹中所有文件夹或文件的名称数组
        String[] list = lb.list();
        for (String name : list) {
            if(name.equals(s_path)){
                return true;
            }
        }
        return false;
    }
}
