package cn.jihe;

import java.util.ArrayList;
import java.util.Collections;

public class DiZhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors={"♣","♠","♦","♥"};
        String[] number={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        poker.add("大王");
        poker.add("小王");
        //组合牌
        for (String num: number) {
            for (String co: colors) {
                poker.add(co+num);
            }
        }
        //洗牌,static void shuffle(List<?> list)使用默认的随机源随机排列指定的列表。
        Collections.shuffle(poker);
        //System.out.println(poker);
        //发牌
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String> diPai=new ArrayList<>();
        for (int i = 0; i <poker.size() ; i++) {
            String s = poker.get(i);
            if(i>=51){
                diPai.add(s);
            }else if(i%3==0){
                player1.add(s);
            }
            else if(i%3==1){
                player2.add(s);
            }
            else if(i%3==2){
                player3.add(s);
            }
        }
        System.out.println("player1:"+player1);
        System.out.println("player2:"+player2);
        System.out.println("player3:"+player3);
        System.out.println("底牌："+diPai);
    }
}

