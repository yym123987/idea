package cn.Demo;

/**
 * 两个数组的交集
 */
public class Demo_3{
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] nums3=intersect(nums1,nums2);
        for (int num:nums3){
            System.out.println(num);
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] same=new int[2];
        int a=-1;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]){
                    for (int k = ++a; k < same.length; k++) {
                        same[k]=nums1[i];
                    }
                }
            }
        }
        return same;
    }
}
