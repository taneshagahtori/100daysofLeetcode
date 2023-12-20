class Solution {
    public String reverseVowels(String s) {
        char a[]=s.toCharArray();
        int start=0;
        int end=a.length-1;
        while(start<end) {
            if(!isVowel(a[start])) {
                start++;
            }
            else if (!isVowel(a[end])) {
                end--;
            }
            else {
                char temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
        }
        return String.valueOf(a);
    }
    public boolean isVowel (char ch){
        if (ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i'||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}