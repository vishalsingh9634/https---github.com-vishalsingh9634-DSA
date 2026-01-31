public class insertionsort {
        public static void main(String[]args){
            int arr[] ={5,8,2,3,7};
            int n=arr.length;
            for(int i=1;i<n;i++){
                int key = arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;

            }
            for(int x: arr){
                System.out.print(x +" ");
            }
        }
    }

