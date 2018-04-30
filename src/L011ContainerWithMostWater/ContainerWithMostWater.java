package L011ContainerWithMostWater;

public class ContainerWithMostWater {

    public static void main(String[] args){
        int[] a ={3,1,9,1};
        System.out.println(maxArea(a));
    }

    public static int maxArea(int[] a) {
        // TODO Auto-generated method stub
        int i = 0;
        int j = a.length-1;
        int maxS = 0;
        int thisS = 0;
        while(i!=j){

            thisS = Math.min(a[i],a[j])*(j-i);//高＊宽
            maxS = thisS>maxS?thisS:maxS;
            if(a[i]>a[j]){//突破点在高的柱子上
                j--;
            }else {
                i++;
            }
        }
        return maxS;
    }
}
