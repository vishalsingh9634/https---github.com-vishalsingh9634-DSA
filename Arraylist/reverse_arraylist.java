import java.util.ArrayList;

public class reverse_arraylist {
    public static ArrayList<Integer> reverse(ArrayList<Integer>list){
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            result.add(list.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println("reverse list");
        System.out.println(reverse(list));
    }
}
