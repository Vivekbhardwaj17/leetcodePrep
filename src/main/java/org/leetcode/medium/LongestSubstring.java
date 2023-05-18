package org.leetcode.medium;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aab"));
     }
    public static int lengthOfLongestSubstring(String s) {
        String longestString ="";
        int maxLength=0;

        for(char c: s.toCharArray()){
            if(!longestString.contains(Character.toString(c)))
                longestString += Character.toString(c);
            else{
                maxLength = Math.max(maxLength,longestString.length());
                int ind = longestString.indexOf(c)+1;
                int longestStringr = longestString.length();
                longestString = longestString.substring(longestString.indexOf(c)+1,
                        longestString.length())+Character.toString(c);
            }
        }
        maxLength = Math.max(maxLength,longestString.length());
        return maxLength;
    }
}
