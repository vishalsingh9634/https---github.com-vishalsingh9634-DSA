public class reverse_sentence{
    public static String reverse(String s){
        String word[]=s.trim().split("\\s+");
        String res="";
        for(int i=word.length-1;i>=0;i--){
            res+=word[i];
            if(i!=0){
                res+=" ";
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s="welcome to the jungle";
        System.out.println(reverse(s));
    }
}