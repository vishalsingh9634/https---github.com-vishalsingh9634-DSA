public class q1 {
    public static int sum(int num){
        int sum=0;
        while(num>0){
            sum=sum+(num%10);
            num=num/10;
            
        }
        return sum;
    }

    public static int reverse(int num){
        int revnum=0;
        while (num>0) {
           revnum=revnum*10+num%10;
           num=num/10;
        }
        return revnum;
    }
    public static int countevendigit(int num){
        int count=0;
        while (num>0) {
           int ld=num%10;
            if(ld%2==0){                
                count++;
            }
            num=num/10;
        }
        return  count;
    }

    public static int palindrom(int num){
        int n=num;
        int reverse=0;
        while (num>0) {
            reverse=reverse*10+num%10;
            num=num/10;
            
        }
        if(n==reverse){
                System.out.println("palindrom");
            }
            else{
                System.out.println("Not palindrom");
            }
        return num;
    }

    public static boolean isprime(int num){
    if(num<2){
        return false;
    }
    int count = 0;
    for(int i=2;i<=num/2;i++){
        if(num%i==0){
            count++;
        }
        
    }
    return count == 0;

}
    public static void armstrongno(int num){
        int original=num;
        int power=0;
        int temp=num;
        int sum=0;
        while(temp>0){
            power++;
            temp=temp/10;
        }
        temp =num;
        while (temp>0) {
            int digit=temp%10;
            sum+=Math.pow(digit,power);
            
            temp=temp/10;
            
        }
        if(sum==original){
            System.out.println("number is armstrong :"+original);
        }
        else{
            System.out.println("number is not armstrong :"+original);
        }

    }

    public static void main(String[] args) {
            int sum=sum(1234);
           System.out.println(sum);

           int num=reverse(456);
           System.out.println(num);

           int count=countevendigit(24853);
           System.out.println(count);

           palindrom(1221);

           boolean flag =isprime(num);
            System.out.println(flag);

            armstrongno(371);
            
	}
}

