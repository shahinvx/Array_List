package array_list;
import java.util.*;
public class Array_List {
    public static void main(String[] args) {
        int arr[]={5,6,7,3,2,5,9,1,0}; //declare and initialize
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        String names[] = {"shahin","swarna","love","together"};
        Arrays.sort(names);
        for(int j=0; j<names.length; j++)
        {
            System.out.print(" "+names[j]);
        }
        System.out.println();   
    }
    
}

