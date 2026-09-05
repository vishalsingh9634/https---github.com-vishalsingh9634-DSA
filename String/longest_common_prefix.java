public class longest_common_prefix {
   public static String longestCommonPrefix(String str[]){
    String prefix=str[0];
    for(int i=1;i<str.length;i++){
        while(!str[i].startsWith(prefix)){
            prefix=prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty()){
                return "";
            }
        }
    }
    return prefix;
   }
     public static void main(String[] args) {
        String[] str = {"flowers", "flow", "fly", "flight"};
        System.out.println(longestCommonPrefix(str));
    }
    
}
