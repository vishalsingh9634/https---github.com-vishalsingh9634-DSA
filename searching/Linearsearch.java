class Linearsearch{
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 3;
        int n = arr.length;
        boolean found = false;
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                found = true;
                System.out.println("Element found at index: " + i);
                break;
            }
        }        if(!found){
            System.out.println("Element not found in the array");
        }
    }
}