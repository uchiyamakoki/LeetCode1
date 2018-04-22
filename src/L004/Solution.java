package L004;

public class Solution {
    /*
    解法一：
当合并后的总元素个数是奇数时，中位数的下标是n/2。当总元素个数是偶数时，中位数是下标n/2-1和下标n/2两个元素的平均值。不论总个数奇
偶，可以将n/2作为右中位数，n/2-1作为左中位数，只不过总个数是奇数时，没用到左中位数。也就是说必须要找到第n/2+1个元素。
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1==null&&nums2==null){
            return -1;
        }
        int m=nums1.length;
        int n=nums2.length;
        int len=m+n;
        if(len==0){
            return -1;
        }
        if (n==0){
            return findMedianSortedArrays(nums2,nums1);
        }
        int left=-1,right=-1;//左中位数，右中位数
        int nums1Start=0,nums2Start=0;
        for (int i=0;i<len/2;i++){
            left=right;
            //就是俩数组从小到大取中位数
            if (nums1Start<m&&(nums2Start>n||nums1[nums1Start]<nums2[nums2Start])){
                right=nums1[nums1Start++];
            }else {
                right=nums2[nums2Start];
            }

        }
        //&1判断奇偶
        if ((len&1)==0) return (left+right)/2.0;
        else return  right;
    }
}
