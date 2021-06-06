package java1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 = "civic";
        String s2 = "ivcic";
        if(s1.length() ==s2.length()){
         char[] arr1 = s1.toCharArray();
         Arrays.sort(arr1);
         System.out.println(Arrays.toString(arr1));
         char[] arr2 =s2.toCharArray();
         Arrays.sort(arr2);
         System.out.println(Arrays.toString(arr2));
         System.out.println(Arrays.equals(arr1, arr2));
         if(arr1.equals(arr2))
         {
             System.out.println("strings are anagram");

         }
         else{
             System.out.println("Strings are not anagram");
         }
         
    }

    }
    
}
