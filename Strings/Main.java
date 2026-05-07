package Strings;

import java.util.*;

class findIndex {

    public int strStr(String haystack, String needle) {

        if(!haystack.contains(needle))
            return -1;

        int n = needle.length();

        for(int i = 0; i <= haystack.length() - n; i++) {

            if(haystack.substring(i, i + n).equals(needle))
                return i;
        }

        return -1;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter haystack: ");
        String haystack = sc.nextLine();

        System.out.print("Enter needle: ");
        String needle = sc.nextLine();

        findIndex obj = new findIndex();

        int result = obj.strStr(haystack, needle);

        System.out.println("Index = " + result);
    }
}