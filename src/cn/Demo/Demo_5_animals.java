package cn.Demo;

import java.io.Serializable;
import java.util.*;
public class Demo_5_animals {
    public static void main(String[] args) {
        List<Animal> animals=new ArrayList<Animal>();
        while (true){
            //如果不输入则默认为操作1
            int temp = 1;
            System.out.println("请输入你要进行的操作序号：1为增加，2为删除，3为修改，4为查询，5为年龄排序,0为退出操作");
            Scanner a = new Scanner(System.in);
            temp = a.nextInt();
            if (temp==0){
                System.out.println("你已退出操作!");
                break;
            }
            switch (temp) {
                case 1:
                    Animal animal1 = new Animal();
                    System.out.println("该操作为增加操作：");
                    System.out.println("请分别输入动物的种类，性别，年龄：");
                    Scanner b = new Scanner(System.in);
                    String type1 = b.nextLine();
                    String sex1 = b.nextLine();
                    int age1 = b.nextInt();
                    animal1.setType(type1);
                    animal1.setSex(sex1);
                    animal1.setAge(age1);
                    animals.add(animal1);
                    System.out.println("增加成功！");
                    System.out.println(animals);
                    break;
                case 2:
                    System.out.println("该操作为删除操作：");
                    System.out.println("请分别输入动物的种类，性别，年龄：");
                    Scanner c = new Scanner(System.in);
                        String type2 = c.nextLine();
                        String sex2 =  c.nextLine();
                        int age2 = c.nextInt();
                        for (int i = 0; i < animals.size(); i++) {
                            String type = animals.get(i).getType();
                            String sex = animals.get(i).getSex();
                            Integer age = animals.get(i).getAge();
                            if (type2.equals(type) && sex2.equals(sex) && age2==age) {
                                animals.remove(i);
                                System.out.println("删除成功！");
                                break;
                            }
                            System.out.println("该动物不存在！");
                        }
                    System.out.println(animals);
                    break;
                case 3:
                    //Animal animal3 = new Animal();
                    System.out.println("该操作为修改操作：");
                    System.out.println("请输入你所需要修改的动物的种类和性别和年龄来查询此动物：");
                    Scanner d = new Scanner(System.in);
                        String type3 = d.nextLine();
                        String sex3 = d.nextLine();
                        int age3 = d.nextInt();
                    for (int y = 0; y < animals.size(); y++) {
                            String type = animals.get(y).getType();
                            String sex = animals.get(y).getSex();
                            Integer age = (Integer) animals.get(y).getAge();
                        if (type3.equals(type) && sex3.equals(sex) && age3==age) {
                            System.out.println("请输入你修改后的种类,性别,年龄：");
                            Scanner e = new Scanner(System.in);
                            Animal animal = animals.get(y);
                            String type4 = e.nextLine();
                            String sex4 = e.nextLine();
                            int age4 = e.nextInt();
                            animal.setType(type4);
                            animal.setSex(sex4);
                            animal.setAge(age4);
                            System.out.println("修改成功!");
                            System.out.println(animals);
                            break;
                            } else {
                            System.out.println("该动物不存在！");
                            }
                        }
                        break;
                case 4:
                    System.out.println("该操作为查询操作：");
                    System.out.println("请输入动物种类(或性别)和年龄进行查询：");
                    Scanner f = new Scanner(System.in);
                    String find =  f.next();
                    int i1 = f.nextInt();
                    for (int j = 0; j < animals.size(); j++) {
                        String type = animals.get(j).getType();
                        String sex = animals.get(j).getSex();
                        Integer age =  animals.get(j).getAge();
                        if (find.equals(type) || find.equals(sex) && i1==age){
                            System.out.println(animals.get(j).toString());
                            break;
                        }else {
                            System.out.println("无此动物！");
                        }
                    }
                    break;
                case 5:
                    //Animal animal5 = new Animal();
                    int[] ages =new int[10];
                    int temp1=0;
                    System.out.println("该操作为年龄排序操作：");
                    for (int k = 0; k < animals.size(); k++) {
                        ages[k]= (int) animals.get(k).getAge();
                    }
                    System.out.println("排序前的年龄数组为：");
                    for (int p = 0; p < ages.length; p++) {
                        System.out.print(ages[p]+",");
                    }
                    System.out.println("\n");
                    System.out.println("排序后的年龄数组为：");
                    for (int u = 0; u < ages.length-1; u++) {
                        for (int o = 0; o <ages.length-1 ; o++) {
                            if(ages[o]>ages[o+1]){
                                temp1=ages[o];
                                ages[o]=ages[o+1];
                                ages[o+1]=temp1;
                            }
                        }
                    }
                    for (int i = 0; i < ages.length; i++) {
                        System.out.print(ages[i]+",");
                    }
                    System.out.println("\n");
                default:
            }
        }
    }
}
