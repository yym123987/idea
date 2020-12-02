package cn.itcast.demo_BS;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    创建一个BS版本的TCP服务器
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket= new ServerSocket(8080);
        //如果网页中有图片则需要另开一条线程去读取服务器的图片
        //处于监听状态
        while(true){
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        InputStream is = socket.getInputStream();
                        //只需要读取读出来的第一行即为地址   idea/web/index
                        //BufferedReader将网络字节输入流转换为字符缓冲输入流
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
                        String s = bufferedReader.readLine();//GET /idea/web/index.html HTTP/1.1
                        //切割
                        String[] s1 = s.split(" ");//  /idea/web/index.html
                        //去掉1前面的/,进行截取
                        System.out.println(s1[1]);
                        String s2 = s1[1].substring(1);// idea/web/index.html
                        FileInputStream fis = new FileInputStream(s2);
                        OutputStream os = socket.getOutputStream();
                        //写入HTTP协议的响应头，固定写法
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        //必须写入空行，否则浏览器不解析
                        os.write("\r\n".getBytes());
                        byte[] bytes=new byte[1024];
                        int len=0;
                        while((len=fis.read(bytes))!=-1) {
                            os.write(bytes,0,len);
                        }
                        fis.close();
                        socket.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
