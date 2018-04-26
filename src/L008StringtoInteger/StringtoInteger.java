package L008StringtoInteger;

public class StringtoInteger {



    public int myAtoi(String str) {
        //多个空格的特例。。。 而且要用isEmpty
        if(str==null||str.trim().isEmpty()){
            return 0;
        }

        //消除空格
        str=str.trim();

        char flag='+';

        //确认正数，负数 ''char ""string
        int i=0;
        if(str==""){
            return 0;
        }
        if (str.charAt(0)=='-'){
            flag='-';
            i++;
        }else if(str.charAt(0)=='+') {
            i++;
        }

        //用double存储结果
        double result=0;

        //计算
        while (str.length()>i&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
            result=result*10+(str.charAt(i)-'0');
            i++;
        }
        if (flag=='-'){
            result=-result;
        }
        //超过最大最小时
        if (result>Integer.MAX_VALUE){
            return  Integer.MAX_VALUE;
        }
        if (result<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }
}
