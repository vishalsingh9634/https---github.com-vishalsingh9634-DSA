public class largest_odd_no {
    public static String largest_odd(String s){
        int end=s.length()-1;
        while(end>0){
            int digit=s.charAt(end);
            if(digit%2==1){
                break;
            }
            end--;
            if(end<0){
                return "";
            }            
        }
        int start=0;
            while(s.charAt(start)=='0'){
                start++;
            }
            return s.substring(start,end+1);
    }
    public static void main(String[] args) {
        String s ="0214638";
        System.out.println(largest_odd(s));
    }
}

