class Solution {
    public String toHex(int num) {
        
        if (num==0) return "0";
        Long num1= (long)num;
        if (num1<0) {
            num1= (long)Math.pow(2,32)-Math.abs(num1);
        }
        char c[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String result="";
        while (num1!=0) {
            int rem=(int)(num1%16);
            result=c[rem]+result;
            num1/=16;
        }
        return result;
    } 
}