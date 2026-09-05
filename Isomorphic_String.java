public class Isomorphic_String{
public static boolean isomorphic(String s,String t){
    if(s.length()!=t.length()){
        return false;
    }
        int []map1=new int[256];
        int []map2=new int [256];
    for(int i=0;i<s.length();i++){
        char s1=s.charAt(i);
        char t1=t.charAt(i);
        if(map1[s1]!=map2[t1]){
            return false;
        }
        map1[s1]=i+1;
        map2[t1]=i+1;
    }
    return true;
}
public static void main(String args[]){
    String s="egg";
    String t="add";
    System.out.println(isomorphic(s, t));
    }
}