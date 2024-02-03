//My solution:
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s1=word1.length();
        int s2=word2.length();
        int i=0;
        int j=0;
        String str = "";
        while(i<s1 && j<s2){
            str = str+word1.charAt(i++);
            str = str+word2.charAt(j++);
        }
        while(i<s1){
            str = str+word1.charAt(i++);
        }
        while(j<s2){
            str = str+word2.charAt(j++);
        }
        return str;
    }
}
