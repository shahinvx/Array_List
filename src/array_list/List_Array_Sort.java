package array_list;
import java.util.*;
public class List_Array_Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList number = new ArrayList<>();
        number.add(30);
        number.add(20);
        number.add(40);
        number.add(90);
        number.add(70);
        number.add(10);
        System.out.println("Before sort: "+number);
        
        Collections.sort(number);//sort the array LIST
        System.out.println("After ascending Sorting: "+number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("After Descending sort: "+number);
    }

}
