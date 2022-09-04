package Practise;

import java.util.*;

public class ReverseArray {
  
   
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
  
    public static void main(String[] args)
    {
        Integer [] arr = {1,2,3,4,5};
        reverse(arr);
    }
}