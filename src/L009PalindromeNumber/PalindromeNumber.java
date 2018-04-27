package L009PalindromeNumber;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;

        int count = 0;
        int testx = x;
        while(testx!=0){
            int r = testx%10;
            testx = (testx-r)/10;
            count++;
        }

        int newx = x;
        int result = 0;
        while(newx!=0){
            int r = newx%10;
            int carry = 1;
            int times = count;
            while(times>1){
                carry = carry*10;
                times--;
            }
            result = result+r*carry;
            newx= (newx-r)/10;
            count--;
        }

        return result==x;

    }
}
