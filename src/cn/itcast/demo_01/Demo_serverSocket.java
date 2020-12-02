package cn.itcast.demo_01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo_serverSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        while(true) {
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        len = is.read(bytes);
                        System.out.println(new String(bytes, 0, len));
                        OutputStream os = socket.getOutputStream();
                        os.write("收到！已连接！".getBytes());
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
