import java.util.*;
public class createlist{
    public static int getelement(ArrayList<Integer> list) {
        System.out.println("get Element of index 2:");
        return list.get(2);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("enter the size of arraylist :");
        int n=sc.nextInt();
        System.out.println("enter the number :");

        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            list.add(element);
        }
        System.out.println(list);
        System.out.println(getelement(list));
    }
}