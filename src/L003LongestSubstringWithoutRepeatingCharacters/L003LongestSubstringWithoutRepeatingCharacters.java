package L003LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class L003LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        HashSet<Character> set=new HashSet<Character>();
        int max=0;
        int walker=0;
        int runner=0;
        //是否到最后一个char
        while (runner<s.length()){
            //是否包含重复char
            if(set.contains(s.charAt(runner))){
                if(max<runner-walker){
                    max=runner-walker;
                }//判断重复在那个位置
                while (s.charAt(walker)!=s.charAt(runner)){
                    set.remove(s.charAt(walker));//不是则移除
                    walker++;//walker向右移动
                }
                walker++;//重复的位置向右移动一位
            }else {
                set.add(s.charAt(runner));//不重复则添加
            }
            runner++;//runner向右移动最后
        }
         max=Math.max(max,runner-walker);//因为后面不重复不会进入循环
        return  max;
    }

    public static void main(String[] args) {
        String s="abcabcbb";
        int length=lengthOfLongestSubstring(s);
        System.out.println(length);
    }
}
