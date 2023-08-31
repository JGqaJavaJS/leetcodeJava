package part1;

import java.util.Arrays;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(121));
        System.out.println(isNumberPalindrome(120));
        System.out.println(isNumberPalindrome(89198));
        System.out.println(isNumberPalindrome(943787349));
        System.out.println(isNumberPalindrome(943781349));
        System.out.println(isNumberPalindrome(0));
        System.out.println(isNumberPalindrome(-5));
    }

    public static boolean isNumberPalindromeWithString(int number) {
        if(number < 0) {return false;}
        String str = String.valueOf(number);
        char[] strArr = str.toCharArray();
        char[] reverseArr = new char [strArr.length];
        int i = strArr.length -1;
        for(char a: strArr) {
            reverseArr[i] = a;
            i--;
        }
        return Arrays.equals(reverseArr, strArr);
    }

    public static boolean isNumberPalindromeWithString2(int number) {
        if(number < 0) {return false;}
        String str = String.valueOf(number);
        int length = str.length()-1;
        for(int i = 0; i< length; i++, length--) {
            if(str.charAt(i) != str.charAt(length)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumberPalindrome(int number) {
        if(number < 0) {return false;}
        int res = 0;
        int num = number;
        while (num != 0) {
            res = num % 10 + res * 10;
            num = num / 10;
        }
        return res == number;
    }

}
/*
9. Palindrome Number

Given an integer x, return true if x is a  palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
