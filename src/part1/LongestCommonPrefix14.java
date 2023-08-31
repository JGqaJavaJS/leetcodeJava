package part1;

public class LongestCommonPrefix14 {

    public static void main(String[] args) {
        String[] arr = {"cir","car"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] arr) {
        String res = "";
        String firstStrInArr = arr[0];
        String resFunction = "";
        for(int i = 0; i < firstStrInArr.length(); i++) {
            resFunction = isLetterInAllStringsOnPosition(arr, i, firstStrInArr.charAt(i));
            res = res + resFunction;
            if(resFunction == "") {
                return res;
            }
        }
        return res;
    }

    private static String isLetterInAllStringsOnPosition(String[] arr, int i, char c) {
        for(String a: arr) {
            if(a.length()-1 < i) { return "";}
            if(c != a.charAt(i)) {
                return "";
            }
        }
        return String.valueOf(c);
    }
}

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */
