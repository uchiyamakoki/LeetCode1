package L007ReverseInteger;

public class ReverseInteger {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        int temp=Math.abs(x);
        String str=Integer.toString(temp);
        StringBuffer sb=new StringBuffer(str);
        String result=sb.reverse().toString();
        if (Long.parseLong(result)>Integer.MAX_VALUE){
            result="0";
        }
        return x>0?Integer.parseInt(result):-Integer.parseInt(result);
    }
}
