package L006ZigZagConversion;

public class ZigZagConversion {
    public String convert(String s, int nRows) {
        //空，长度0，行数不合理
        if(s==null||s.length()==0||nRows<=0){
            return "";
        }
        if (nRows==1){
            return s;
        }
    /*
     n=4时的走法是：

 0      6        12

 1   5 7    11 13

 2 4   8 10    14

 3      9         15
     */
        StringBuilder res=new StringBuilder();
        int size=2*nRows-2;
        for(int i=0;i<nRows;i++){
            for(int j=i;i<s.length();j+=size){
                //特例 1
                res.append(s.charAt(j));
                if(i!=0&&i!=nRows-1){
                    int temp=j+size-2*i;
                    if (temp<s.length()){
                        //这个就是 5
                        res.append(s.charAt(temp));
                    }
                }
            }
        }
        return res.toString();
    }
}
