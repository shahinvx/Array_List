package array_list;
import java.util.*;
public class List_Array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size "+number.size());
                                          //adding elements
        number.add(40);
        number.add(10);
        number.add(50);
        number.add(30);
        number.add(4,20);                 // position, element
        
        System.out.println(number);
        number.clear();
        System.out.println("After clear: "+number);
        
        boolean b = number.isEmpty();
        System.out.println("Is there is any element: "+b);
        
        number.add(40);
        number.add(10);
        number.add(50);
        number.add(30);
        number.add(4,20);
        
        n = scan.nextInt();
        
        boolean contain = number.contains(n);
        System.out.println("Contain "+n+" number "+contain);
        int pos = number.indexOf(40);
        System.out.println("Index of 40: "+pos);
        
        number.set(3, 100);//replace
        System.out.println("After setting : "+number);
        
        int get = number.get(0);
        System.out.println("Index get : "+get);
        
        
    }
    
}
