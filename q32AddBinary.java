class Solution {
    public String addBinary(String a, String b) {
        int carry=0;
        String result= "";
        int i=0;
        int num1=a.length();
        int num2=b.length();

        while(i<num1 || i<num2 || carry!=0) {
            int x=0;
            if (i<num1 && a.charAt(num1-1-i)=='1') x=1;
            int y=0;
            if (i<num2 && b.charAt(num2-1-i)=='1') y=1;

            result= (x+y+carry)%2 +result;
            carry=(x+y+carry)/2;
            i++;
        }
        return result;
    }
}