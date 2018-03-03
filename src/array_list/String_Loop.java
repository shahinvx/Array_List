package array_list;
import java.util.*;
/**
 * 
 * @author shahinvx
 */
public class String_Loop {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name[] = {"shahin","swarna","love","together"};
        for(int i=0; i<name.length; i++) // Arrays.sort
        {
            System.out.println(name[i]);
        }
        String str = new String(); //Singele single string get input
        str = s.nextLine();
        for(int i=0; i<str.length(); i++)
        {
            System.out.println(str);
        }
        System.out.println(name.length);
        System.out.println(str.length());
        char ch[] = new char[100];
        ch = str.toCharArray();
        for(int j=0; j<ch.length; j++)
        {
            System.out.println(ch[j]);
        }
        Arrays.sort(ch);
        System.out.println("After sort :");
        for(int j=0; j<ch.length; j++)
        {
            System.out.print(ch[j]);
        }
        System.out.println();
    }

}
