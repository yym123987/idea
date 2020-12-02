package cn.Demo;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * hashMap求两个数组的交集
 */
public class Demo_3_hashMap {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        int[] nums3=intersect1(nums1,nums2);
        for (int num:nums3){
            System.out.println(num);
        }
    }

    private static int[] intersect1(int[] nums1, int[] nums2) {
        //将第一个数组元素放在hashMap中，key为元素，value为出现的次数
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (hashMap.containsKey(nums1[i])){
                hashMap.put(nums1[i],hashMap.get(nums1[i])+1);
            }else {
                hashMap.put(nums1[i],1);
            }
        }
        /*Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println(hashMap.get(key));
        }*/
        //遍历第二个数组，与第一个数组相同的元素先放在List集合中，再变成数组
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int j = 0; j < nums2.length; j++) {
            if (hashMap.containsKey(nums2[j])){
                linkedList.add(nums2[j]);
                hashMap.put(nums2[j],hashMap.get(nums2[j])-1);
                if (hashMap.get(nums2[j])==0){
                    hashMap.remove(nums2[j]);
                }
            }
        }
        int count=linkedList.size();
        /*System.out.println(count);*/
        int[] same=new int[count];
        for (int k = 0; k < same.length; k++) {
            same[k]=linkedList.poll();
        }
        return same;
    }
}
