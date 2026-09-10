import java.util.*;
public class arraylist_function {
public static void method(ArrayList<Integer>list){
    list.set(2,10);
    System.out.println(list);
    list.add(2,3);
    System.out.println(list);
    System.out.println(list.size());   

}
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        method(list);
    }
}
