package TwoSum;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
        return  a;
    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int[] a=twoSum(nums,9);
        System.out.print("[");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
            if (i<a.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}