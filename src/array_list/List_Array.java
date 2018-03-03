package array_list;
import java.util.*;
public class List_Array {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size "+number.size());
                                          //adding elements
        number.add(40);
        number.add(10);
        number.add(50);
        number.add(30);
        number.add(4,20);                 // position, element
        
        System.out.println(number);       //All element print
        System.out.println("For each");
        
        for(int x : number){
            System.out.println(" "+x);
        }
        System.out.println("Using Iterator");
        
        Iterator itr = number.iterator();
        
        while(itr.hasNext()){
            System.out.println(" "+itr.next());
        }
        for(int i=0; i<number.size(); i++)
        {
            //System.out.println(number.);
        }
        //Remove
        number.remove(0);   //remove number
        number.remove(2);
        System.out.println(number);
        System.out.println("Size "+number.size());
        number.removeAll(number);    //remove all
        System.out.println("After remove all: "+number);
        System.out.println("Size "+number.size());
    }
    
}
