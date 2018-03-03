package array_list;
import java.util.*;
public class List_Array3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        
        number1.add(11);
        number1.add(21);
        number1.add(31);
        number1.add(41);
        System.out.println(number1);
        
        number2.add(12);
        number2.add(22);
        number2.add(32);
        number2.add(42);
        System.out.println(number2);
        
        number3.addAll(number1); // copy one array list to other
        System.out.println(number3);
        
        boolean res = number1.equals(number3);
        System.out.println("Number 1 = Number 3 !!! "+res);
        
        
    }

}
